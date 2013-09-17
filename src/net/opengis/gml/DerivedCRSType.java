package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A coordinate reference system that is defined by its coordinate conversion
 * from another coordinate reference system but is not a projected coordinate
 * reference system. This category includes coordinate reference systems derived
 * from a projected coordinate reference system.
 * <p/>
 * Java class for DerivedCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}derivedCRSType"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedCRSType", propOrder = {
  "derivedCRSType",
  "usesCS"
})
public class DerivedCRSType
  extends AbstractGeneralDerivedCRSType {

  @XmlElement(required = true)
  protected DerivedCRSTypeType derivedCRSType;
  @XmlElement(required = true)
  protected CoordinateSystemRefType usesCS;

  /**
   * Gets the value of the derivedCRSType property.
   * <p/>
   * @return possible object is {@link DerivedCRSTypeType }
   *
   */
  public DerivedCRSTypeType getDerivedCRSType() {
    return derivedCRSType;
  }

  /**
   * Sets the value of the derivedCRSType property.
   * <p/>
   * @param value allowed object is {@link DerivedCRSTypeType }
   *
   */
  public void setDerivedCRSType(DerivedCRSTypeType value) {
    this.derivedCRSType = value;
  }

  public boolean isSetDerivedCRSType() {
    return (this.derivedCRSType != null);
  }

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
}
