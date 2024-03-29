package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encapsulates a knot to use it in a geometric type.
 * <p/>
 * Java class for KnotPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="KnotPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Knot" type="{http://www.opengis.net/gml}KnotType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnotPropertyType", propOrder = {
  "knot"
})
public class KnotPropertyType {

  @XmlElement(name = "Knot", required = true)
  protected KnotType knot;

  /**
   * Gets the value of the knot property.
   * <p/>
   * @return possible object is {@link KnotType }
   *
   */
  public KnotType getKnot() {
    return knot;
  }

  /**
   * Sets the value of the knot property.
   * <p/>
   * @param value allowed object is {@link KnotType }
   *
   */
  public void setKnot(KnotType value) {
    this.knot = value;
  }

  public boolean isSetKnot() {
    return (this.knot != null);
  }
}
