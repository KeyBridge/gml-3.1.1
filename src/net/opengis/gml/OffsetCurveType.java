package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An offset curve is a curve at a constant distance from the basis curve. They
 * can be useful as a cheap and simple alternative to constructing curves that
 * are offsets by definition.
 * <p/>
 * Java class for OffsetCurveType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="OffsetCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;element name="offsetBase" type="{http://www.opengis.net/gml}CurvePropertyType"/>
 *         &lt;element name="distance" type="{http://www.opengis.net/gml}LengthType"/>
 *         &lt;element name="refDirection" type="{http://www.opengis.net/gml}VectorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetCurveType", propOrder = {
  "offsetBase",
  "distance",
  "refDirection"
})
public class OffsetCurveType
  extends AbstractCurveSegmentType {

  @XmlElement(required = true)
  protected CurvePropertyType offsetBase;
  @XmlElement(required = true)
  protected LengthType distance;
  protected VectorType refDirection;

  /**
   * Gets the value of the offsetBase property.
   * <p/>
   * @return possible object is {@link CurvePropertyType }
   *
   */
  public CurvePropertyType getOffsetBase() {
    return offsetBase;
  }

  /**
   * Sets the value of the offsetBase property.
   * <p/>
   * @param value allowed object is {@link CurvePropertyType }
   *
   */
  public void setOffsetBase(CurvePropertyType value) {
    this.offsetBase = value;
  }

  public boolean isSetOffsetBase() {
    return (this.offsetBase != null);
  }

  /**
   * Gets the value of the distance property.
   * <p/>
   * @return possible object is {@link LengthType }
   *
   */
  public LengthType getDistance() {
    return distance;
  }

  /**
   * Sets the value of the distance property.
   * <p/>
   * @param value allowed object is {@link LengthType }
   *
   */
  public void setDistance(LengthType value) {
    this.distance = value;
  }

  public boolean isSetDistance() {
    return (this.distance != null);
  }

  /**
   * Gets the value of the refDirection property.
   * <p/>
   * @return possible object is {@link VectorType }
   *
   */
  public VectorType getRefDirection() {
    return refDirection;
  }

  /**
   * Sets the value of the refDirection property.
   * <p/>
   * @param value allowed object is {@link VectorType }
   *
   */
  public void setRefDirection(VectorType value) {
    this.refDirection = value;
  }

  public boolean isSetRefDirection() {
    return (this.refDirection != null);
  }
}
