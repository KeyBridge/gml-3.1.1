package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * A clock provides a basis for defining temporal position within a day. A clock
 * must be used with a calendar in order to provide a complete description of a
 * temporal position within a specific day.
 * <p/>
 * <p>Java class for TimeClockType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeClockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="referenceEvent" type="{http://www.opengis.net/gml}StringOrRefType"/>
 *         &lt;element name="referenceTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="utcReference" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="dateBasis" type="{http://www.opengis.net/gml}TimeCalendarPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeClockType", propOrder = {
  "referenceEvent",
  "referenceTime",
  "utcReference",
  "dateBasis"
})
public class TimeClockType
  extends AbstractTimeReferenceSystemType {

  @XmlElement(required = true)
  protected StringOrRefType referenceEvent;
  @XmlElement(required = true)
  @XmlSchemaType(name = "time")
  protected XMLGregorianCalendar referenceTime;
  @XmlElement(required = true)
  @XmlSchemaType(name = "time")
  protected XMLGregorianCalendar utcReference;
  protected List<TimeCalendarPropertyType> dateBasis;

  /**
   * Gets the value of the referenceEvent property.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getReferenceEvent() {
    return referenceEvent;
  }

  /**
   * Sets the value of the referenceEvent property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setReferenceEvent(StringOrRefType value) {
    this.referenceEvent = value;
  }

  public boolean isSetReferenceEvent() {
    return (this.referenceEvent != null);
  }

  /**
   * Gets the value of the referenceTime property.
   * <p/>
   * @return possible object is {@link XMLGregorianCalendar }
   *
   */
  public XMLGregorianCalendar getReferenceTime() {
    return referenceTime;
  }

  /**
   * Sets the value of the referenceTime property.
   * <p/>
   * @param value allowed object is {@link XMLGregorianCalendar }
   *
   */
  public void setReferenceTime(XMLGregorianCalendar value) {
    this.referenceTime = value;
  }

  public boolean isSetReferenceTime() {
    return (this.referenceTime != null);
  }

  /**
   * Gets the value of the utcReference property.
   * <p/>
   * @return possible object is {@link XMLGregorianCalendar }
   *
   */
  public XMLGregorianCalendar getUtcReference() {
    return utcReference;
  }

  /**
   * Sets the value of the utcReference property.
   * <p/>
   * @param value allowed object is {@link XMLGregorianCalendar }
   *
   */
  public void setUtcReference(XMLGregorianCalendar value) {
    this.utcReference = value;
  }

  public boolean isSetUtcReference() {
    return (this.utcReference != null);
  }

  /**
   * Gets the value of the dateBasis property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the dateBasis property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getDateBasis().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TimeCalendarPropertyType }
   *
   *
   */
  public List<TimeCalendarPropertyType> getDateBasis() {
    if (dateBasis == null) {
      dateBasis = new ArrayList<TimeCalendarPropertyType>();
    }
    return this.dateBasis;
  }

  public boolean isSetDateBasis() {
    return ((this.dateBasis != null) && (!this.dateBasis.isEmpty()));
  }

  public void unsetDateBasis() {
    this.dateBasis = null;
  }
}
