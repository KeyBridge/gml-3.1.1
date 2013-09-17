package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A three-dimensional coordinate system with one distance measured from the
 * origin and two angular coordinates. Not to be confused with an ellipsoidal
 * coordinate system based on an ellipsoid "degenerated" into a sphere. A
 * SphericalCS shall have three usesAxis associations.
 * <p/>
 * Java class for SphericalCSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="SphericalCSType">
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
@XmlType(name = "SphericalCSType")
public class SphericalCSType
  extends AbstractCoordinateSystemType {
}
