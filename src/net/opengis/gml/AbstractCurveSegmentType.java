package net.opengis.gml;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Curve segment defines a homogeneous segment of a curve.
 * <p/>
 * Java class for AbstractCurveSegmentType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractCurveSegmentType"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;/sequence> &lt;attribute name="numDerivativesAtStart"
 * type="{http://www.w3.org/2001/XMLSchema}integer" default="0" /> &lt;attribute
 * name="numDerivativesAtEnd" type="{http://www.w3.org/2001/XMLSchema}integer"
 * default="0" /> &lt;attribute name="numDerivativeInterior"
 * type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCurveSegmentType")
@XmlSeeAlso({
  GeodesicStringType.class,
  LineStringSegmentType.class,
  ArcStringType.class,
  BSplineType.class,
  OffsetCurveType.class,
  ClothoidType.class,
  CubicSplineType.class,
  ArcByCenterPointType.class,
  ArcStringByBulgeType.class
})
public abstract class AbstractCurveSegmentType {

  @XmlAttribute(name = "numDerivativesAtStart")
  protected BigInteger numDerivativesAtStart;
  @XmlAttribute(name = "numDerivativesAtEnd")
  protected BigInteger numDerivativesAtEnd;
  @XmlAttribute(name = "numDerivativeInterior")
  protected BigInteger numDerivativeInterior;

  /**
   * Gets the value of the numDerivativesAtStart property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getNumDerivativesAtStart() {
    if (numDerivativesAtStart == null) {
      return new BigInteger("0");
    } else {
      return numDerivativesAtStart;
    }
  }

  /**
   * Sets the value of the numDerivativesAtStart property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setNumDerivativesAtStart(BigInteger value) {
    this.numDerivativesAtStart = value;
  }

  public boolean isSetNumDerivativesAtStart() {
    return (this.numDerivativesAtStart != null);
  }

  /**
   * Gets the value of the numDerivativesAtEnd property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getNumDerivativesAtEnd() {
    if (numDerivativesAtEnd == null) {
      return new BigInteger("0");
    } else {
      return numDerivativesAtEnd;
    }
  }

  /**
   * Sets the value of the numDerivativesAtEnd property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setNumDerivativesAtEnd(BigInteger value) {
    this.numDerivativesAtEnd = value;
  }

  public boolean isSetNumDerivativesAtEnd() {
    return (this.numDerivativesAtEnd != null);
  }

  /**
   * Gets the value of the numDerivativeInterior property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getNumDerivativeInterior() {
    if (numDerivativeInterior == null) {
      return new BigInteger("0");
    } else {
      return numDerivativeInterior;
    }
  }

  /**
   * Sets the value of the numDerivativeInterior property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setNumDerivativeInterior(BigInteger value) {
    this.numDerivativeInterior = value;
  }

  public boolean isSetNumDerivativeInterior() {
    return (this.numDerivativeInterior != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 43 * hash + Objects.hashCode(this.numDerivativesAtStart);
    hash = 43 * hash + Objects.hashCode(this.numDerivativesAtEnd);
    hash = 43 * hash + Objects.hashCode(this.numDerivativeInterior);
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
    final AbstractCurveSegmentType other = (AbstractCurveSegmentType) obj;
    if (!Objects.equals(this.numDerivativesAtStart, other.numDerivativesAtStart)) {
      return false;
    }
    if (!Objects.equals(this.numDerivativesAtEnd, other.numDerivativesAtEnd)) {
      return false;
    }
    if (!Objects.equals(this.numDerivativeInterior, other.numDerivativeInterior)) {
      return false;
    }
    return true;
  }
}
