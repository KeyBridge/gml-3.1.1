package org.w3._1999.xlink;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>Java class for titleEltType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="titleEltType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1999/xlink}titleModel"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}titleAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <
 * p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titleEltType", propOrder = {
  "content"
})
public class TitleEltType {

  @XmlMixed
  @XmlAnyElement(lax = true)
  protected List<Object> content;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
  protected TypeType type;
  @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
  protected String lang;

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
   * <
   * p/>
   * <p> Objects of the following type(s) are allowed in the list null   {@link Element }
     * {@link Object }
   * {@link String }
   * <p/>
   * <
   * p/>
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
   * Gets the value of the type property.
   * <p/>
   * @return possible object is {@link TypeType }
   * <p/>
   */
  public TypeType getType() {
    if (type == null) {
      return TypeType.TITLE;
    } else {
      return type;
    }
  }

  /**
   * Sets the value of the type property.
   * <p/>
   * @param value allowed object is {@link TypeType }
   * <p/>
   */
  public void setType(TypeType value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   *
   * xml:lang is not required, but provides much of the motivation for title
   * elements in addition to attributes, and so is provided here for
   * convenience.
   * <p/>
   * <
   * p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getLang() {
    return lang;
  }

  /**
   * Sets the value of the lang property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setLang(String value) {
    this.lang = value;
  }

  public boolean isSetLang() {
    return (this.lang != null);
  }
}
