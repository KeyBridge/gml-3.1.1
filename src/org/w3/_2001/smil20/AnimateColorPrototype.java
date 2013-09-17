



package org.w3._2001.smil20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001.smil20.language.AnimateColorType;

/**
 * <p>Java class for animateColorPrototype complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="animateColorPrototype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animAddAccumAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animValuesAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animNamedTargetAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "animateColorPrototype")
@XmlSeeAlso({
  AnimateColorType.class
})
public class AnimateColorPrototype {

  @XmlAttribute(name = "additive")
  protected String additive;
  @XmlAttribute(name = "accumulate")
  protected String accumulate;
  @XmlAttribute(name = "from")
  protected String from;
  @XmlAttribute(name = "by")
  protected String by;
  @XmlAttribute(name = "values")
  protected String values;
  @XmlAttribute(name = "to")
  protected String to;
  @XmlAttribute(name = "attributeName", required = true)
  protected String attributeName;
  @XmlAttribute(name = "attributeType")
  protected String attributeType;

  /**
   * Gets the value of the additive property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getAdditive() {
    if (additive == null) {
      return "replace";
    } else {
      return additive;
    }
  }

  /**
   * Sets the value of the additive property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setAdditive(String value) {
    this.additive = value;
  }

  public boolean isSetAdditive() {
    return (this.additive != null);
  }

  /**
   * Gets the value of the accumulate property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getAccumulate() {
    if (accumulate == null) {
      return "none";
    } else {
      return accumulate;
    }
  }

  /**
   * Sets the value of the accumulate property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setAccumulate(String value) {
    this.accumulate = value;
  }

  public boolean isSetAccumulate() {
    return (this.accumulate != null);
  }

  /**
   * Gets the value of the from property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getFrom() {
    return from;
  }

  /**
   * Sets the value of the from property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setFrom(String value) {
    this.from = value;
  }

  public boolean isSetFrom() {
    return (this.from != null);
  }

  /**
   * Gets the value of the by property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getBy() {
    return by;
  }

  /**
   * Sets the value of the by property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setBy(String value) {
    this.by = value;
  }

  public boolean isSetBy() {
    return (this.by != null);
  }

  /**
   * Gets the value of the values property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getValues() {
    return values;
  }

  /**
   * Sets the value of the values property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setValues(String value) {
    this.values = value;
  }

  public boolean isSetValues() {
    return (this.values != null);
  }

  /**
   * Gets the value of the to property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getTo() {
    return to;
  }

  /**
   * Sets the value of the to property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setTo(String value) {
    this.to = value;
  }

  public boolean isSetTo() {
    return (this.to != null);
  }

  /**
   * Gets the value of the attributeName property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getAttributeName() {
    return attributeName;
  }

  /**
   * Sets the value of the attributeName property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setAttributeName(String value) {
    this.attributeName = value;
  }

  public boolean isSetAttributeName() {
    return (this.attributeName != null);
  }

  /**
   * Gets the value of the attributeType property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getAttributeType() {
    if (attributeType == null) {
      return "auto";
    } else {
      return attributeType;
    }
  }

  /**
   * Sets the value of the attributeType property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setAttributeType(String value) {
    this.attributeType = value;
  }

  public boolean isSetAttributeType() {
    return (this.attributeType != null);
  }
}
