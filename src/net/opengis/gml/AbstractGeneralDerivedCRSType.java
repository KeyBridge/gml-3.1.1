package net.opengis.gml;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A coordinate reference system that is defined by its coordinate conversion
 * from another coordinate reference system (not by a datum). This abstract
 * complexType shall not be used, extended, or restricted, in an Application
 * Schema, to define a concrete subtype with a meaning equivalent to a concrete
 * subtype specified in this document.
 * <p/>
 * Java class for AbstractGeneralDerivedCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractGeneralDerivedCRSType">
 * &lt;complexContent> &lt;extension
 * base="{http://www.opengis.net/gml}AbstractReferenceSystemType"> &lt;sequence>
 * &lt;element ref="{http://www.opengis.net/gml}baseCRS"/> &lt;element
 * ref="{http://www.opengis.net/gml}definedByConversion"/> &lt;/sequence>
 * &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralDerivedCRSType", propOrder = {
  "baseCRS",
  "definedByConversion"
})
@XmlSeeAlso({
  DerivedCRSType.class,
  ProjectedCRSType.class
})
public abstract class AbstractGeneralDerivedCRSType extends AbstractReferenceSystemType {

  @XmlElement(required = true)
  protected CoordinateReferenceSystemRefType baseCRS;
  @XmlElement(required = true)
  protected GeneralConversionRefType definedByConversion;

  /**
   * Gets the value of the baseCRS property.
   * <p/>
   * @return possible object is {@link CoordinateReferenceSystemRefType }
   *
   */
  public CoordinateReferenceSystemRefType getBaseCRS() {
    return baseCRS;
  }

  /**
   * Sets the value of the baseCRS property.
   * <p/>
   * @param value allowed object is {@link CoordinateReferenceSystemRefType }
   *
   */
  public void setBaseCRS(CoordinateReferenceSystemRefType value) {
    this.baseCRS = value;
  }

  public boolean isSetBaseCRS() {
    return (this.baseCRS != null);
  }

  /**
   * Gets the value of the definedByConversion property.
   * <p/>
   * @return possible object is {@link GeneralConversionRefType }
   *
   */
  public GeneralConversionRefType getDefinedByConversion() {
    return definedByConversion;
  }

  /**
   * Sets the value of the definedByConversion property.
   * <p/>
   * @param value allowed object is {@link GeneralConversionRefType }
   *
   */
  public void setDefinedByConversion(GeneralConversionRefType value) {
    this.definedByConversion = value;
  }

  public boolean isSetDefinedByConversion() {
    return (this.definedByConversion != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.baseCRS);
    hash = 97 * hash + Objects.hashCode(this.definedByConversion);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final AbstractGeneralDerivedCRSType other = (AbstractGeneralDerivedCRSType) obj;
    if (!Objects.equals(this.baseCRS, other.baseCRS)) {
      return false;
    }
    if (!Objects.equals(this.definedByConversion, other.definedByConversion)) {
      return false;
    }
    return true;
  }
}
