package org.w3._1999.xlink;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * Intended for use as the type of user-declared elements to make them extended
 * links. Note that the elements referenced in the content model are all
 * abstract. The intention is that by simply declaring elements with these as
 * their substitutionGroup, all the right things will happen.
 * <p/>
 * <
 * p/>
 * <p>Java class for extended complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="extended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1999/xlink}extendedModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}extendedAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <
 * p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extended", propOrder = {
  "extendedModel"
})
public class Extended {

  @XmlElements({
    @XmlElement(name = "title", type = TitleEltType.class),
    @XmlElement(name = "resource", type = ResourceType.class),
    @XmlElement(name = "locator", type = LocatorType.class),
    @XmlElement(name = "arc", type = ArcType.class)
  })
  protected List<Object> extendedModel;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
  protected TypeType type;
  @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
  protected String role;
  @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
  protected String title;

  /**
   * Gets the value of the extendedModel property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the extendedModel property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getExtendedModel().add(newItem);
   * </pre>
   * <p/>
   * <
   * p/>
   * <p> Objects of the following type(s) are allowed in the list null   {@link TitleEltType }
     * {@link ResourceType }
   * {@link LocatorType }
   * {@link ArcType }
   * <p/>
   * <
   * p/>
   */
  public List<Object> getExtendedModel() {
    if (extendedModel == null) {
      extendedModel = new ArrayList<Object>();
    }
    return this.extendedModel;
  }

  public boolean isSetExtendedModel() {
    return ((this.extendedModel != null) && (!this.extendedModel.isEmpty()));
  }

  public void unsetExtendedModel() {
    this.extendedModel = null;
  }

  /**
   * Gets the value of the type property.
   * <p/>
   * @return possible object is {@link TypeType }
   * <p/>
   */
  public TypeType getType() {
    if (type == null) {
      return TypeType.EXTENDED;
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
   * Gets the value of the title property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setTitle(String value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }
}
