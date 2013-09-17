package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Position error estimate (or accuracy) data.
 * <p/>
 * Java class for AbstractPositionalAccuracyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractPositionalAccuracyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}measureDescription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractPositionalAccuracyType", propOrder = {
  "measureDescription"
})
@XmlSeeAlso({
  RelativeInternalPositionalAccuracyType.class,
  CovarianceMatrixType.class,
  AbsoluteExternalPositionalAccuracyType.class
})
public abstract class AbstractPositionalAccuracyType {

  protected CodeType measureDescription;

  /**
   * Gets the value of the measureDescription property.
   * <p/>
   * @return possible object is {@link CodeType }
   *
   */
  public CodeType getMeasureDescription() {
    return measureDescription;
  }

  /**
   * Sets the value of the measureDescription property.
   * <p/>
   * @param value allowed object is {@link CodeType }
   *
   */
  public void setMeasureDescription(CodeType value) {
    this.measureDescription = value;
  }

  public boolean isSetMeasureDescription() {
    return (this.measureDescription != null);
  }
}
