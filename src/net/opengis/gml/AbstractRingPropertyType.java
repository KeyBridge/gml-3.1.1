package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * Encapsulates a ring to represent the surface boundary property of a surface.
 * <p/>
 * Java class for AbstractRingPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractRingPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Ring"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRingPropertyType", propOrder = {
  "ring"
})
public class AbstractRingPropertyType {

  @XmlElementRef(name = "_Ring", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
  protected JAXBElement<? extends AbstractRingType> ring;

  /**
   * Gets the value of the ring property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RingType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends AbstractRingType> getRing() {
    return ring;
  }

  /**
   * Sets the value of the ring property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RingType }{@code >}
   * <p/>
   */
  public void setRing(JAXBElement<? extends AbstractRingType> value) {
    this.ring = value;
  }

  public boolean isSetRing() {
    return (this.ring != null);
  }
}
