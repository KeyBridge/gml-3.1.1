package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Number with a scale. The value of uom (Units Of Measure) attribute is a
 * reference to a Reference System for the amount, either a ratio or position
 * scale.
 * <p/>
 * Java class for MeasureType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="MeasureType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="uom" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
  "value"
})
@XmlSeeAlso({
  VolumeType.class,
  LengthType.class,
  ScaleType.class,
  AngleType.class,
  GridLengthType.class,
  SpeedType.class,
  AreaType.class,
  TimeType.class
})
public class MeasureType {

  @XmlValue
  protected double value;
  @XmlAttribute(name = "uom", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String uom;

  /**
   * Gets the value of the value property.
   * <p/>
   */
  public double getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   */
  public void setValue(double value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return true;
  }

  /**
   * Gets the value of the uom property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getUom() {
    return uom;
  }

  /**
   * Sets the value of the uom property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setUom(String value) {
    this.uom = value;
  }

  public boolean isSetUom() {
    return (this.uom != null);
  }
}
