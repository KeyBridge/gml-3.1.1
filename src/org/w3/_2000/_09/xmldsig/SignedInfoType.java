



package org.w3._2000._09.xmldsig;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for SignedInfoType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SignedInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}CanonicalizationMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Reference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedInfoType", propOrder = {
  "canonicalizationMethod",
  "signatureMethod",
  "reference"
})
public class SignedInfoType {

  @XmlElement(name = "CanonicalizationMethod", required = true)
  protected CanonicalizationMethodType canonicalizationMethod;
  @XmlElement(name = "SignatureMethod", required = true)
  protected SignatureMethodType signatureMethod;
  @XmlElement(name = "Reference", required = true)
  protected List<ReferenceType> reference;
  @XmlAttribute(name = "Id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;

  /**
   * Gets the value of the canonicalizationMethod property.
   * <p/>
   * @return possible object is {@link CanonicalizationMethodType }
   * <p/>
   */
  public CanonicalizationMethodType getCanonicalizationMethod() {
    return canonicalizationMethod;
  }

  /**
   * Sets the value of the canonicalizationMethod property.
   * <p/>
   * @param value allowed object is {@link CanonicalizationMethodType }
   * <p/>
   */
  public void setCanonicalizationMethod(CanonicalizationMethodType value) {
    this.canonicalizationMethod = value;
  }

  public boolean isSetCanonicalizationMethod() {
    return (this.canonicalizationMethod != null);
  }

  /**
   * Gets the value of the signatureMethod property.
   * <p/>
   * @return possible object is {@link SignatureMethodType }
   * <p/>
   */
  public SignatureMethodType getSignatureMethod() {
    return signatureMethod;
  }

  /**
   * Sets the value of the signatureMethod property.
   * <p/>
   * @param value allowed object is {@link SignatureMethodType }
   * <p/>
   */
  public void setSignatureMethod(SignatureMethodType value) {
    this.signatureMethod = value;
  }

  public boolean isSetSignatureMethod() {
    return (this.signatureMethod != null);
  }

  /**
   * Gets the value of the reference property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the reference property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getReference().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p> Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
   * <p/>
   * <p/>
   */
  public List<ReferenceType> getReference() {
    if (reference == null) {
      reference = new ArrayList<ReferenceType>();
    }
    return this.reference;
  }

  public boolean isSetReference() {
    return ((this.reference != null) && (!this.reference.isEmpty()));
  }

  public void unsetReference() {
    this.reference = null;
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
