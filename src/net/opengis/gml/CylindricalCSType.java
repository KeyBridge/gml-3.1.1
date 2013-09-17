package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A three-dimensional coordinate system consisting of a polar coordinate system
 * extended by a straight coordinate axis perpendicular to the plane spanned by
 * the polar coordinate system. A CylindricalCS shall have three usesAxis
 * associations.
 * <p/>
 * Java class for CylindricalCSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CylindricalCSType">
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
@XmlType(name = "CylindricalCSType")
public class CylindricalCSType
  extends AbstractCoordinateSystemType {
}
