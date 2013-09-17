package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * Container for an object representing the target or subject of an observation.
 * <p/>
 * <p>Java class for TargetPropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TargetPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}_Feature"/>
 *           &lt;element ref="{http://www.opengis.net/gml}_Geometry"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetPropertyType", propOrder = {
  "feature",
  "geometry"
})
public class TargetPropertyType {

  @XmlElementRef(name = "_Feature", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends AbstractFeatureType> feature;
  @XmlElementRef(name = "_Geometry", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends AbstractGeometryType> geometry;
  @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
  @XmlSchemaType(name = "anyURI")
  protected String remoteSchema;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
  protected TypeType type;
  @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
  protected String href;
  @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
  protected String role;
  @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
  protected String arcrole;
  @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
  protected String title;
  @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
  protected ShowType show;
  @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
  protected ActuateType actuate;

  /**
   * Gets the value of the feature property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GridCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiPointCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSurfaceCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSolidCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RectifiedGridCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiCurveCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractDiscreteCoverageType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends AbstractFeatureType> getFeature() {
    return feature;
  }

  /**
   * Sets the value of the feature property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GridCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiPointCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSurfaceCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSolidCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RectifiedGridCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiCurveCoverageType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractDiscreteCoverageType }{@code >}
   * <p/>
   */
  public void setFeature(JAXBElement<? extends AbstractFeatureType> value) {
    this.feature = value;
  }

  public boolean isSetFeature() {
    return (this.feature != null);
  }

  /**
   * Gets the value of the geometry property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GridType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PointType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SolidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiPolygonType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PolyhedralSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiLineStringType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TriangulatedSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TinType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CurveType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends AbstractGeometryType> getGeometry() {
    return geometry;
  }

  /**
   * Sets the value of the geometry property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GridType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PointType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SolidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiPolygonType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PolyhedralSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiLineStringType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TriangulatedSurfaceType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TinType }{@code >}
   *     {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CurveType }{@code >}
   * <p/>
   */
  public void setGeometry(JAXBElement<? extends AbstractGeometryType> value) {
    this.geometry = value;
  }

  public boolean isSetGeometry() {
    return (this.geometry != null);
  }

  /**
   * Gets the value of the remoteSchema property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getRemoteSchema() {
    return remoteSchema;
  }

  /**
   * Sets the value of the remoteSchema property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setRemoteSchema(String value) {
    this.remoteSchema = value;
  }

  public boolean isSetRemoteSchema() {
    return (this.remoteSchema != null);
  }

  /**
   * Gets the value of the type property.
   * <p/>
   * @return possible object is {@link TypeType }
   *
   */
  public TypeType getType() {
    if (type == null) {
      return TypeType.SIMPLE;
    } else {
      return type;
    }
  }

  /**
   * Sets the value of the type property.
   * <p/>
   * @param value allowed object is {@link TypeType }
   *
   */
  public void setType(TypeType value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the href property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getHref() {
    return href;
  }

  /**
   * Sets the value of the href property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setHref(String value) {
    this.href = value;
  }

  public boolean isSetHref() {
    return (this.href != null);
  }

  /**
   * Gets the value of the role property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getRole() {
    return role;
  }

  /**
   * Sets the value of the role property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setRole(String value) {
    this.role = value;
  }

  public boolean isSetRole() {
    return (this.role != null);
  }

  /**
   * Gets the value of the arcrole property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getArcrole() {
    return arcrole;
  }

  /**
   * Sets the value of the arcrole property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setArcrole(String value) {
    this.arcrole = value;
  }

  public boolean isSetArcrole() {
    return (this.arcrole != null);
  }

  /**
   * Gets the value of the title property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTitle(String value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the show property.
   * <p/>
   * @return possible object is {@link ShowType }
   *
   */
  public ShowType getShow() {
    return show;
  }

  /**
   * Sets the value of the show property.
   * <p/>
   * @param value allowed object is {@link ShowType }
   *
   */
  public void setShow(ShowType value) {
    this.show = value;
  }

  public boolean isSetShow() {
    return (this.show != null);
  }

  /**
   * Gets the value of the actuate property.
   * <p/>
   * @return possible object is {@link ActuateType }
   *
   */
  public ActuateType getActuate() {
    return actuate;
  }

  /**
   * Sets the value of the actuate property.
   * <p/>
   * @param value allowed object is {@link ActuateType }
   *
   */
  public void setActuate(ActuateType value) {
    this.actuate = value;
  }

  public boolean isSetActuate() {
    return (this.actuate != null);
  }
}
