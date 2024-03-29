package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Tables or arrays of tuples. May be used for text-encoding of values from a
 * table. Actually just a string, but allows the user to indicate which
 * characters are used as separators. The value of the 'cs' attribute is the
 * separator for coordinate values, and the value of the 'ts' attribute gives
 * the tuple separator (a single space by default); the default values may be
 * changed to reflect local usage. Defaults to CSV within a tuple, space between
 * tuples. However, any string content will be schema-valid.
 * <p/>
 * Java class for CoordinatesType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="CoordinatesType"> &lt;simpleContent> &lt;extension
 * base="&lt;http://www.w3.org/2001/XMLSchema>string"> &lt;attribute
 * name="decimal" type="{http://www.w3.org/2001/XMLSchema}string" default="." />
 * &lt;attribute name="cs" type="{http://www.w3.org/2001/XMLSchema}string"
 * default="," /> &lt;attribute name="ts"
 * type="{http://www.w3.org/2001/XMLSchema}string" default=" " />
 * &lt;/extension> &lt;/simpleContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinatesType", propOrder = {
  "value"
})
public class CoordinatesType {

  @XmlValue
  protected String value;
  @XmlAttribute(name = "decimal")
  protected String decimal;
  @XmlAttribute(name = "cs")
  protected String cs;
  @XmlAttribute(name = "ts")
  protected String ts;

  /**
   * Gets the value of the value property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setValue(String value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Gets the value of the decimal property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getDecimal() {
    if (decimal == null) {
      return ".";
    } else {
      return decimal;
    }
  }

  /**
   * Sets the value of the decimal property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setDecimal(String value) {
    this.decimal = value;
  }

  public boolean isSetDecimal() {
    return (this.decimal != null);
  }

  /**
   * Gets the value of the cs property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getCs() {
    if (cs == null) {
      return ",";
    } else {
      return cs;
    }
  }

  /**
   * Sets the value of the cs property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setCs(String value) {
    this.cs = value;
  }

  public boolean isSetCs() {
    return (this.cs != null);
  }

  /**
   * Gets the value of the ts property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTs() {
    if (ts == null) {
      return " ";
    } else {
      return ts;
    }
  }

  /**
   * Sets the value of the ts property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTs(String value) {
    this.ts = value;
  }

  public boolean isSetTs() {
    return (this.ts != null);
  }

  @Override
  public String toString() {
    return "CoordinatesType{" + "value=" + value + ", decimal=" + decimal + ", cs=" + cs + ", ts=" + ts + '}';
  }
}
