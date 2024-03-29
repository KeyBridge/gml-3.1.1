package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A contextually local coordinate reference system; which can be divided into
 * two broad categories: - earth-fixed systems applied to engineering activities
 * on or near the surface of the earth; - CRSs on moving platforms such as road
 * vehicles, vessels, aircraft, or spacecraft. For further information, see OGC
 * Abstract Specification Topic 2.
 * <p/>
 * Java class for EngineeringCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="EngineeringCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEngineeringDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
  "usesCS",
  "usesEngineeringDatum"
})
public class EngineeringCRSType
  extends AbstractReferenceSystemType {

  @XmlElement(required = true)
  protected CoordinateSystemRefType usesCS;
  @XmlElement(required = true)
  protected EngineeringDatumRefType usesEngineeringDatum;

  /**
   * Gets the value of the usesCS property.
   * <p/>
   * @return possible object is {@link CoordinateSystemRefType }
   *
   */
  public CoordinateSystemRefType getUsesCS() {
    return usesCS;
  }

  /**
   * Sets the value of the usesCS property.
   * <p/>
   * @param value allowed object is {@link CoordinateSystemRefType }
   *
   */
  public void setUsesCS(CoordinateSystemRefType value) {
    this.usesCS = value;
  }

  public boolean isSetUsesCS() {
    return (this.usesCS != null);
  }

  /**
   * Gets the value of the usesEngineeringDatum property.
   * <p/>
   * @return possible object is {@link EngineeringDatumRefType }
   *
   */
  public EngineeringDatumRefType getUsesEngineeringDatum() {
    return usesEngineeringDatum;
  }

  /**
   * Sets the value of the usesEngineeringDatum property.
   * <p/>
   * @param value allowed object is {@link EngineeringDatumRefType }
   *
   */
  public void setUsesEngineeringDatum(EngineeringDatumRefType value) {
    this.usesEngineeringDatum = value;
  }

  public boolean isSetUsesEngineeringDatum() {
    return (this.usesEngineeringDatum != null);
  }
}
