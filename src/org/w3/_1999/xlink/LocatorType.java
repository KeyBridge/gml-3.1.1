package org.w3._1999.xlink;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for locatorType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="locatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1999/xlink}locatorModel"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}locatorAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <
 * p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locatorType", propOrder = {
  "title"
})
public class LocatorType {

  protected List<TitleEltType> title;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
  protected TypeType type;
  @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink", required = true)
  protected String href;
  @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
  protected String role;
  @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
  protected String title1;
  @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String label;

  /**
   * Gets the value of the title property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the title property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getTitle().add(newItem);
   * </pre>
   * <p/>
   * <
   * p/>
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TitleEltType }
   * <p/>
   * <
   * p/>
   */
  public List<TitleEltType> getTitle() {
    if (title == null) {
      title = new ArrayList<TitleEltType>();
    }
    return this.title;
  }

  public boolean isSetTitle() {
    return ((this.title != null) && (!this.title.isEmpty()));
  }

  public void unsetTitle() {
    this.title = null;
  }

  /**
   * Gets the value of the type property.
   * <p/>
   * @return possible object is {@link TypeType }
   * <p/>
   */
  public TypeType getType() {
    if (type == null) {
      return TypeType.LOCATOR;
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
   * Gets the value of the href property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getHref() {
    return href;
  }

  /**
   * Sets the value of the href property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setHref(String value) {
    this.href = value;
  }

  public boolean isSetHref() {
    return (this.href != null);
  }

  /**
   * Gets the value of the role property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getRole() {
    return role;
  }

  /**
   * Sets the value of the role property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setRole(String value) {
    this.role = value;
  }

  public boolean isSetRole() {
    return (this.role != null);
  }

  /**
   * Gets the value of the title1 property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getTitle1() {
    return title1;
  }

  /**
   * Sets the value of the title1 property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setTitle1(String value) {
    this.title1 = value;
  }

  public boolean isSetTitle1() {
    return (this.title1 != null);
  }

  /**
   *
   * label is not required, but locators have no particular XLink function if
   * they are not labeled.
   * <p/>
   * <
   * p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets the value of the label property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setLabel(String value) {
    this.label = value;
  }

  public boolean isSetLabel() {
    return (this.label != null);
  }
}
