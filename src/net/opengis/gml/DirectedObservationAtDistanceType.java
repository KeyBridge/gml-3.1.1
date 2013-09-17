package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for DirectedObservationAtDistanceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DirectedObservationAtDistanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DirectedObservationType">
 *       &lt;sequence>
 *         &lt;element name="distance" type="{http://www.opengis.net/gml}MeasureType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectedObservationAtDistanceType", propOrder = {
  "distance"
})
public class DirectedObservationAtDistanceType
  extends DirectedObservationType {

  @XmlElement(required = true)
  protected MeasureType distance;

  /**
   * Gets the value of the distance property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getDistance() {
    return distance;
  }

  /**
   * Sets the value of the distance property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setDistance(MeasureType value) {
    this.distance = value;
  }

  public boolean isSetDistance() {
    return (this.distance != null);
  }
}
