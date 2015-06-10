Cisco Access Registrar-ban így lehet file-ba kiexportálni egy adott dictionary tartalmát file-ba:

aregcmd -s ls -R "/Radius/Advanced/Attribute Dictionary/Vendor-Specific/Vendors/MagyarTelekom/SubAttribute Dictionary" > MT-attrs.lst

Ezt a file-t tudja átalakítani freeradius formátumu radius attributumlistára ez a java program.

használata:
DictConv.class 20150609_MT_attrs_hybrid_bovitessel.lst

példa kimenet:

Processing...
input file: C:\Users\szabo1nando612\Documents\nandi\dokumentumok\AAA\MT_attributes\20150609_MT_attrs_hybrid_bovitessel.lst

Parsing input file...

attribute start: MT-ACCESS-TYPE
name: MT-ACCESS-TYPE
description: Magyar Telekom Access technology type from AAA1 (NSP), like: ADSL or VDSL
subAttribute: 79
type: string
min: 0
max: 10
RadiusAttribute{name=MT-ACCESS-TYPE, description=Magyar Telekom Access technology type from AAA1 (NSP), like: ADSL or VDSL, subAttribute=79, type=STRING, min=0, max=10}
Number of processed attributes: 1

attribute start: MT-ADDITIONAL-ANNOUNCEMENT
name: MT-ADDITIONAL-ANNOUNCEMENT
description: Magyar Telekom marketing announcement
subAttribute: 63
type: string
min: 0
max: 253
RadiusAttribute{name=MT-ADDITIONAL-ANNOUNCEMENT, description=Magyar Telekom marketing announcement, subAttribute=63, type=STRING, min=0, max=253}
Number of processed attributes: 2

attribute start: MT-AUTHE-REQTYPE
name: MT-AUTHE-REQTYPE
description: Magyar Telekom 0:registration, 1:call-setup, 2:reauthentication
subAttribute: 56
type: uint32
min: 0
max: 2
RadiusAttribute{name=MT-AUTHE-REQTYPE, description=Magyar Telekom 0:registration, 1:call-setup, 2:reauthentication, subAttribute=56, type=UINT32, min=0, max=2}
Number of processed attributes: 3

attribute start: MT-CGPA
name: MT-CGPA
description: Magyar Telekom PSTN calling number without modification
subAttribute: 51
type: string
min: 0
max: 40
RadiusAttribute{name=MT-CGPA, description=Magyar Telekom PSTN calling number without modification, subAttribute=51, type=STRING, min=0, max=40}
Number of processed attributes: 4

attribute start: MT-CREDIT
name: MT-CREDIT
description: Magyar Telekom prepaid user balance (financial)
subAttribute: 65
type: string
min: 0
max: 40
RadiusAttribute{name=MT-CREDIT, description=Magyar Telekom prepaid user balance (financial), subAttribute=65, type=STRING, min=0, max=40}
Number of processed attributes: 5

attribute start: MT-CURRENCY
name: MT-CURRENCY
description: Magyar Telekom 0:HUF, 1:EUR
subAttribute: 66
type: uint32
min: 0
max: 2
RadiusAttribute{name=MT-CURRENCY, description=Magyar Telekom 0:HUF, 1:EUR, subAttribute=66, type=UINT32, min=0, max=2}
Number of processed attributes: 6

attribute start: MT-DOMAIN
name: MT-DOMAIN
description: Magyar Telekom source system [IMS|PSTN]
subAttribute: 53
type: string
min: 0
max: 40
RadiusAttribute{name=MT-DOMAIN, description=Magyar Telekom source system [IMS|PSTN], subAttribute=53, type=STRING, min=0, max=40}
Number of processed attributes: 7

attribute start: MT-EXPIRE-DATE
name: MT-EXPIRE-DATE
description: Magyar Telekom exp. date in YYYYMMDD format
subAttribute: 68
type: string
min: 0
max: 40
RadiusAttribute{name=MT-EXPIRE-DATE, description=Magyar Telekom exp. date in YYYYMMDD format, subAttribute=68, type=STRING, min=0, max=40}
Number of processed attributes: 8

attribute start: MT-FIRST-CALL-FLAG
name: MT-FIRST-CALL-FLAG
description: Magyar Telekom 0:registered, 1:first registration
subAttribute: 55
type: uint32
min: 0
max: 1
RadiusAttribute{name=MT-FIRST-CALL-FLAG, description=Magyar Telekom 0:registered, 1:first registration, subAttribute=55, type=UINT32, min=0, max=1}
Number of processed attributes: 9

attribute start: MT-FLAG-CEAME
name: MT-FLAG-CEAME
description: Magyar Telekom 0:do not send, 1:send voice message
subAttribute: 67
type: uint32
min: 0
max: 2
RadiusAttribute{name=MT-FLAG-CEAME, description=Magyar Telekom 0:do not send, 1:send voice message, subAttribute=67, type=UINT32, min=0, max=2}
Number of processed attributes: 10

attribute start: MT-GRANTED-FLAG
name: MT-GRANTED-FLAG
description: Magyar Telekom last period flag
subAttribute: 62
type: uint32
min: 0
max: 1
RadiusAttribute{name=MT-GRANTED-FLAG, description=Magyar Telekom last period flag, subAttribute=62, type=UINT32, min=0, max=1}
Number of processed attributes: 11

attribute start: MT-GRANTED-TIME
name: MT-GRANTED-TIME
description: Magyar Telekom interim interval or allowed session time based on granted algorithm
subAttribute: 61
type: uint32
min: 0
max: 2222222
RadiusAttribute{name=MT-GRANTED-TIME, description=Magyar Telekom interim interval or allowed session time based on granted algorithm, subAttribute=61, type=UINT32, min=0, max=2222222}
Number of processed attributes: 12

attribute start: MT-LANGUAGE-ID
name: MT-LANGUAGE-ID
description: Magyar Telekom language ID
subAttribute: 64
type: uint32
min: 0
max: 255
RadiusAttribute{name=MT-LANGUAGE-ID, description=Magyar Telekom language ID, subAttribute=64, type=UINT32, min=0, max=255}
Number of processed attributes: 13

attribute start: MT-LINE-SERVICE
name: MT-LINE-SERVICE
description: Magyar Telekom Registered service for the line in AAA1 (NSP), like: FON or IPTV or VOIP or HA, multiple instances allowed
subAttribute: 80
type: string
min: 0
max: 10
RadiusAttribute{name=MT-LINE-SERVICE, description=Magyar Telekom Registered service for the line in AAA1 (NSP), like: FON or IPTV or VOIP or HA, multiple instances allowed, subAttribute=80, type=STRING, min=0, max=10}
Number of processed attributes: 14

attribute start: MT-ORIGINATING-ID
name: MT-ORIGINATING-ID
description: Magyar Telekom SS originating ID
subAttribute: 3
type: string
min: 0
max: 40
RadiusAttribute{name=MT-ORIGINATING-ID, description=Magyar Telekom SS originating ID, subAttribute=3, type=STRING, min=0, max=40}
Number of processed attributes: 15

attribute start: MT-PERMISSION-ACCOUNT-QUERY
name: MT-PERMISSION-ACCOUNT-QUERY
description: Magyar Telekom 0:not allowed, 1:allowed
subAttribute: 71
type: uint32
min: 0
max: 1
RadiusAttribute{name=MT-PERMISSION-ACCOUNT-QUERY, description=Magyar Telekom 0:not allowed, 1:allowed, subAttribute=71, type=UINT32, min=0, max=1}
Number of processed attributes: 16

attribute start: MT-PERMISSION-LANGUAGE-CHANGE
name: MT-PERMISSION-LANGUAGE-CHANGE
description: Magyar Telekom 0:not allowed, 1:allowed
subAttribute: 72
type: uint32
min: 0
max: 1
RadiusAttribute{name=MT-PERMISSION-LANGUAGE-CHANGE, description=Magyar Telekom 0:not allowed, 1:allowed, subAttribute=72, type=UINT32, min=0, max=1}
Number of processed attributes: 17

attribute start: MT-PERMISSION-PIN-CHANGE
name: MT-PERMISSION-PIN-CHANGE
description: Magyar Telekom 0:not allowed, 1:allowed
subAttribute: 70
type: uint32
min: 0
max: 1
RadiusAttribute{name=MT-PERMISSION-PIN-CHANGE, description=Magyar Telekom 0:not allowed, 1:allowed, subAttribute=70, type=UINT32, min=0, max=1}
Number of processed attributes: 18

attribute start: MT-PERMISSION-RECHARGE
name: MT-PERMISSION-RECHARGE
description: Magyar Telekom 0:not allowed, 1:allowed
subAttribute: 74
type: uint32
min: 0
max: 1
RadiusAttribute{name=MT-PERMISSION-RECHARGE, description=Magyar Telekom 0:not allowed, 1:allowed, subAttribute=74, type=UINT32, min=0, max=1}
Number of processed attributes: 19

attribute start: MT-PERMISSION-SERVICE-CENTER
name: MT-PERMISSION-SERVICE-CENTER
description: Magyar Telekom 0:not allowed, 1:allowed
subAttribute: 73
type: uint32
min: 0
max: 1
RadiusAttribute{name=MT-PERMISSION-SERVICE-CENTER, description=Magyar Telekom 0:not allowed, 1:allowed, subAttribute=73, type=UINT32, min=0, max=1}
Number of processed attributes: 20

attribute start: MT-PROFILE-ID
name: MT-PROFILE-ID
description: Magyar Telekom AAA profile ID (rating profile)
subAttribute: 58
type: uint32
min: 0
max: 2222222
RadiusAttribute{name=MT-PROFILE-ID, description=Magyar Telekom AAA profile ID (rating profile), subAttribute=58, type=UINT32, min=0, max=2222222}
Number of processed attributes: 21

attribute start: MT-SERVICE-ACCESS-NUMBER
name: MT-SERVICE-ACCESS-NUMBER
description: Magyar Telekom PSTN dial-in number
subAttribute: 54
type: string
min: 0
max: 40
RadiusAttribute{name=MT-SERVICE-ACCESS-NUMBER, description=Magyar Telekom PSTN dial-in number, subAttribute=54, type=STRING, min=0, max=40}
Number of processed attributes: 22

attribute start: MT-SERVICE-CENTER-NUMBER
name: MT-SERVICE-CENTER-NUMBER
description: Magyar Telekom calling number of the helpdesk
subAttribute: 75
type: string
min: 0
max: 40
RadiusAttribute{name=MT-SERVICE-CENTER-NUMBER, description=Magyar Telekom calling number of the helpdesk, subAttribute=75, type=STRING, min=0, max=40}
Number of processed attributes: 23

attribute start: MT-SERVICE-ID
name: MT-SERVICE-ID
description: Magyar Telekom service ID
subAttribute: 10
type: uint32
min: 0
max: 255
RadiusAttribute{name=MT-SERVICE-ID, description=Magyar Telekom service ID, subAttribute=10, type=UINT32, min=0, max=255}
Number of processed attributes: 24

attribute start: MT-SSPID
name: MT-SSPID
description: Magyar Telekom PSTN node identifier
subAttribute: 57
type: string
min: 0
max: 40
RadiusAttribute{name=MT-SSPID, description=Magyar Telekom PSTN node identifier, subAttribute=57, type=STRING, min=0, max=40}
Number of processed attributes: 25

attribute start: MT-TERMINATING-ID
name: MT-TERMINATING-ID
description: Magyar Telekom SS terminating ID
subAttribute: 4
type: string
min: 0
max: 40
RadiusAttribute{name=MT-TERMINATING-ID, description=Magyar Telekom SS terminating ID, subAttribute=4, type=STRING, min=0, max=40}
Number of processed attributes: 26

attribute start: MT-UID
name: MT-UID
description: Magyar Telekom DSL User ID
subAttribute: 1
type: string
min: 0
max: 253
RadiusAttribute{name=MT-UID, description=Magyar Telekom DSL User ID, subAttribute=1, type=STRING, min=0, max=253}
Number of processed attributes: 27

attribute start: MT-User-Status
name: MT-User-Status
description: Magyar Telekom User status
subAttribute: 69
type: uint32
min: 0
max: 255
RadiusAttribute{name=MT-User-Status, description=Magyar Telekom User status, subAttribute=69, type=UINT32, min=0, max=255}
Number of processed attributes: 28

attribute start: MT-VSA
name: MT-VSA
description: Magyar Telekom MT-VSA 2 Cisco-AVPair
subAttribute: 8
type: string
min: 0
max: 253
RadiusAttribute{name=MT-VSA, description=Magyar Telekom MT-VSA 2 Cisco-AVPair, subAttribute=8, type=STRING, min=0, max=253}
Number of processed attributes: 29

attribute start: MT-WARNING-CREDIT
name: MT-WARNING-CREDIT
description: Magyar Telekom sent only if the limit is reached
subAttribute: 77
type: string
min: 0
max: 40
RadiusAttribute{name=MT-WARNING-CREDIT, description=Magyar Telekom sent only if the limit is reached, subAttribute=77, type=STRING, min=0, max=40}
Number of processed attributes: 30

attribute start: MT-WARNING-PERIOD
name: MT-WARNING-PERIOD
description: Magyar Telekom sent only if the limit is reached (in days)
subAttribute: 76
type: string
min: 0
max: 40
RadiusAttribute{name=MT-WARNING-PERIOD, description=Magyar Telekom sent only if the limit is reached (in days), subAttribute=76, type=STRING, min=0, max=40}
Number of processed attributes: 31

attribute start: MTisLNS
name: MTisLNS
description: Magyar Telekom Radius attribute for modified BVA session management
subAttribute: 78
type: uint32
min: 0
max: 253
RadiusAttribute{name=MTisLNS, description=Magyar Telekom Radius attribute for modified BVA session management, subAttribute=78, type=UINT32, min=0, max=253}
Number of processed attributes: 32

Exporting to Freeradius format...
ATTRIBUTE	MT-ACCESS-TYPE	79	string				# Magyar Telekom Access technology type from AAA1 (NSP), like: ADSL or VDSL
ATTRIBUTE	MT-ADDITIONAL-ANNOUNCEMENT	63	string				# Magyar Telekom marketing announcement
ATTRIBUTE	MT-AUTHE-REQTYPE	56	integer				# Magyar Telekom 0:registration, 1:call-setup, 2:reauthentication
ATTRIBUTE	MT-CGPA	51	string				# Magyar Telekom PSTN calling number without modification
ATTRIBUTE	MT-CREDIT	65	string				# Magyar Telekom prepaid user balance (financial)
ATTRIBUTE	MT-CURRENCY	66	integer				# Magyar Telekom 0:HUF, 1:EUR
ATTRIBUTE	MT-DOMAIN	53	string				# Magyar Telekom source system [IMS|PSTN]
ATTRIBUTE	MT-EXPIRE-DATE	68	string				# Magyar Telekom exp. date in YYYYMMDD format
ATTRIBUTE	MT-FIRST-CALL-FLAG	55	integer				# Magyar Telekom 0:registered, 1:first registration
ATTRIBUTE	MT-FLAG-CEAME	67	integer				# Magyar Telekom 0:do not send, 1:send voice message
ATTRIBUTE	MT-GRANTED-FLAG	62	integer				# Magyar Telekom last period flag
ATTRIBUTE	MT-GRANTED-TIME	61	integer				# Magyar Telekom interim interval or allowed session time based on granted algorithm
ATTRIBUTE	MT-LANGUAGE-ID	64	integer				# Magyar Telekom language ID
ATTRIBUTE	MT-LINE-SERVICE	80	string				# Magyar Telekom Registered service for the line in AAA1 (NSP), like: FON or IPTV or VOIP or HA, multiple instances allowed
ATTRIBUTE	MT-ORIGINATING-ID	3	string				# Magyar Telekom SS originating ID
ATTRIBUTE	MT-PERMISSION-ACCOUNT-QUERY	71	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-LANGUAGE-CHANGE	72	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-PIN-CHANGE	70	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-RECHARGE	74	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-SERVICE-CENTER	73	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PROFILE-ID	58	integer				# Magyar Telekom AAA profile ID (rating profile)
ATTRIBUTE	MT-SERVICE-ACCESS-NUMBER	54	string				# Magyar Telekom PSTN dial-in number
ATTRIBUTE	MT-SERVICE-CENTER-NUMBER	75	string				# Magyar Telekom calling number of the helpdesk
ATTRIBUTE	MT-SERVICE-ID	10	integer				# Magyar Telekom service ID
ATTRIBUTE	MT-SSPID	57	string				# Magyar Telekom PSTN node identifier
ATTRIBUTE	MT-TERMINATING-ID	4	string				# Magyar Telekom SS terminating ID
ATTRIBUTE	MT-UID	1	string				# Magyar Telekom DSL User ID
ATTRIBUTE	MT-User-Status	69	integer				# Magyar Telekom User status
ATTRIBUTE	MT-VSA	8	string				# Magyar Telekom MT-VSA 2 Cisco-AVPair
ATTRIBUTE	MT-WARNING-CREDIT	77	string				# Magyar Telekom sent only if the limit is reached
ATTRIBUTE	MT-WARNING-PERIOD	76	string				# Magyar Telekom sent only if the limit is reached (in days)
ATTRIBUTE	MTisLNS	78	integer				# Magyar Telekom Radius attribute for modified BVA session management

Exporting to Freeradius format sorted by attribute value...
ATTRIBUTE	MT-UID	1	string				# Magyar Telekom DSL User ID
ATTRIBUTE	MT-ORIGINATING-ID	3	string				# Magyar Telekom SS originating ID
ATTRIBUTE	MT-TERMINATING-ID	4	string				# Magyar Telekom SS terminating ID
ATTRIBUTE	MT-VSA	8	string				# Magyar Telekom MT-VSA 2 Cisco-AVPair
ATTRIBUTE	MT-SERVICE-ID	10	integer				# Magyar Telekom service ID
ATTRIBUTE	MT-CGPA	51	string				# Magyar Telekom PSTN calling number without modification
ATTRIBUTE	MT-DOMAIN	53	string				# Magyar Telekom source system [IMS|PSTN]
ATTRIBUTE	MT-SERVICE-ACCESS-NUMBER	54	string				# Magyar Telekom PSTN dial-in number
ATTRIBUTE	MT-FIRST-CALL-FLAG	55	integer				# Magyar Telekom 0:registered, 1:first registration
ATTRIBUTE	MT-AUTHE-REQTYPE	56	integer				# Magyar Telekom 0:registration, 1:call-setup, 2:reauthentication
ATTRIBUTE	MT-SSPID	57	string				# Magyar Telekom PSTN node identifier
ATTRIBUTE	MT-PROFILE-ID	58	integer				# Magyar Telekom AAA profile ID (rating profile)
ATTRIBUTE	MT-GRANTED-TIME	61	integer				# Magyar Telekom interim interval or allowed session time based on granted algorithm
ATTRIBUTE	MT-GRANTED-FLAG	62	integer				# Magyar Telekom last period flag
ATTRIBUTE	MT-ADDITIONAL-ANNOUNCEMENT	63	string				# Magyar Telekom marketing announcement
ATTRIBUTE	MT-LANGUAGE-ID	64	integer				# Magyar Telekom language ID
ATTRIBUTE	MT-CREDIT	65	string				# Magyar Telekom prepaid user balance (financial)
ATTRIBUTE	MT-CURRENCY	66	integer				# Magyar Telekom 0:HUF, 1:EUR
ATTRIBUTE	MT-FLAG-CEAME	67	integer				# Magyar Telekom 0:do not send, 1:send voice message
ATTRIBUTE	MT-EXPIRE-DATE	68	string				# Magyar Telekom exp. date in YYYYMMDD format
ATTRIBUTE	MT-User-Status	69	integer				# Magyar Telekom User status
ATTRIBUTE	MT-PERMISSION-PIN-CHANGE	70	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-ACCOUNT-QUERY	71	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-LANGUAGE-CHANGE	72	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-SERVICE-CENTER	73	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-PERMISSION-RECHARGE	74	integer				# Magyar Telekom 0:not allowed, 1:allowed
ATTRIBUTE	MT-SERVICE-CENTER-NUMBER	75	string				# Magyar Telekom calling number of the helpdesk
ATTRIBUTE	MT-WARNING-PERIOD	76	string				# Magyar Telekom sent only if the limit is reached (in days)
ATTRIBUTE	MT-WARNING-CREDIT	77	string				# Magyar Telekom sent only if the limit is reached
ATTRIBUTE	MTisLNS	78	integer				# Magyar Telekom Radius attribute for modified BVA session management
ATTRIBUTE	MT-ACCESS-TYPE	79	string				# Magyar Telekom Access technology type from AAA1 (NSP), like: ADSL or VDSL
ATTRIBUTE	MT-LINE-SERVICE	80	string				# Magyar Telekom Registered service for the line in AAA1 (NSP), like: FON or IPTV or VOIP or HA, multiple instances allowed