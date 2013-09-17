package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A coordinate reference system based on an ellipsoidal approximation of the
 * geoid; this provides an accurate representation of the geometry of geographic
 * features for a large portion of the earth's surface.
 * <p/>
 * Java class for GeographicCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GeographicCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEllipsoidalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesGeodeticDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicCRSType", propOrder = {
  "usesEllipsoidalCS",
  "usesGeodeticDatum"
})
public class GeographicCRSType
  extends AbstractReferenceSystemType {

  @XmlElement(required = true)
  protected EllipsoidalCSRefType usesEllipsoidalCS;
  @XmlElement(required = true)
  protected GeodeticDatumRefType usesGeodeticDatum;

  /**
   * Gets the value of the usesEllipsoidalCS property.
   * <p/>
   * @return possible object is {@link EllipsoidalCSRefType }
   *
   */
  public EllipsoidalCSRefType getUsesEllipsoidalCS() {
    return usesEllipsoidalCS;
  }

  /**
   * Sets the value of the usesEllipsoidalCS property.
   * <p/>
   * @param value allowed object is {@link EllipsoidalCSRefType }
   *
   */
  public void setUsesEllipsoidalCS(EllipsoidalCSRefType value) {
    this.usesEllipsoidalCS = value;
  }

  public boolean isSetUsesEllipsoidalCS() {
    return (this.usesEllipsoidalCS != null);
  }

  /**
   * Gets the value of the usesGeodeticDatum property.
   * <p/>
   * @return possible object is {@link GeodeticDatumRefType }
   *
   */
  public GeodeticDatumRefType getUsesGeodeticDatum() {
    return usesGeodeticDatum;
  }

  /**
   * Sets the value of the usesGeodeticDatum property.
   * <p/>
   * @param value allowed object is {@link GeodeticDatumRefType }
   *
   */
  public void setUsesGeodeticDatum(GeodeticDatumRefType value) {
    this.usesGeodeticDatum = value;
  }

  public boolean isSetUsesGeodeticDatum() {
    return (this.usesGeodeticDatum != null);
  }
}
