



package org.w3._2000._09.xmldsig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;

/**
 * <p>Java class for ObjectType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;any processContents='lax'/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Encoding" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectType", propOrder = {
  "content"
})
public class ObjectType {

  @XmlMixed
  @XmlAnyElement(lax = true)
  protected List<Object> content;
  @XmlAttribute(name = "Id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
  @XmlAttribute(name = "MimeType")
  protected String mimeType;
  @XmlAttribute(name = "Encoding")
  @XmlSchemaType(name = "anyURI")
  protected String encoding;

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
   * <p> Objects of the following type(s) are allowed in the list    {@link Element }
     * {@link Object }
   * {@link String }
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
   * Gets the value of the mimeType property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the value of the mimeType property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setMimeType(String value) {
    this.mimeType = value;
  }

  public boolean isSetMimeType() {
    return (this.mimeType != null);
  }

  /**
   * Gets the value of the encoding property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getEncoding() {
    return encoding;
  }

  /**
   * Sets the value of the encoding property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setEncoding(String value) {
    this.encoding = value;
  }

  public boolean isSetEncoding() {
    return (this.encoding != null);
  }
}
