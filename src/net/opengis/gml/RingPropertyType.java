package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encapsulates a ring to represent properties in features or geometry
 * collections.
 * <p/>
 * Java class for RingPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="RingPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}Ring"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RingPropertyType", propOrder = {
  "ring"
})
public class RingPropertyType {

  @XmlElement(name = "Ring", required = true)
  protected RingType ring;

  /**
   * Gets the value of the ring property.
   * <p/>
   * @return possible object is {@link RingType }
   *
   */
  public RingType getRing() {
    return ring;
  }

  /**
   * Sets the value of the ring property.
   * <p/>
   * @param value allowed object is {@link RingType }
   *
   */
  public void setRing(RingType value) {
    this.ring = value;
  }

  public boolean isSetRing() {
    return (this.ring != null);
  }
}
