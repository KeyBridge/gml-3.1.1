package net.opengis.gml;

import java.util.Objects;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * An abstract feature provides a set of common properties, including id,
 * metaDataProperty, name and description inherited from AbstractGMLType, plus
 * boundedBy. A concrete feature type must derive from this type and specify
 * additional properties in an application schema. A feature must possess an
 * identifying attribute ('id' - 'fid' has been deprecated).
 * <p/>
 * Java class for AbstractFeatureType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractFeatureType"> &lt;complexContent>
 * &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}boundedBy"
 * minOccurs="0"/> &lt;element ref="{http://www.opengis.net/gml}location"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
  "boundedBy",
  "location"
})
@XmlSeeAlso({
  ObservationType.class,
  AbstractCoverageType.class,
  AbstractFeatureCollectionType.class,
  DynamicFeatureType.class,
  BoundedFeatureType.class
})
public abstract class AbstractFeatureType extends AbstractGMLType {

  protected BoundingShapeType boundedBy;
  @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends LocationPropertyType> location;

  /**
   * Gets the value of the boundedBy property.
   * <p/>
   * @return possible object is {@link BoundingShapeType }
   *
   */
  public BoundingShapeType getBoundedBy() {
    return boundedBy;
  }

  /**
   * Sets the value of the boundedBy property.
   * <p/>
   * @param value allowed object is {@link BoundingShapeType }
   *
   */
  public void setBoundedBy(BoundingShapeType value) {
    this.boundedBy = value;
  }

  public boolean isSetBoundedBy() {
    return (this.boundedBy != null);
  }

  /**
   * deprecated in GML version 3.1
   * <p/>
   * @return possible object is null null   {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends LocationPropertyType> getLocation() {
    return location;
  }

  /**
   * Sets the value of the location property.
   * <p/>
   * @param value allowed object is null null   {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
   * <p/>
   */
  public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
    this.location = value;
  }

  public boolean isSetLocation() {
    return (this.location != null);
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 37 * hash + Objects.hashCode(this.boundedBy);
    hash = 37 * hash + Objects.hashCode(this.location);
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
    final AbstractFeatureType other = (AbstractFeatureType) obj;
    if (!Objects.equals(this.boundedBy, other.boundedBy)) {
      return false;
    }
    if (!Objects.equals(this.location, other.location)) {
      return false;
    }
    return true;
  }
}
