package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * [complexType of] Top-level property. Used in application schemas to "attach"
 * the styling information to GML data. The link between the data and the style
 * should be established through this property only.
 * <p/>
 * Java class for DefaultStylePropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DefaultStylePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Style" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *       &lt;attribute name="about" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultStylePropertyType", propOrder = {
  "style"
})
public class DefaultStylePropertyType {

  @XmlElementRef(name = "_Style", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends AbstractStyleType> style;
  @XmlAttribute(name = "about")
  @XmlSchemaType(name = "anyURI")
  protected String about;
  @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
  @XmlSchemaType(name = "anyURI")
  protected String remoteSchema;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
  protected TypeType type;
  @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
  protected String href;
  @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
  protected String role;
  @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
  protected String arcrole;
  @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
  protected String title;
  @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
  protected ShowType show;
  @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
  protected ActuateType actuate;

  /**
   * Gets the value of the style property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link AbstractStyleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StyleType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends AbstractStyleType> getStyle() {
    return style;
  }

  /**
   * Sets the value of the style property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link AbstractStyleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StyleType }{@code >}
   * <p/>
   */
  public void setStyle(JAXBElement<? extends AbstractStyleType> value) {
    this.style = value;
  }

  public boolean isSetStyle() {
    return (this.style != null);
  }

  /**
   * Gets the value of the about property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getAbout() {
    return about;
  }

  /**
   * Sets the value of the about property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setAbout(String value) {
    this.about = value;
  }

  public boolean isSetAbout() {
    return (this.about != null);
  }

  /**
   * Gets the value of the remoteSchema property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getRemoteSchema() {
    return remoteSchema;
  }

  /**
   * Sets the value of the remoteSchema property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setRemoteSchema(String value) {
    this.remoteSchema = value;
  }

  public boolean isSetRemoteSchema() {
    return (this.remoteSchema != null);
  }

  /**
   * Gets the value of the type property.
   * <p/>
   * @return possible object is {@link TypeType }
   *
   */
  public TypeType getType() {
    if (type == null) {
      return TypeType.SIMPLE;
    } else {
      return type;
    }
  }

  /**
   * Sets the value of the type property.
   * <p/>
   * @param value allowed object is {@link TypeType }
   *
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
   *
   */
  public String getHref() {
    return href;
  }

  /**
   * Sets the value of the href property.
   * <p/>
   * @param value allowed object is {@link String }
   *
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
   *
   */
  public String getRole() {
    return role;
  }

  /**
   * Sets the value of the role property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setRole(String value) {
    this.role = value;
  }

  public boolean isSetRole() {
    return (this.role != null);
  }

  /**
   * Gets the value of the arcrole property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getArcrole() {
    return arcrole;
  }

  /**
   * Sets the value of the arcrole property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setArcrole(String value) {
    this.arcrole = value;
  }

  public boolean isSetArcrole() {
    return (this.arcrole != null);
  }

  /**
   * Gets the value of the title property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTitle(String value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the show property.
   * <p/>
   * @return possible object is {@link ShowType }
   *
   */
  public ShowType getShow() {
    return show;
  }

  /**
   * Sets the value of the show property.
   * <p/>
   * @param value allowed object is {@link ShowType }
   *
   */
  public void setShow(ShowType value) {
    this.show = value;
  }

  public boolean isSetShow() {
    return (this.show != null);
  }

  /**
   * Gets the value of the actuate property.
   * <p/>
   * @return possible object is {@link ActuateType }
   *
   */
  public ActuateType getActuate() {
    return actuate;
  }

  /**
   * Sets the value of the actuate property.
   * <p/>
   * @param value allowed object is {@link ActuateType }
   *
   */
  public void setActuate(ActuateType value) {
    this.actuate = value;
  }

  public boolean isSetActuate() {
    return (this.actuate != null);
  }
}
