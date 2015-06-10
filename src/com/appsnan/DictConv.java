/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsnan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author szabo1nando612
 */
public class DictConv
  {

    static private String errorText;
    static private FileReader fr = null;

    private enum lineProcessingStateEnum
      {

        INITIAL, INATTRIBUTE
      };
    static private lineProcessingStateEnum lineProcessingState = lineProcessingStateEnum.INITIAL;

    static private RadiusAttribute currentRadiusAttribute = new RadiusAttribute();

    static private ArrayList<RadiusAttribute> radiusAttributeArrayList = new ArrayList<RadiusAttribute>();

    static private void processLine(String line)
      {
        String startstring;
        String endstring;

        //System.out.println(line);
        switch (lineProcessingState)
          {
            case INITIAL: //we are not in attribute definition, initial state
                //    MT-ADDITIONAL-ANNOUNCEMENT/
                startstring = "    ";
                if (line.startsWith(startstring))
                  {
                    endstring = "/";
                    if (line.endsWith(endstring))
                      {
                        String attributeName = line.substring(startstring.length());
                        attributeName = attributeName.substring(0, (attributeName.length() - endstring.length()));
                        currentRadiusAttribute.clearAttributes();
                        System.out.println("\nattribute start: " + attributeName);

                        lineProcessingState = lineProcessingStateEnum.INATTRIBUTE;
                        break;
                      }
                  }
                break;

            case INATTRIBUTE: //we are in attribute definition section
                //	Name = MT-ADDITIONAL-ANNOUNCEMENT
                startstring = "	Name = ";
                if (line.startsWith(startstring))
                  {
                    String name = line.substring(startstring.length());
                    currentRadiusAttribute.setName(name);
                    System.out.println("name: " + name);
//                    System.out.println(ra.toString());
                    break;
                  }

                //	Description = "Magyar Telekom marketing announcement"
                startstring = "	Description = \"";
                if (line.startsWith(startstring))
                  {
                    endstring = "\"";
                    if (line.endsWith(endstring))
                      {
                        String description = line.substring(startstring.length());
                        description = description.substring(0, (description.length() - endstring.length()));
                        currentRadiusAttribute.setDescription(description);
                        System.out.println("description: " + description);
//                        System.out.println(ra.toString());
                        break;
                      }
                  }

                //	SubAttribute = 63
                startstring = "	SubAttribute = ";
                if (line.startsWith(startstring))
                  {
                    String subAttribute = line.substring(startstring.length());

                    try
                      {
                        int value = Integer.parseInt(subAttribute);
                      } catch (NumberFormatException e)
                      {
                        errorText = "Cannot string convert to integer: " + subAttribute;
                        Logger.getLogger(DictConv.class.getName()).log(Level.SEVERE, errorText);
                        System.exit(1);
                        break;
                      }

                    currentRadiusAttribute.setSubAttribute(subAttribute);
                    System.out.println("subAttribute: " + subAttribute);
//                    System.out.println(ra.toString());
                    break;
                  }

                //	Type = string
                startstring = "	Type = ";
                if (line.startsWith(startstring))
                  {
                    String type = line.substring(startstring.length());
                    type = type.toLowerCase();
                    switch (type)
                      {
                        case "string":
                            currentRadiusAttribute.setType(RadiusAttribute.typeEnum.STRING);
                            break;

                        case "uint32":
                            currentRadiusAttribute.setType(RadiusAttribute.typeEnum.UINT32);
                            break;

                        default:
                            errorText = "Unknown type: " + type;
                            Logger.getLogger(DictConv.class.getName()).log(Level.SEVERE, errorText);
                            System.exit(1);
                            break;
                      }

                    System.out.println("type: " + type);
//                    System.out.println(ra.toString());
                    break;
                  }

                //	Min = 0
                startstring = "	Min = ";
                if (line.startsWith(startstring))
                  {
                    String min = line.substring(startstring.length());
                    currentRadiusAttribute.setMin(min);
                    System.out.println("min: " + min);
//                    System.out.println(ra.toString());
                    break;
                  }

                //	Max = 2
                startstring = "	Max = ";
                if (line.startsWith(startstring))
                  {
                    String max = line.substring(startstring.length());
                    currentRadiusAttribute.setMax(max);
                    System.out.println("max: " + max);
//                    System.out.println(ra.toString());
                    break;
                  }

                //    MT-ADDITIONAL-ANNOUNCEMENT/
                //  The next attributes definitions begins here
                startstring = "    ";
                if (line.startsWith(startstring))
                  {
                    endstring = "/";
                    if (line.endsWith(endstring))
                      {
                        radiusAttributeArrayList.add(currentRadiusAttribute);
                        System.out.println(currentRadiusAttribute.toString());
                        System.out.println("Number of processed attributes: " + radiusAttributeArrayList.size());
                        currentRadiusAttribute = new RadiusAttribute();

                        //System.out.println(radiusAttributeArrayList.toString());
                        String attributeName = line.substring(startstring.length());
                        attributeName = attributeName.substring(0, (attributeName.length() - endstring.length()));
                        System.out.println("\nattribute start: " + attributeName);
                      }
                  }

                break;
          }

      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        if (args.length == 0)
          {
            System.out.println("Usage:");
            System.out.println("First command line parameter: dictionary attributes file from Cisco Access Registrar");
            System.exit(1);
          }

        String inputfilename = args[0];
        System.out.println("Processing...");
        System.out.println("input file: " + inputfilename);

        try
          {
            fr = new FileReader(inputfilename);
          } catch (FileNotFoundException ex)
          {
            errorText = "Input file opening failed";
            Logger.getLogger(DictConv.class.getName()).log(Level.SEVERE, errorText, ex);
            System.exit(1);
          }

        BufferedReader textReader = new BufferedReader(fr);

        radiusAttributeArrayList.clear();

        System.out.println("\nParsing input file...");
        String line;
        try
          {
            while ((line = textReader.readLine()) != null)
              {
                processLine(line);
              }
          } catch (IOException ex)
          {
            errorText = "Input file reading failed";
            Logger.getLogger(DictConv.class.getName()).log(Level.SEVERE, errorText, ex);
            System.exit(1);
          }

        if (currentRadiusAttribute.isNull() == false)
          {
            radiusAttributeArrayList.add(currentRadiusAttribute);
            System.out.println(currentRadiusAttribute.toString());
            System.out.println("Number of processed attributes: " + radiusAttributeArrayList.size());
          }

        System.out.println("\nExporting to Freeradius format...");

        for (RadiusAttribute ra : radiusAttributeArrayList)
          {
            System.out.println(ra.getFreRadiusAttributeFormat());
          }

        System.out.println("\n Exporting to Freeradius format sorted by attribute value...");
        System.out.println("#\n# Generated from CAR dictionary dump file: ");
        System.out.println("# input filename: " + inputfilename);

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println("# generated at: " + formatter.format(date));

        DictConv dc = new DictConv();
        System.out.println("# number of generated attributes: " + radiusAttributeArrayList.size());
        System.out.println("# generated by: " + dc.getClass().getName() + "\n#");

        ArrayList<RadiusAttribute> sortedRadiusAttributeArrayList = (ArrayList<RadiusAttribute>) radiusAttributeArrayList.clone();

        Collections.sort(sortedRadiusAttributeArrayList);

        for (RadiusAttribute ra : sortedRadiusAttributeArrayList)
          {
            System.out.println(ra.getFreRadiusAttributeFormat());
          }

      }

  }
