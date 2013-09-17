package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A two- or three-dimensional coordinate system that consists of any
 * combination of coordinate axes not covered by any other coordinate system
 * type. An example is a multilinear coordinate system which contains one
 * coordinate axis that may have any 1-D shape which has no intersections with
 * itself. This non-straight axis is supplemented by one or two straight axes to
 * complete a 2 or 3 dimensional coordinate system. The non-straight axis is
 * typically incrementally straight or curved. A UserDefinedCS shall have two or
 * three usesAxis associations.
 * <p/>
 * <p>Java class for UserDefinedCSType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="UserDefinedCSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateSystemType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedCSType")
public class UserDefinedCSType
  extends AbstractCoordinateSystemType {
}
