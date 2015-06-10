/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appsnan;

/**
 *
 * @author szabo1nando612
 */
public class RadiusAttribute implements Comparable<Object>
  {

    private String name;
    private String description;
    private String subAttribute;

    @Override
    public int compareTo(Object o)
      {
        //Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
        RadiusAttribute objectToCompare=(RadiusAttribute)o;
          if (Integer.parseInt(subAttribute)<Integer.parseInt(objectToCompare.getSubAttribute()))
            {
              return -1;
            }
          if (Integer.parseInt(subAttribute)>Integer.parseInt(objectToCompare.getSubAttribute()))
            {
              return 1;
            }
          return 0;
      }

    public enum typeEnum
      {

        STRING, UINT32
      };

    private typeEnum type;

    private String min;
    private String max;

    public void setName(String name)
      {
        this.name = name;
      }

    public void setDescription(String Description)
      {
        this.description = Description;
      }

    public void setSubAttribute(String subAttribute)
      {
        this.subAttribute = subAttribute;
      }

    public void setType(typeEnum type)
      {
        this.type = type;
      }

    public void setMin(String min)
      {
        this.min = min;
      }

    public void setMax(String max)
      {
        this.max = max;
      }

    public String getName()
      {
        return name;
      }

    public String getDescription()
      {
        return description;
      }

    public String getSubAttribute()
      {
        return subAttribute;
      }

    public typeEnum getType()
      {
        return type;
      }

    public String getMin()
      {
        return min;
      }

    public String getMax()
      {
        return max;
      }

    public void clearAttributes()
      {
        name = null;
        description = null;
        subAttribute = null;
        type = null;
        min = null;
        max = null;
      }

    public boolean isNull()
      {
        if ((name == null) && (description == null) && (subAttribute == null) && (type == null) && (min == null) && (max == null))
          {
            return true;
          }
        return false;
      }

    public String getFreRadiusAttributeFormat()
      {

        //ATTRIBUTE	MT-UID	1	string
        //ATTRIBUTE	MT-VSA	8	string        String typeFreeRadiusFormat;
        String typeFreeRadiusFormat;

        switch (type)
          {
            case STRING:
                typeFreeRadiusFormat = "string";
                break;
            case UINT32:
                typeFreeRadiusFormat = "integer";
                break;
            default:
                typeFreeRadiusFormat = "undefined";
                break;
          }
        
        String descriptionFreeRadiusFormat="";
          if (description!=null)
            {
              descriptionFreeRadiusFormat="\t\t\t\t# " + description;
            }

        return "ATTRIBUTE	" + name + "\t" + subAttribute + "\t" + typeFreeRadiusFormat + descriptionFreeRadiusFormat;
      }

    @Override
    public String toString()
      {
        return "RadiusAttribute{" + "name=" + name + ", description=" + description + ", subAttribute=" + subAttribute + ", type=" + type + ", min=" + min + ", max=" + max + '}';
      }

    
    
  }
