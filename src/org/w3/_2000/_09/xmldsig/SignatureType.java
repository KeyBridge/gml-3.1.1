



package org.w3._2000._09.xmldsig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for SignatureType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre> &lt;complexType name="SignatureType"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;element
 * ref="{http://www.w3.org/2000/09/xmldsig#}SignedInfo"/> &lt;element
 * ref="{http://www.w3.org/2000/09/xmldsig#}SignatureValue"/> &lt;element
 * ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/> &lt;element
 * ref="{http://www.w3.org/2000/09/xmldsig#}Object" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;attribute name="Id"
 * type="{http://www.w3.org/2001/XMLSchema}ID" /> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 * <
 * p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
  "signedInfo",
  "signatureValue",
  "keyInfo",
  "object"
})
public class SignatureType {

  @XmlElement(name = "SignedInfo", required = true)
  protected SignedInfoType signedInfo;
  @XmlElement(name = "SignatureValue", required = true)
  protected SignatureValueType signatureValue;
  @XmlElement(name = "KeyInfo")
  protected KeyInfoType keyInfo;
  @XmlElement(name = "Object")
  protected List<ObjectType> object;
  @XmlAttribute(name = "Id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;

  /**
   * Gets the value of the signedInfo property.
   * <p/>
   * @return possible object is {@link SignedInfoType }
   * <p/>
   */
  public SignedInfoType getSignedInfo() {
    return signedInfo;
  }

  /**
   * Sets the value of the signedInfo property.
   * <p/>
   * @param value allowed object is {@link SignedInfoType }
   * <p/>
   */
  public void setSignedInfo(SignedInfoType value) {
    this.signedInfo = value;
  }

  public boolean isSetSignedInfo() {
    return (this.signedInfo != null);
  }

  /**
   * Gets the value of the signatureValue property.
   * <p/>
   * @return possible object is {@link SignatureValueType }
   * <p/>
   */
  public SignatureValueType getSignatureValue() {
    return signatureValue;
  }

  /**
   * Sets the value of the signatureValue property.
   * <p/>
   * @param value allowed object is {@link SignatureValueType }
   * <p/>
   */
  public void setSignatureValue(SignatureValueType value) {
    this.signatureValue = value;
  }

  public boolean isSetSignatureValue() {
    return (this.signatureValue != null);
  }

  /**
   * Gets the value of the keyInfo property.
   * <p/>
   * @return possible object is {@link KeyInfoType }
   * <p/>
   */
  public KeyInfoType getKeyInfo() {
    return keyInfo;
  }

  /**
   * Sets the value of the keyInfo property.
   * <p/>
   * @param value allowed object is {@link KeyInfoType }
   * <p/>
   */
  public void setKeyInfo(KeyInfoType value) {
    this.keyInfo = value;
  }

  public boolean isSetKeyInfo() {
    return (this.keyInfo != null);
  }

  /**
   * Gets the value of the object property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the object property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getObject().add(newItem);
   * </pre>
   * <p/>
   * <
   * p/> <p> Objects of the following type(s) are allowed in the list
     * {@link ObjectType }
   * <p/>
   * <
   * p/>
   */
  public List<ObjectType> getObject() {
    if (object == null) {
      object = new ArrayList<ObjectType>();
    }
    return this.object;
  }

  public boolean isSetObject() {
    return ((this.object != null) && (!this.object.isEmpty()));
  }

  public void unsetObject() {
    this.object = null;
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
}
