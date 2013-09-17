



package org.w3._2000._09.xmldsig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CanonicalizationMethodType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CanonicalizationMethodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanonicalizationMethodType", propOrder = {
  "content"
})
public class CanonicalizationMethodType {

  @XmlMixed
  @XmlAnyElement(lax = true)
  protected List<Object> content;
  @XmlAttribute(name = "Algorithm", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String algorithm;

  /**
   * Gets the value of the content property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the content property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getContent().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p> Objects of the following type(s) are allowed in the list    {@link String }
     * {@link Object }
   * <p/>
   * <p/>
   */
  public List<Object> getContent() {
    if (content == null) {
      content = new ArrayList<Object>();
    }
    return this.content;
  }

  public boolean isSetContent() {
    return ((this.content != null) && (!this.content.isEmpty()));
  }

  public void unsetContent() {
    this.content = null;
  }

  /**
   * Gets the value of the algorithm property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * Sets the value of the algorithm property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setAlgorithm(String value) {
    this.algorithm = value;
  }

  public boolean isSetAlgorithm() {
    return (this.algorithm != null);
  }
}
