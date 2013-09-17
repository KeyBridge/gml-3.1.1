package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Type declaration of the element "TimeEdge".
 * <p/>
 * <p>Java class for TimeEdgeType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeEdgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeTopologyPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://www.opengis.net/gml}TimeNodePropertyType"/>
 *         &lt;element name="end" type="{http://www.opengis.net/gml}TimeNodePropertyType"/>
 *         &lt;element name="extent" type="{http://www.opengis.net/gml}TimePeriodPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeEdgeType", propOrder = {
  "start",
  "end",
  "extent"
})
public class TimeEdgeType
  extends AbstractTimeTopologyPrimitiveType {

  @XmlElement(required = true)
  protected TimeNodePropertyType start;
  @XmlElement(required = true)
  protected TimeNodePropertyType end;
  protected TimePeriodPropertyType extent;

  /**
   * Gets the value of the start property.
   * <p/>
   * @return possible object is {@link TimeNodePropertyType }
   *
   */
  public TimeNodePropertyType getStart() {
    return start;
  }

  /**
   * Sets the value of the start property.
   * <p/>
   * @param value allowed object is {@link TimeNodePropertyType }
   *
   */
  public void setStart(TimeNodePropertyType value) {
    this.start = value;
  }

  public boolean isSetStart() {
    return (this.start != null);
  }

  /**
   * Gets the value of the end property.
   * <p/>
   * @return possible object is {@link TimeNodePropertyType }
   *
   */
  public TimeNodePropertyType getEnd() {
    return end;
  }

  /**
   * Sets the value of the end property.
   * <p/>
   * @param value allowed object is {@link TimeNodePropertyType }
   *
   */
  public void setEnd(TimeNodePropertyType value) {
    this.end = value;
  }

  public boolean isSetEnd() {
    return (this.end != null);
  }

  /**
   * Gets the value of the extent property.
   * <p/>
   * @return possible object is {@link TimePeriodPropertyType }
   *
   */
  public TimePeriodPropertyType getExtent() {
    return extent;
  }

  /**
   * Sets the value of the extent property.
   * <p/>
   * @param value allowed object is {@link TimePeriodPropertyType }
   *
   */
  public void setExtent(TimePeriodPropertyType value) {
    this.extent = value;
  }

  public boolean isSetExtent() {
    return (this.extent != null);
  }
}
