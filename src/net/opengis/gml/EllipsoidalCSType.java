package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A two- or three-dimensional coordinate system in which position is specified
 * by geodetic latitude, geodetic longitude, and (in the three-dimensional case)
 * ellipsoidal height. An EllipsoidalCS shall have two or three usesAxis
 * associations.
 * <p/>
 * Java class for EllipsoidalCSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="EllipsoidalCSType">
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
@XmlType(name = "EllipsoidalCSType")
public class EllipsoidalCSType
  extends AbstractCoordinateSystemType {
}
