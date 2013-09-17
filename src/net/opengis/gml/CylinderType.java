package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * A cylinder is a gridded surface given as a family of circles whose positions
 * vary along a set of parallel lines, keeping the cross sectional horizontal
 * curves of a constant shape. NOTE! Given the same working assumptions as in
 * the previous note, a Cylinder can be given by two circles, giving us the
 * control points of the form ((P1, P2, P3),(P4, P5, P6)).
 * <p/>
 * Java class for CylinderType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CylinderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGriddedSurfaceType">
 *       &lt;attribute name="horizontalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArc3Points" />
 *       &lt;attribute name="verticalCurveType" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="linear" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CylinderType")
public class CylinderType
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
      return CurveInterpolationType.LINEAR;
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
