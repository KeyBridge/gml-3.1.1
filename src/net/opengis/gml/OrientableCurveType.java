package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * OrientableCurve consists of a curve and an orientation. If the orientation is
 * "+", then the OrientableCurve is identical to the baseCurve. If the
 * orientation is "-", then the OrientableCurve is related to another _Curve
 * with a parameterization that reverses the sense of the curve traversal.
 * <p/>
 * Java class for OrientableCurveType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="OrientableCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}baseCurve"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orientation" type="{http://www.opengis.net/gml}SignType" default="+" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientableCurveType", propOrder = {
  "baseCurve"
})
public class OrientableCurveType
  extends AbstractCurveType {

  @XmlElement(required = true)
  protected CurvePropertyType baseCurve;
  @XmlAttribute(name = "orientation")
  protected SignType orientation;

  /**
   * References or contains the base curve (positive orientation). NOTE: This
   * definition allows for a nested structure, i.e. an OrientableCurve may use
   * another OrientableCurve as its base curve.
   * <p/>
   * @return possible object is {@link CurvePropertyType }
   *
   */
  public CurvePropertyType getBaseCurve() {
    return baseCurve;
  }

  /**
   * Sets the value of the baseCurve property.
   * <p/>
   * @param value allowed object is {@link CurvePropertyType }
   *
   */
  public void setBaseCurve(CurvePropertyType value) {
    this.baseCurve = value;
  }

  public boolean isSetBaseCurve() {
    return (this.baseCurve != null);
  }

  /**
   * Gets the value of the orientation property.
   * <p/>
   * @return possible object is {@link SignType }
   *
   */
  public SignType getOrientation() {
    if (orientation == null) {
      return SignType.VALUE_2;
    } else {
      return orientation;
    }
  }

  /**
   * Sets the value of the orientation property.
   * <p/>
   * @param value allowed object is {@link SignType }
   *
   */
  public void setOrientation(SignType value) {
    this.orientation = value;
  }

  public boolean isSetOrientation() {
    return (this.orientation != null);
  }
}
