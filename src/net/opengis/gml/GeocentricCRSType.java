package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A 3D coordinate reference system with the origin at the approximate centre of
 * mass of the earth. A geocentric CRS deals with the earth's curvature by
 * taking a 3D spatial view, which obviates the need to model the earth's
 * curvature.
 * <p/>
 * Java class for GeocentricCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GeocentricCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}usesCartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml}usesSphericalCS"/>
 *         &lt;/choice>
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
@XmlType(name = "GeocentricCRSType", propOrder = {
  "usesCartesianCS",
  "usesSphericalCS",
  "usesGeodeticDatum"
})
public class GeocentricCRSType
  extends AbstractReferenceSystemType {

  protected CartesianCSRefType usesCartesianCS;
  protected SphericalCSRefType usesSphericalCS;
  @XmlElement(required = true)
  protected GeodeticDatumRefType usesGeodeticDatum;

  /**
   * Gets the value of the usesCartesianCS property.
   * <p/>
   * @return possible object is {@link CartesianCSRefType }
   *
   */
  public CartesianCSRefType getUsesCartesianCS() {
    return usesCartesianCS;
  }

  /**
   * Sets the value of the usesCartesianCS property.
   * <p/>
   * @param value allowed object is {@link CartesianCSRefType }
   *
   */
  public void setUsesCartesianCS(CartesianCSRefType value) {
    this.usesCartesianCS = value;
  }

  public boolean isSetUsesCartesianCS() {
    return (this.usesCartesianCS != null);
  }

  /**
   * Gets the value of the usesSphericalCS property.
   * <p/>
   * @return possible object is {@link SphericalCSRefType }
   *
   */
  public SphericalCSRefType getUsesSphericalCS() {
    return usesSphericalCS;
  }

  /**
   * Sets the value of the usesSphericalCS property.
   * <p/>
   * @param value allowed object is {@link SphericalCSRefType }
   *
   */
  public void setUsesSphericalCS(SphericalCSRefType value) {
    this.usesSphericalCS = value;
  }

  public boolean isSetUsesSphericalCS() {
    return (this.usesSphericalCS != null);
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
