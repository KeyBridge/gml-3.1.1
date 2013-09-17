package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A temporal coordinate system is based on a continuous interval scale defined
 * in terms of a single time interval.
 * <p/>
 * <p>Java class for TimeCoordinateSystemType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeCoordinateSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="originPosition" type="{http://www.opengis.net/gml}TimePositionType"/>
 *           &lt;element name="origin" type="{http://www.opengis.net/gml}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;element name="interval" type="{http://www.opengis.net/gml}TimeIntervalLengthType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCoordinateSystemType", propOrder = {
  "originPosition",
  "origin",
  "interval"
})
public class TimeCoordinateSystemType
  extends AbstractTimeReferenceSystemType {

  protected TimePositionType originPosition;
  protected TimeInstantPropertyType origin;
  @XmlElement(required = true)
  protected TimeIntervalLengthType interval;

  /**
   * Gets the value of the originPosition property.
   * <p/>
   * @return possible object is {@link TimePositionType }
   *
   */
  public TimePositionType getOriginPosition() {
    return originPosition;
  }

  /**
   * Sets the value of the originPosition property.
   * <p/>
   * @param value allowed object is {@link TimePositionType }
   *
   */
  public void setOriginPosition(TimePositionType value) {
    this.originPosition = value;
  }

  public boolean isSetOriginPosition() {
    return (this.originPosition != null);
  }

  /**
   * Gets the value of the origin property.
   * <p/>
   * @return possible object is {@link TimeInstantPropertyType }
   *
   */
  public TimeInstantPropertyType getOrigin() {
    return origin;
  }

  /**
   * Sets the value of the origin property.
   * <p/>
   * @param value allowed object is {@link TimeInstantPropertyType }
   *
   */
  public void setOrigin(TimeInstantPropertyType value) {
    this.origin = value;
  }

  public boolean isSetOrigin() {
    return (this.origin != null);
  }

  /**
   * Gets the value of the interval property.
   * <p/>
   * @return possible object is {@link TimeIntervalLengthType }
   *
   */
  public TimeIntervalLengthType getInterval() {
    return interval;
  }

  /**
   * Sets the value of the interval property.
   * <p/>
   * @param value allowed object is {@link TimeIntervalLengthType }
   *
   */
  public void setInterval(TimeIntervalLengthType value) {
    this.interval = value;
  }

  public boolean isSetInterval() {
    return (this.interval != null);
  }
}
