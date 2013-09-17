package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A Geodesic consists of two distinct positions joined by a geodesic curve. The
 * control points of a Geodesic shall lie on the geodesic between its start
 * point and end points. Between these two points, a geodesic curve defined from
 * ellipsoid or geoid model used by the co-ordinate reference systems may be
 * used to interpolate other positions. Any other point in the controlPoint
 * array must fall on this geodesic.
 * <p/>
 * Java class for GeodesicType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GeodesicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}GeodesicStringType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodesicType")
public class GeodesicType
  extends GeodesicStringType {
}
