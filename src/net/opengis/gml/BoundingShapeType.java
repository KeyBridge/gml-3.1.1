package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

/**
 * Bounding shape.
 * <p/>
 * Java class for BoundingShapeType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="BoundingShapeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}Envelope"/>
 *           &lt;element ref="{http://www.opengis.net/gml}Null"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingShapeType", propOrder = {
  "envelope",
  "_null"
})
public class BoundingShapeType {

  @XmlElementRef(name = "Envelope", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends EnvelopeType> envelope;
  @XmlList
  @XmlElement(name = "Null")
  protected List<String> _null;

  /**
   * Gets the value of the envelope property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends EnvelopeType> getEnvelope() {
    return envelope;
  }

  /**
   * Sets the value of the envelope property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
   * <p/>
   */
  public void setEnvelope(JAXBElement<? extends EnvelopeType> value) {
    this.envelope = value;
  }

  public boolean isSetEnvelope() {
    return (this.envelope != null);
  }

  /**
   * Gets the value of the null property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the null property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNull().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link String }
   *
   *
   */
  public List<String> getNull() {
    if (_null == null) {
      _null = new ArrayList<String>();
    }
    return this._null;
  }

  public boolean isSetNull() {
    return ((this._null != null) && (!this._null.isEmpty()));
  }

  public void unsetNull() {
    this._null = null;
  }
}
