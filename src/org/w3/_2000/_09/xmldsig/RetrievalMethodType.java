



package org.w3._2000._09.xmldsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RetrievalMethodType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RetrievalMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalMethodType", propOrder = {
  "transforms"
})
public class RetrievalMethodType {

  @XmlElement(name = "Transforms")
  protected TransformsType transforms;
  @XmlAttribute(name = "URI")
  @XmlSchemaType(name = "anyURI")
  protected String uri;
  @XmlAttribute(name = "Type")
  @XmlSchemaType(name = "anyURI")
  protected String type;

  /**
   * Gets the value of the transforms property.
   * <p/>
   * @return possible object is {@link TransformsType }
   * <p/>
   */
  public TransformsType getTransforms() {
    return transforms;
  }

  /**
   * Sets the value of the transforms property.
   * <p/>
   * @param value allowed object is {@link TransformsType }
   * <p/>
   */
  public void setTransforms(TransformsType value) {
    this.transforms = value;
  }

  public boolean isSetTransforms() {
    return (this.transforms != null);
  }

  /**
   * Gets the value of the uri property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getURI() {
    return uri;
  }

  /**
   * Sets the value of the uri property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setURI(String value) {
    this.uri = value;
  }

  public boolean isSetURI() {
    return (this.uri != null);
  }

  /**
   * Gets the value of the type property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setType(String value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }
}
