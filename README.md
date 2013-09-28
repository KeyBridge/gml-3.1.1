#  OGC&reg; Geography Markup Language (GML) 

## About
This is a Java compiled implementation of Geography Markup Language (GML), an XML
grammar defined by the Open Geospatial Consortium (OGC).

Software comports with GML version 3.1.1 (2012-07-21)

The package is formatted and provided as a NetBeans project.

The Geography Markup Language (GML) is the XML grammar defined by the Open Geospatial Consortium (OGC) to express geographical features. GML serves as a modeling language for geographic systems as well as an open interchange format for geographic transactions on the Internet. Note that the concept of feature in GML is a very general one and includes not only conventional "vector" or discrete objects, but also coverages (see also GMLJP2) and sensor data. The ability to integrate all forms of geographic information is key to the utility of GML.

As with most XML based grammars, there are two parts to the grammar – the schema that describes the document and the instance document that contains the actual data.

A GML document is described using a GML Schema. This allows users and developers to describe generic geographic data sets that contain points, lines and polygons. However, the developers of GML envision communities working to define community-specific application schemas [en.wikipedia.org/wiki/GML_Application_Schemas] that are specialized extensions of GML. Using application schemas, users can refer to roads, highways, and bridges instead of points, lines and polygons. If everyone in a community agrees to use the same schemas they can exchange data easily and be sure that a road is still a road when they view it. 

Clients and servers with interfaces that implement the OpenGIS&reg; Web Feature Service Interface Standard[http://www.opengeospatial.org/standards/wfs] read and write GML data. 

GML is also an ISO standard (ISO 19136:2007) [www.iso.org/iso/iso_catalogue/catalogue_tc/catalogue_detail.htm?csnumber=32554]. 

See also the GML pages on OGC Network: http://www.ogcnetwork.net/gml.

## Alternatives

This project exists to provide a standards-based serializable GML
implementation. As such we have not spent a tremendous amount of time
extending the basic bean containers with data-handling functionality. 

If you need a comprehensive and fully-functional GML class library 
you might have better luck using GeoTools, The Open Source Java GIS Toolkit,
which includes a GML implementation that supports easy convertion to and from 
JTS Geometry objects.

> http://www.geotools.org/

## References / Requires

Download the specifications and XSD files yourself at:

> http://www.opengeospatial.org/standards/gml#downloads


GML dependencies include W3C xlink and W3C SMIL. Both of these are included 
within this project source tree to simplify compilation but may be extracted
by you into another class library if desired.

- org.w3._1999.xlink (Attribute group, complex type and simple type definitions)
-- Implemented: http://www.w3.org/1999/xlink.xsd
-- Latest Version: http://www.w3.org/XML/2008/06/xlink.xsd
-  org.w3._2001.smil20 (Synchronized Multimedia Integration Language)
-- Latest is 3.0 at http://www.w3.org/TR/smil/

## License

  Apache License, Version 2.0

>  Copyright (C) 2013 Caulfield IP Holdings (Caulfield) and/or its affiliates.
>
>   Licensed under the Apache License, Version 2.0 (the "License");
>   you may not use this file except in compliance with the License.
>   You may obtain a copy of the License at
>
>       http://www.apache.org/licenses/LICENSE-2.0
>
>   Unless required by applicable law or agreed to in writing, software
>   distributed under the License is distributed on an "AS IS" BASIS,
>   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
>   See the License for the specific language governing permissions and
>   limitations under the License.

__END
