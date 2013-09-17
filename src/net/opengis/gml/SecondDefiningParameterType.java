package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of the second parameter that defines the shape of an ellipsoid. An
 * ellipsoid requires two defining parameters: semi-major axis and inverse
 * flattening or semi-major axis and semi-minor axis. When the reference body is
 * a sphere rather than an ellipsoid, only a single defining parameter is
 * required, namely the radius of the sphere; in that case, the semi-major axis
 * "degenerates" into the radius of the sphere.
 * <p/>
 * Java class for SecondDefiningParameterType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="SecondDefiningParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}inverseFlattening"/>
 *         &lt;element ref="{http://www.opengis.net/gml}semiMinorAxis"/>
 *         &lt;element ref="{http://www.opengis.net/gml}isSphere"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondDefiningParameterType", propOrder = {
  "inverseFlattening",
  "semiMinorAxis",
  "isSphere"
})
public class SecondDefiningParameterType {

  protected MeasureType inverseFlattening;
  protected MeasureType semiMinorAxis;
  protected String isSphere;

  /**
   * Gets the value of the inverseFlattening property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getInverseFlattening() {
    return inverseFlattening;
  }

  /**
   * Sets the value of the inverseFlattening property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setInverseFlattening(MeasureType value) {
    this.inverseFlattening = value;
  }

  public boolean isSetInverseFlattening() {
    return (this.inverseFlattening != null);
  }

  /**
   * Gets the value of the semiMinorAxis property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getSemiMinorAxis() {
    return semiMinorAxis;
  }

  /**
   * Sets the value of the semiMinorAxis property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setSemiMinorAxis(MeasureType value) {
    this.semiMinorAxis = value;
  }

  public boolean isSetSemiMinorAxis() {
    return (this.semiMinorAxis != null);
  }

  /**
   * Gets the value of the isSphere property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getIsSphere() {
    return isSphere;
  }

  /**
   * Sets the value of the isSphere property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setIsSphere(String value) {
    this.isSphere = value;
  }

  public boolean isSetIsSphere() {
    return (this.isSphere != null);
  }
}
