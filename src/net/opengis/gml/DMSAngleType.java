package net.opengis.gml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Angle value provided in degree-minute-second or degree-minute format.
 * <p/>
 * Java class for DMSAngleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DMSAngleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}degrees"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/gml}decimalMinutes"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.opengis.net/gml}minutes"/>
 *             &lt;element ref="{http://www.opengis.net/gml}seconds" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMSAngleType", propOrder = {
  "degrees",
  "decimalMinutes",
  "minutes",
  "seconds"
})
public class DMSAngleType {

  @XmlElement(required = true)
  protected DegreesType degrees;
  protected BigDecimal decimalMinutes;
  protected Integer minutes;
  protected BigDecimal seconds;

  /**
   * Gets the value of the degrees property.
   * <p/>
   * @return possible object is {@link DegreesType }
   *
   */
  public DegreesType getDegrees() {
    return degrees;
  }

  /**
   * Sets the value of the degrees property.
   * <p/>
   * @param value allowed object is {@link DegreesType }
   *
   */
  public void setDegrees(DegreesType value) {
    this.degrees = value;
  }

  public boolean isSetDegrees() {
    return (this.degrees != null);
  }

  /**
   * Gets the value of the decimalMinutes property.
   * <p/>
   * @return possible object is {@link BigDecimal }
   *
   */
  public BigDecimal getDecimalMinutes() {
    return decimalMinutes;
  }

  /**
   * Sets the value of the decimalMinutes property.
   * <p/>
   * @param value allowed object is {@link BigDecimal }
   *
   */
  public void setDecimalMinutes(BigDecimal value) {
    this.decimalMinutes = value;
  }

  public boolean isSetDecimalMinutes() {
    return (this.decimalMinutes != null);
  }

  /**
   * Gets the value of the minutes property.
   * <p/>
   * @return possible object is {@link Integer }
   *
   */
  public Integer getMinutes() {
    return minutes;
  }

  /**
   * Sets the value of the minutes property.
   * <p/>
   * @param value allowed object is {@link Integer }
   *
   */
  public void setMinutes(Integer value) {
    this.minutes = value;
  }

  public boolean isSetMinutes() {
    return (this.minutes != null);
  }

  /**
   * Gets the value of the seconds property.
   * <p/>
   * @return possible object is {@link BigDecimal }
   *
   */
  public BigDecimal getSeconds() {
    return seconds;
  }

  /**
   * Sets the value of the seconds property.
   * <p/>
   * @param value allowed object is {@link BigDecimal }
   *
   */
  public void setSeconds(BigDecimal value) {
    this.seconds = value;
  }

  public boolean isSetSeconds() {
    return (this.seconds != null);
  }
}
