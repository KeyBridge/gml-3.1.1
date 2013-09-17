



package org.w3._2000._09.xmldsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for ReferenceType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
@XmlType(name = "ReferenceType", propOrder = {
  "transforms",
  "digestMethod",
  "digestValue"
})
public class ReferenceType {

  @XmlElement(name = "Transforms")
  protected TransformsType transforms;
  @XmlElement(name = "DigestMethod", required = true)
  protected DigestMethodType digestMethod;
  @XmlElement(name = "DigestValue", required = true)
  protected byte[] digestValue;
  @XmlAttribute(name = "Id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
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
   * Gets the value of the digestMethod property.
   * <p/>
   * @return possible object is {@link DigestMethodType }
   * <p/>
   */
  public DigestMethodType getDigestMethod() {
    return digestMethod;
  }

  /**
   * Sets the value of the digestMethod property.
   * <p/>
   * @param value allowed object is {@link DigestMethodType }
   * <p/>
   */
  public void setDigestMethod(DigestMethodType value) {
    this.digestMethod = value;
  }

  public boolean isSetDigestMethod() {
    return (this.digestMethod != null);
  }

  /**
   * Gets the value of the digestValue property.
   * <p/>
   * @return possible object is byte[]
   */
  public byte[] getDigestValue() {
    return digestValue;
  }

  /**
   * Sets the value of the digestValue property.
   * <p/>
   * @param value allowed object is byte[]
   */
  public void setDigestValue(byte[] value) {
    this.digestValue = value;
  }

  public boolean isSetDigestValue() {
    return (this.digestValue != null);
  }

  /**
   * Gets the value of the id property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setId(String value) {
    this.id = value;
  }

  public boolean isSetId() {
    return (this.id != null);
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
