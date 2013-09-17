



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
 * <p>Java class for SignaturePropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SignaturePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *       &lt;attribute name="Target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePropertyType", propOrder = {
  "content"
})
public class SignaturePropertyType {

  @XmlMixed
  @XmlAnyElement(lax = true)
  protected List<Object> content;
  @XmlAttribute(name = "Target", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String target;
  @XmlAttribute(name = "Id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;

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
   * Gets the value of the target property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getTarget() {
    return target;
  }

  /**
   * Sets the value of the target property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setTarget(String value) {
    this.target = value;
  }

  public boolean isSetTarget() {
    return (this.target != null);
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
