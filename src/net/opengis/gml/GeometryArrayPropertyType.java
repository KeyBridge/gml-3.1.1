package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * A container for an array of geometry elements. The elements are always
 * contained in the array property, referencing geometry elements or arrays of
 * geometry elements is not supported.
 * <p/>
 * Java class for GeometryArrayPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GeometryArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Geometry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryArrayPropertyType", propOrder = {
  "geometry"
})
public class GeometryArrayPropertyType {

  @XmlElementRef(name = "_Geometry", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<? extends AbstractGeometryType>> geometry;

  /**
   * Gets the value of the geometry property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the geometry property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getGeometry().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
   * {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
   * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
   * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
   * {@link JAXBElement }{@code <}{@link GridType }{@code >}
   * {@link JAXBElement }{@code <}{@link PointType }{@code >}
   * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
   * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
   * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
   * {@link JAXBElement }{@code <}{@link MultiPolygonType }{@code >}
   * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link PolyhedralSurfaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
   * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link MultiLineStringType }{@code >}
   * {@link JAXBElement }{@code <}{@link RingType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
   * {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link TriangulatedSurfaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
   * {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
   * {@link JAXBElement }{@code <}{@link TinType }{@code >}
   * {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
   * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
   * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<? extends AbstractGeometryType>> getGeometry() {
    if (geometry == null) {
      geometry = new ArrayList<JAXBElement<? extends AbstractGeometryType>>();
    }
    return this.geometry;
  }

  public boolean isSetGeometry() {
    return ((this.geometry != null) && (!this.geometry.isEmpty()));
  }

  public void unsetGeometry() {
    this.geometry = null;
  }
}
