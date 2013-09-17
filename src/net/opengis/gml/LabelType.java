package net.opengis.gml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;

/**
 * Label is mixed -- composed of text and XPath expressions used to extract the
 * useful information from the feature.
 * <p/>
 * Java class for LabelType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="LabelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelExpression" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml}transform"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelType", propOrder = {
  "content"
})
public class LabelType {

  @XmlElementRef(name = "LabelExpression", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  @XmlMixed
  protected List<Serializable> content;
  @XmlAttribute(name = "transform", namespace = "http://www.opengis.net/gml")
  protected String transform;

  /**
   * Label is mixed -- composed of text and XPath expressions used to extract
   * the useful information from the feature.Gets the value of the content
   * property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the content property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getContent().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
   * <p/>
   *
   */
  public List<Serializable> getContent() {
    if (content == null) {
      content = new ArrayList<Serializable>();
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
   * Gets the value of the transform property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTransform() {
    return transform;
  }

  /**
   * Sets the value of the transform property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTransform(String value) {
    this.transform = value;
  }

  public boolean isSetTransform() {
    return (this.transform != null);
  }
}
