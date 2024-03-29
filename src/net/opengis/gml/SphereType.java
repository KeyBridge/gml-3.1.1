package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * A sphere is a gridded surface given as a family of circles whose positions
 * vary linearly along the axis of the sphere, and whise radius varies in
 * proportions to the cosine function of the central angle. The horizontal
 * circles resemble lines of constant latitude, and the vertical arcs resemble
 * lines of constant longitude. NOTE! If the control points are sorted in terms
 * of increasing longitude, and increasing latitude, the upNormal of a sphere is
 * the outward normal. EXAMPLE If we take a gridded set of latitudes and
 * longitudes in degrees,(u,v) such as
 * <p/>
 * (-90,-180) (-90,-90) (-90,0) (-90, 90) (-90, 180) (-45,-180) (-45,-90)
 * (-45,0) (-45, 90) (-45, 180) ( 0,-180) ( 0,-90) ( 0,0) ( 0, 90) ( 0, 180) (
 * 45,-180) ( 45,-90) ( 45,0) ( 45, -90) ( 45, 180) ( 90,-180) ( 90,-90) ( 90,0)
 * ( 90, -90) ( 90, 180)
 * <p/>
 * And map these points to 3D using the usual equations (where R is the radius
 * of the required sphere).
 * <p/>
 * z = R sin u x = (R cos u)(sin v) y = (R cos u)(cos v)
 * <p/>
 * We have a sphere of Radius R, centred at (0,0), as a gridded surface. Notice
 * that the entire first row and the entire last row of the control points map
 * to a single point in each 3D Euclidean space, North and South poles
 * respectively, and that each horizontal curve closes back on itself forming a
 * geometric cycle. This gives us a metrically bounded (of finite size),
 * topologically unbounded (not having a boundary, a cycle) surface.
 * <p/>
 * Java class for SphereType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="SphereType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGriddedSurfaceType">
 *       &lt;attribute name="horizontalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArc3Points" />
 *       &lt;attribute name="verticalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArc3Points" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SphereType")
public class SphereType
  extends AbstractGriddedSurfaceType {

  @XmlAttribute(name = "horizontalCurveType")
  protected CurveInterpolationType horizontalCurveType;
  @XmlAttribute(name = "verticalCurveType")
  protected CurveInterpolationType verticalCurveType;

  /**
   * Gets the value of the horizontalCurveType property.
   * <p/>
   * @return possible object is {@link CurveInterpolationType }
   *
   */
  public CurveInterpolationType getHorizontalCurveType() {
    if (horizontalCurveType == null) {
      return CurveInterpolationType.CIRCULAR_ARC_3_POINTS;
    } else {
      return horizontalCurveType;
    }
  }

  /**
   * Sets the value of the horizontalCurveType property.
   * <p/>
   * @param value allowed object is {@link CurveInterpolationType }
   *
   */
  public void setHorizontalCurveType(CurveInterpolationType value) {
    this.horizontalCurveType = value;
  }

  public boolean isSetHorizontalCurveType() {
    return (this.horizontalCurveType != null);
  }

  /**
   * Gets the value of the verticalCurveType property.
   * <p/>
   * @return possible object is {@link CurveInterpolationType }
   *
   */
  public CurveInterpolationType getVerticalCurveType() {
    if (verticalCurveType == null) {
      return CurveInterpolationType.CIRCULAR_ARC_3_POINTS;
    } else {
      return verticalCurveType;
    }
  }

  /**
   * Sets the value of the verticalCurveType property.
   * <p/>
   * @param value allowed object is {@link CurveInterpolationType }
   *
   */
  public void setVerticalCurveType(CurveInterpolationType value) {
    this.verticalCurveType = value;
  }

  public boolean isSetVerticalCurveType() {
    return (this.verticalCurveType != null);
  }
}
