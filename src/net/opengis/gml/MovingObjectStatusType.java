package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * This type encapsulates various dynamic properties of moving objects (points,
 * lines, regions). It is useful for dealing with features whose geometry or
 * topology changes over time.
 * <p/>
 * Java class for MovingObjectStatusType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="MovingObjectStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeSliceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}location"/>
 *         &lt;element name="speed" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="bearing" type="{http://www.opengis.net/gml}DirectionPropertyType" minOccurs="0"/>
 *         &lt;element name="acceleration" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element name="elevation" type="{http://www.opengis.net/gml}MeasureType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovingObjectStatusType", propOrder = {
  "location",
  "speed",
  "bearing",
  "acceleration",
  "elevation",
  "status"
})
public class MovingObjectStatusType
  extends AbstractTimeSliceType {

  @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
  protected JAXBElement<? extends LocationPropertyType> location;
  protected MeasureType speed;
  protected DirectionPropertyType bearing;
  protected MeasureType acceleration;
  protected MeasureType elevation;
  protected StringOrRefType status;

  /**
   * Gets the value of the location property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends LocationPropertyType> getLocation() {
    return location;
  }

  /**
   * Sets the value of the location property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
   * <p/>
   */
  public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
    this.location = value;
  }

  public boolean isSetLocation() {
    return (this.location != null);
  }

  /**
   * Gets the value of the speed property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getSpeed() {
    return speed;
  }

  /**
   * Sets the value of the speed property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setSpeed(MeasureType value) {
    this.speed = value;
  }

  public boolean isSetSpeed() {
    return (this.speed != null);
  }

  /**
   * Gets the value of the bearing property.
   * <p/>
   * @return possible object is {@link DirectionPropertyType }
   *
   */
  public DirectionPropertyType getBearing() {
    return bearing;
  }

  /**
   * Sets the value of the bearing property.
   * <p/>
   * @param value allowed object is {@link DirectionPropertyType }
   *
   */
  public void setBearing(DirectionPropertyType value) {
    this.bearing = value;
  }

  public boolean isSetBearing() {
    return (this.bearing != null);
  }

  /**
   * Gets the value of the acceleration property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getAcceleration() {
    return acceleration;
  }

  /**
   * Sets the value of the acceleration property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setAcceleration(MeasureType value) {
    this.acceleration = value;
  }

  public boolean isSetAcceleration() {
    return (this.acceleration != null);
  }

  /**
   * Gets the value of the elevation property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getElevation() {
    return elevation;
  }

  /**
   * Sets the value of the elevation property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setElevation(MeasureType value) {
    this.elevation = value;
  }

  public boolean isSetElevation() {
    return (this.elevation != null);
  }

  /**
   * Gets the value of the status property.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setStatus(StringOrRefType value) {
    this.status = value;
  }

  public boolean isSetStatus() {
    return (this.status != null);
  }
}
