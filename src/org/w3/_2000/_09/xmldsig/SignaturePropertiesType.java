



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
 * <p>Java class for SignaturePropertiesType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SignaturePropertiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}SignatureProperty" maxOccurs="unbounded"/>
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
@XmlType(name = "SignaturePropertiesType", propOrder = {
  "signatureProperty"
})
public class SignaturePropertiesType {

  @XmlElement(name = "SignatureProperty", required = true)
  protected List<SignaturePropertyType> signatureProperty;
  @XmlAttribute(name = "Id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;

  /**
   * Gets the value of the signatureProperty property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the signatureProperty property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getSignatureProperty().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p> Objects of the following type(s) are allowed in the list
     * {@link SignaturePropertyType }
   * <p/>
   * <p/>
   */
  public List<SignaturePropertyType> getSignatureProperty() {
    if (signatureProperty == null) {
      signatureProperty = new ArrayList<SignaturePropertyType>();
    }
    return this.signatureProperty;
  }

  public boolean isSetSignatureProperty() {
    return ((this.signatureProperty != null) && (!this.signatureProperty.isEmpty()));
  }

  public void unsetSignatureProperty() {
    this.signatureProperty = null;
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
