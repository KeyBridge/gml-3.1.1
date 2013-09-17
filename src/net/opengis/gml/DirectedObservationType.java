package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for DirectedObservationType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DirectedObservationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}ObservationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}direction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectedObservationType", propOrder = {
  "direction"
})
@XmlSeeAlso({
  DirectedObservationAtDistanceType.class
})
public class DirectedObservationType
  extends ObservationType {

  @XmlElement(required = true)
  protected DirectionPropertyType direction;

  /**
   * Gets the value of the direction property.
   * <p/>
   * @return possible object is {@link DirectionPropertyType }
   *
   */
  public DirectionPropertyType getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   * <p/>
   * @param value allowed object is {@link DirectionPropertyType }
   *
   */
  public void setDirection(DirectionPropertyType value) {
    this.direction = value;
  }

  public boolean isSetDirection() {
    return (this.direction != null);
  }
}
