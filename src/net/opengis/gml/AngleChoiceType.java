package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Value of an angle quantity provided in either degree-minute-second format or
 * single value format.
 * <p/>
 * Java class for AngleChoiceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AngleChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}angle"/>
 *         &lt;element ref="{http://www.opengis.net/gml}dmsAngle"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AngleChoiceType", propOrder = {
  "angle",
  "dmsAngle"
})
public class AngleChoiceType {

  protected MeasureType angle;
  protected DMSAngleType dmsAngle;

  /**
   * Gets the value of the angle property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getAngle() {
    return angle;
  }

  /**
   * Sets the value of the angle property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setAngle(MeasureType value) {
    this.angle = value;
  }

  public boolean isSetAngle() {
    return (this.angle != null);
  }

  /**
   * Gets the value of the dmsAngle property.
   * <p/>
   * @return possible object is {@link DMSAngleType }
   *
   */
  public DMSAngleType getDmsAngle() {
    return dmsAngle;
  }

  /**
   * Sets the value of the dmsAngle property.
   * <p/>
   * @param value allowed object is {@link DMSAngleType }
   *
   */
  public void setDmsAngle(DMSAngleType value) {
    this.dmsAngle = value;
  }

  public boolean isSetDmsAngle() {
    return (this.dmsAngle != null);
  }
}
