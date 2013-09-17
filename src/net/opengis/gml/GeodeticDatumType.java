package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A geodetic datum defines the precise location and orientation in
 * 3-dimensional space of a defined ellipsoid (or sphere) that approximates the
 * shape of the earth, or of a Cartesian coordinate system centered in this
 * ellipsoid (or sphere).
 * <p/>
 * Java class for GeodeticDatumType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GeodeticDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesPrimeMeridian"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesEllipsoid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
  "usesPrimeMeridian",
  "usesEllipsoid"
})
public class GeodeticDatumType
  extends AbstractDatumType {

  @XmlElement(required = true)
  protected PrimeMeridianRefType usesPrimeMeridian;
  @XmlElement(required = true)
  protected EllipsoidRefType usesEllipsoid;

  /**
   * Gets the value of the usesPrimeMeridian property.
   * <p/>
   * @return possible object is {@link PrimeMeridianRefType }
   *
   */
  public PrimeMeridianRefType getUsesPrimeMeridian() {
    return usesPrimeMeridian;
  }

  /**
   * Sets the value of the usesPrimeMeridian property.
   * <p/>
   * @param value allowed object is {@link PrimeMeridianRefType }
   *
   */
  public void setUsesPrimeMeridian(PrimeMeridianRefType value) {
    this.usesPrimeMeridian = value;
  }

  public boolean isSetUsesPrimeMeridian() {
    return (this.usesPrimeMeridian != null);
  }

  /**
   * Gets the value of the usesEllipsoid property.
   * <p/>
   * @return possible object is {@link EllipsoidRefType }
   *
   */
  public EllipsoidRefType getUsesEllipsoid() {
    return usesEllipsoid;
  }

  /**
   * Sets the value of the usesEllipsoid property.
   * <p/>
   * @param value allowed object is {@link EllipsoidRefType }
   *
   */
  public void setUsesEllipsoid(EllipsoidRefType value) {
    this.usesEllipsoid = value;
  }

  public boolean isSetUsesEllipsoid() {
    return (this.usesEllipsoid != null);
  }
}
