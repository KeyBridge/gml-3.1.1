package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A 1D coordinate reference system used for recording heights or depths.
 * Vertical CRSs make use of the direction of gravity to define the concept of
 * height or depth, but the relationship with gravity may not be
 * straightforward. By implication, ellipsoidal heights (h) cannot be captured
 * in a vertical coordinate reference system. Ellipsoidal heights cannot exist
 * independently, but only as an inseparable part of a 3D coordinate tuple
 * defined in a geographic 3D coordinate reference system.
 * <p/>
 * <p>Java class for VerticalCRSType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="VerticalCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesVerticalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesVerticalDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCRSType", propOrder = {
  "usesVerticalCS",
  "usesVerticalDatum"
})
public class VerticalCRSType
  extends AbstractReferenceSystemType {

  @XmlElement(required = true)
  protected VerticalCSRefType usesVerticalCS;
  @XmlElement(required = true)
  protected VerticalDatumRefType usesVerticalDatum;

  /**
   * Gets the value of the usesVerticalCS property.
   * <p/>
   * @return possible object is {@link VerticalCSRefType }
   *
   */
  public VerticalCSRefType getUsesVerticalCS() {
    return usesVerticalCS;
  }

  /**
   * Sets the value of the usesVerticalCS property.
   * <p/>
   * @param value allowed object is {@link VerticalCSRefType }
   *
   */
  public void setUsesVerticalCS(VerticalCSRefType value) {
    this.usesVerticalCS = value;
  }

  public boolean isSetUsesVerticalCS() {
    return (this.usesVerticalCS != null);
  }

  /**
   * Gets the value of the usesVerticalDatum property.
   * <p/>
   * @return possible object is {@link VerticalDatumRefType }
   *
   */
  public VerticalDatumRefType getUsesVerticalDatum() {
    return usesVerticalDatum;
  }

  /**
   * Sets the value of the usesVerticalDatum property.
   * <p/>
   * @param value allowed object is {@link VerticalDatumRefType }
   *
   */
  public void setUsesVerticalDatum(VerticalDatumRefType value) {
    this.usesVerticalDatum = value;
  }

  public boolean isSetUsesVerticalDatum() {
    return (this.usesVerticalDatum != null);
  }
}
