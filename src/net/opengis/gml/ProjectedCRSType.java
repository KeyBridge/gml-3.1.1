package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A 2D coordinate reference system used to approximate the shape of the earth
 * on a planar surface, but in such a way that the distortion that is inherent
 * to the approximation is carefully controlled and known. Distortion correction
 * is commonly applied to calculated bearings and distances to produce values
 * that are a close match to actual field values.
 * <p/>
 * Java class for ProjectedCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ProjectedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesCartesianCS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedCRSType", propOrder = {
  "usesCartesianCS"
})
public class ProjectedCRSType
  extends AbstractGeneralDerivedCRSType {

  @XmlElement(required = true)
  protected CartesianCSRefType usesCartesianCS;

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
}
