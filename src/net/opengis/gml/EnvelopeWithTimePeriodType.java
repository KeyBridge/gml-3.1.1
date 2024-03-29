package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Envelope that includes also a temporal extent.
 * <p/>
 * Java class for EnvelopeWithTimePeriodType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="EnvelopeWithTimePeriodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}EnvelopeType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}timePosition" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="frame" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="#ISO-8601" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeWithTimePeriodType", propOrder = {
  "timePosition"
})
public class EnvelopeWithTimePeriodType
  extends EnvelopeType {

  @XmlElement(required = true)
  protected List<TimePositionType> timePosition;
  @XmlAttribute(name = "frame")
  @XmlSchemaType(name = "anyURI")
  protected String frame;

  /**
   * Gets the value of the timePosition property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the timePosition property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTimePosition().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link TimePositionType }
   *
   *
   */
  public List<TimePositionType> getTimePosition() {
    if (timePosition == null) {
      timePosition = new ArrayList<TimePositionType>();
    }
    return this.timePosition;
  }

  public boolean isSetTimePosition() {
    return ((this.timePosition != null) && (!this.timePosition.isEmpty()));
  }

  public void unsetTimePosition() {
    this.timePosition = null;
  }

  /**
   * Gets the value of the frame property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getFrame() {
    if (frame == null) {
      return "#ISO-8601";
    } else {
      return frame;
    }
  }

  /**
   * Sets the value of the frame property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setFrame(String value) {
    this.frame = value;
  }

  public boolean isSetFrame() {
    return (this.frame != null);
  }
}
