package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;

/**
 * <p>Java class for TimePeriodType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimePeriodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeGeometricPrimitiveType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="beginPosition" type="{http://www.opengis.net/gml}TimePositionType"/>
 *           &lt;element name="begin" type="{http://www.opengis.net/gml}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="endPosition" type="{http://www.opengis.net/gml}TimePositionType"/>
 *           &lt;element name="end" type="{http://www.opengis.net/gml}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.opengis.net/gml}timeLength" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodType", propOrder = {
  "beginPosition",
  "begin",
  "endPosition",
  "end",
  "duration",
  "timeInterval"
})
public class TimePeriodType
  extends AbstractTimeGeometricPrimitiveType {

  protected TimePositionType beginPosition;
  protected TimeInstantPropertyType begin;
  protected TimePositionType endPosition;
  protected TimeInstantPropertyType end;
  protected Duration duration;
  protected TimeIntervalLengthType timeInterval;

  /**
   * Gets the value of the beginPosition property.
   * <p/>
   * @return possible object is {@link TimePositionType }
   *
   */
  public TimePositionType getBeginPosition() {
    return beginPosition;
  }

  /**
   * Sets the value of the beginPosition property.
   * <p/>
   * @param value allowed object is {@link TimePositionType }
   *
   */
  public void setBeginPosition(TimePositionType value) {
    this.beginPosition = value;
  }

  public boolean isSetBeginPosition() {
    return (this.beginPosition != null);
  }

  /**
   * Gets the value of the begin property.
   * <p/>
   * @return possible object is {@link TimeInstantPropertyType }
   *
   */
  public TimeInstantPropertyType getBegin() {
    return begin;
  }

  /**
   * Sets the value of the begin property.
   * <p/>
   * @param value allowed object is {@link TimeInstantPropertyType }
   *
   */
  public void setBegin(TimeInstantPropertyType value) {
    this.begin = value;
  }

  public boolean isSetBegin() {
    return (this.begin != null);
  }

  /**
   * Gets the value of the endPosition property.
   * <p/>
   * @return possible object is {@link TimePositionType }
   *
   */
  public TimePositionType getEndPosition() {
    return endPosition;
  }

  /**
   * Sets the value of the endPosition property.
   * <p/>
   * @param value allowed object is {@link TimePositionType }
   *
   */
  public void setEndPosition(TimePositionType value) {
    this.endPosition = value;
  }

  public boolean isSetEndPosition() {
    return (this.endPosition != null);
  }

  /**
   * Gets the value of the end property.
   * <p/>
   * @return possible object is {@link TimeInstantPropertyType }
   *
   */
  public TimeInstantPropertyType getEnd() {
    return end;
  }

  /**
   * Sets the value of the end property.
   * <p/>
   * @param value allowed object is {@link TimeInstantPropertyType }
   *
   */
  public void setEnd(TimeInstantPropertyType value) {
    this.end = value;
  }

  public boolean isSetEnd() {
    return (this.end != null);
  }

  /**
   * Gets the value of the duration property.
   * <p/>
   * @return possible object is {@link Duration }
   *
   */
  public Duration getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   * <p/>
   * @param value allowed object is {@link Duration }
   *
   */
  public void setDuration(Duration value) {
    this.duration = value;
  }

  public boolean isSetDuration() {
    return (this.duration != null);
  }

  /**
   * Gets the value of the timeInterval property.
   * <p/>
   * @return possible object is {@link TimeIntervalLengthType }
   *
   */
  public TimeIntervalLengthType getTimeInterval() {
    return timeInterval;
  }

  /**
   * Sets the value of the timeInterval property.
   * <p/>
   * @param value allowed object is {@link TimeIntervalLengthType }
   *
   */
  public void setTimeInterval(TimeIntervalLengthType value) {
    this.timeInterval = value;
  }

  public boolean isSetTimeInterval() {
    return (this.timeInterval != null);
  }
}
