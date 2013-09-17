package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Encapsulates a ring to represent properties in features or geometry
 * collections.
 * <p/>
 * Java class for LinearRingPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="LinearRingPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}LinearRing"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearRingPropertyType", propOrder = {
  "linearRing"
})
public class LinearRingPropertyType {

  @XmlElement(name = "LinearRing")
  protected LinearRingType linearRing;

  /**
   * Gets the value of the linearRing property.
   * <p/>
   * @return possible object is {@link LinearRingType }
   *
   */
  public LinearRingType getLinearRing() {
    return linearRing;
  }

  /**
   * Sets the value of the linearRing property.
   * <p/>
   * @param value allowed object is {@link LinearRingType }
   *
   */
  public void setLinearRing(LinearRingType value) {
    this.linearRing = value;
  }

  public boolean isSetLinearRing() {
    return (this.linearRing != null);
  }
}
