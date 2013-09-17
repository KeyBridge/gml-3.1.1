package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A value in the time domain is measured relative to a temporal reference
 * system. Common types of reference systems include calendars, ordinal temporal
 * reference systems, and temporal coordinate systems (time elapsed since some
 * epoch, e.g. UNIX time).
 * <p/>
 * Java class for AbstractTimeReferenceSystemType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractTimeReferenceSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence>
 *         &lt;element name="domainOfValidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeReferenceSystemType", propOrder = {
  "domainOfValidity"
})
@XmlSeeAlso({
  TimeClockType.class,
  TimeCalendarType.class,
  TimeCoordinateSystemType.class,
  TimeOrdinalReferenceSystemType.class
})
public abstract class AbstractTimeReferenceSystemType
  extends DefinitionType {

  protected String domainOfValidity;

  /**
   * Gets the value of the domainOfValidity property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getDomainOfValidity() {
    return domainOfValidity;
  }

  /**
   * Sets the value of the domainOfValidity property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setDomainOfValidity(String value) {
    this.domainOfValidity = value;
  }

  public boolean isSetDomainOfValidity() {
    return (this.domainOfValidity != null);
  }
}
