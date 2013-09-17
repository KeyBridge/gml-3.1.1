package net.opengis.gml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * This type extends the built-in xsd:decimal simple type to allow
 * floating-point values for temporal length. According to the ISO 11404 model
 * you have to use positiveInteger together with appropriate values for radix
 * and factor. The resolution of the time interval is to one radix ^(-factor) of
 * the specified time unit (e.g. unit="second", radix="10", factor="3" specifies
 * a resolution of milliseconds). It is a subtype of TimeDurationType.
 * <p/>
 * <p>Java class for TimeIntervalLengthType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeIntervalLengthType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="unit" use="required" type="{http://www.opengis.net/gml}TimeUnitType" />
 *       &lt;attribute name="radix" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="factor" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeIntervalLengthType", propOrder = {
  "value"
})
public class TimeIntervalLengthType {

  @XmlValue
  protected BigDecimal value;
  @XmlAttribute(name = "unit", required = true)
  protected String unit;
  @XmlAttribute(name = "radix")
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger radix;
  @XmlAttribute(name = "factor")
  protected BigInteger factor;

  /**
   * Gets the value of the value property.
   * <p/>
   * @return possible object is {@link BigDecimal }
   *
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   * @param value allowed object is {@link BigDecimal }
   *
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Gets the value of the unit property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Sets the value of the unit property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setUnit(String value) {
    this.unit = value;
  }

  public boolean isSetUnit() {
    return (this.unit != null);
  }

  /**
   * Gets the value of the radix property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getRadix() {
    return radix;
  }

  /**
   * Sets the value of the radix property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setRadix(BigInteger value) {
    this.radix = value;
  }

  public boolean isSetRadix() {
    return (this.radix != null);
  }

  /**
   * Gets the value of the factor property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getFactor() {
    return factor;
  }

  /**
   * Sets the value of the factor property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setFactor(BigInteger value) {
    this.factor = value;
  }

  public boolean isSetFactor() {
    return (this.factor != null);
  }
}
