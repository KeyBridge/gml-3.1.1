package net.opengis.gml;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Abstract element which acts as the head of a substitution group for
 * coverages. Note that a coverage is a GML feature.
 * <p/>
 * Java class for AbstractCoverageType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractCoverageType"> &lt;complexContent>
 * &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}domainSet"/>
 * &lt;element ref="{http://www.opengis.net/gml}rangeSet"/> &lt;/sequence>
 * &lt;attribute name="dimension"
 * type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /> &lt;/extension>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoverageType", propOrder = {
  "domainSet",
  "rangeSet"
})
@XmlSeeAlso({
  AbstractContinuousCoverageType.class,
  AbstractDiscreteCoverageType.class
})
public abstract class AbstractCoverageType extends AbstractFeatureType {

  @XmlElementRef(name = "domainSet", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
  protected JAXBElement<? extends DomainSetType> domainSet;
  @XmlElement(required = true)
  protected RangeSetType rangeSet;
  @XmlAttribute(name = "dimension")
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger dimension;

  /**
   * Gets the value of the domainSet property.
   * <p/>
   * @return possible object is null null   {@link JAXBElement }{@code <}{@link MultiSolidDomainType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSurfaceDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GridDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RectifiedGridDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiCurveDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiPointDomainType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends DomainSetType> getDomainSet() {
    return domainSet;
  }

  /**
   * Sets the value of the domainSet property.
   * <p/>
   * @param value allowed object is null null   {@link JAXBElement }{@code <}{@link MultiSolidDomainType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiSurfaceDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GridDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RectifiedGridDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiCurveDomainType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiPointDomainType }{@code >}
   * <p/>
   */
  public void setDomainSet(JAXBElement<? extends DomainSetType> value) {
    this.domainSet = value;
  }

  public boolean isSetDomainSet() {
    return (this.domainSet != null);
  }

  /**
   * Gets the value of the rangeSet property.
   * <p/>
   * @return possible object is {@link RangeSetType }
   *
   */
  public RangeSetType getRangeSet() {
    return rangeSet;
  }

  /**
   * Sets the value of the rangeSet property.
   * <p/>
   * @param value allowed object is {@link RangeSetType }
   *
   */
  public void setRangeSet(RangeSetType value) {
    this.rangeSet = value;
  }

  public boolean isSetRangeSet() {
    return (this.rangeSet != null);
  }

  /**
   * Gets the value of the dimension property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getDimension() {
    return dimension;
  }

  /**
   * Sets the value of the dimension property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setDimension(BigInteger value) {
    this.dimension = value;
  }

  public boolean isSetDimension() {
    return (this.dimension != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 31 * hash + Objects.hashCode(this.domainSet);
    hash = 31 * hash + Objects.hashCode(this.rangeSet);
    hash = 31 * hash + Objects.hashCode(this.dimension);
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
    final AbstractCoverageType other = (AbstractCoverageType) obj;
    if (!Objects.equals(this.domainSet, other.domainSet)) {
      return false;
    }
    if (!Objects.equals(this.rangeSet, other.rangeSet)) {
      return false;
    }
    if (!Objects.equals(this.dimension, other.dimension)) {
      return false;
    }
    return true;
  }
}
