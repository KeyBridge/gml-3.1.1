package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A one-dimensional coordinate system that consists of the points that lie on
 * the single axis described. The associated ordinate is the distance from the
 * specified origin to the point along the axis. Example: usage of the line
 * feature representing a road to describe points on or along that road. A
 * LinearCS shall have one usesAxis association.
 * <p/>
 * Java class for LinearCSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="LinearCSType">
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
@XmlType(name = "LinearCSType")
public class LinearCSType
  extends AbstractCoordinateSystemType {
}
