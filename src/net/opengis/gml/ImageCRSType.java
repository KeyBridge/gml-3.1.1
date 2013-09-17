package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An engineering coordinate reference system applied to locations in images.
 * Image coordinate reference systems are treated as a separate sub-type because
 * a separate user community exists for images with its own terms of reference.
 * <p/>
 * Java class for ImageCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ImageCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}usesCartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml}usesObliqueCartesianCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}usesImageDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCRSType", propOrder = {
  "usesCartesianCS",
  "usesObliqueCartesianCS",
  "usesImageDatum"
})
public class ImageCRSType
  extends AbstractReferenceSystemType {

  protected CartesianCSRefType usesCartesianCS;
  protected ObliqueCartesianCSRefType usesObliqueCartesianCS;
  @XmlElement(required = true)
  protected ImageDatumRefType usesImageDatum;

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
   * Gets the value of the usesObliqueCartesianCS property.
   * <p/>
   * @return possible object is {@link ObliqueCartesianCSRefType }
   *
   */
  public ObliqueCartesianCSRefType getUsesObliqueCartesianCS() {
    return usesObliqueCartesianCS;
  }

  /**
   * Sets the value of the usesObliqueCartesianCS property.
   * <p/>
   * @param value allowed object is {@link ObliqueCartesianCSRefType }
   *
   */
  public void setUsesObliqueCartesianCS(ObliqueCartesianCSRefType value) {
    this.usesObliqueCartesianCS = value;
  }

  public boolean isSetUsesObliqueCartesianCS() {
    return (this.usesObliqueCartesianCS != null);
  }

  /**
   * Gets the value of the usesImageDatum property.
   * <p/>
   * @return possible object is {@link ImageDatumRefType }
   *
   */
  public ImageDatumRefType getUsesImageDatum() {
    return usesImageDatum;
  }

  /**
   * Sets the value of the usesImageDatum property.
   * <p/>
   * @param value allowed object is {@link ImageDatumRefType }
   *
   */
  public void setUsesImageDatum(ImageDatumRefType value) {
    this.usesImageDatum = value;
  }

  public boolean isSetUsesImageDatum() {
    return (this.usesImageDatum != null);
  }
}
