package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A 1D coordinate reference system used for the recording of time.
 * <p/>
 * <p>Java class for TemporalCRSType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TemporalCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesTemporalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesTemporalDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalCRSType", propOrder = {
  "usesTemporalCS",
  "usesTemporalDatum"
})
public class TemporalCRSType
  extends AbstractReferenceSystemType {

  @XmlElement(required = true)
  protected TemporalCSRefType usesTemporalCS;
  @XmlElement(required = true)
  protected TemporalDatumRefType usesTemporalDatum;

  /**
   * Gets the value of the usesTemporalCS property.
   * <p/>
   * @return possible object is {@link TemporalCSRefType }
   *
   */
  public TemporalCSRefType getUsesTemporalCS() {
    return usesTemporalCS;
  }

  /**
   * Sets the value of the usesTemporalCS property.
   * <p/>
   * @param value allowed object is {@link TemporalCSRefType }
   *
   */
  public void setUsesTemporalCS(TemporalCSRefType value) {
    this.usesTemporalCS = value;
  }

  public boolean isSetUsesTemporalCS() {
    return (this.usesTemporalCS != null);
  }

  /**
   * Gets the value of the usesTemporalDatum property.
   * <p/>
   * @return possible object is {@link TemporalDatumRefType }
   *
   */
  public TemporalDatumRefType getUsesTemporalDatum() {
    return usesTemporalDatum;
  }

  /**
   * Sets the value of the usesTemporalDatum property.
   * <p/>
   * @param value allowed object is {@link TemporalDatumRefType }
   *
   */
  public void setUsesTemporalDatum(TemporalDatumRefType value) {
    this.usesTemporalDatum = value;
  }

  public boolean isSetUsesTemporalDatum() {
    return (this.usesTemporalDatum != null);
  }
}
