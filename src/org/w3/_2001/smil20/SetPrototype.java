



package org.w3._2001.smil20;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001.smil20.language.SetType;

/**
 * <p>Java class for setPrototype complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="setPrototype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animNamedTargetAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animSetValuesAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPrototype")
@XmlSeeAlso({
  SetType.class
})
public class SetPrototype {

  @XmlAttribute(name = "attributeName", required = true)
  protected String attributeName;
  @XmlAttribute(name = "attributeType")
  protected String attributeType;
  @XmlAttribute(name = "to")
  protected String to;

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
}
