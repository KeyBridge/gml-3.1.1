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
 * <p>Java class for arcType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="arcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1999/xlink}arcModel"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}arcAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <
 * p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arcType", propOrder = {
  "title"
})
public class ArcType {

  protected List<TitleEltType> title;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
  protected TypeType type;
  @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
  protected String arcrole;
  @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
  protected String title2;
  @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
  protected ShowType show;
  @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
  protected ActuateType actuate;
  @XmlAttribute(name = "from", namespace = "http://www.w3.org/1999/xlink")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String from;
  @XmlAttribute(name = "to", namespace = "http://www.w3.org/1999/xlink")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String to;

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
      return TypeType.ARC;
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
   * Gets the value of the arcrole property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getArcrole() {
    return arcrole;
  }

  /**
   * Sets the value of the arcrole property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setArcrole(String value) {
    this.arcrole = value;
  }

  public boolean isSetArcrole() {
    return (this.arcrole != null);
  }

  /**
   * Gets the value of the title2 property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getTitle2() {
    return title2;
  }

  /**
   * Sets the value of the title2 property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setTitle2(String value) {
    this.title2 = value;
  }

  public boolean isSetTitle2() {
    return (this.title2 != null);
  }

  /**
   * Gets the value of the show property.
   * <p/>
   * @return possible object is {@link ShowType }
   * <p/>
   */
  public ShowType getShow() {
    return show;
  }

  /**
   * Sets the value of the show property.
   * <p/>
   * @param value allowed object is {@link ShowType }
   * <p/>
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
   * <p/>
   */
  public ActuateType getActuate() {
    return actuate;
  }

  /**
   * Sets the value of the actuate property.
   * <p/>
   * @param value allowed object is {@link ActuateType }
   * <p/>
   */
  public void setActuate(ActuateType value) {
    this.actuate = value;
  }

  public boolean isSetActuate() {
    return (this.actuate != null);
  }

  /**
   * Gets the value of the from property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getFrom() {
    return from;
  }

  /**
   * Sets the value of the from property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setFrom(String value) {
    this.from = value;
  }

  public boolean isSetFrom() {
    return (this.from != null);
  }

  /**
   *
   * from and to have default behavior when values are missing
   * <p/>
   * <
   * p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getTo() {
    return to;
  }

  /**
   * Sets the value of the to property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setTo(String value) {
    this.to = value;
  }

  public boolean isSetTo() {
    return (this.to != null);
  }
}
