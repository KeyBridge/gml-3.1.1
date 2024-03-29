package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A Surface is a 2-dimensional primitive and is composed of one or more surface
 * patches. The surface patches are connected to one another. The orientation of
 * the surface is positive ("up"). The orientation of a surface chooses an "up"
 * direction through the choice of the upward normal, which, if the surface is
 * not a cycle, is the side of the surface from which the exterior boundary
 * appears counterclockwise. Reversal of the surface orientation reverses the
 * curve orientation of each boundary component, and interchanges the conceptual
 * "up" and "down" direction of the surface. If the surface is the boundary of a
 * solid, the "up" direction is usually outward. For closed surfaces, which have
 * no boundary, the up direction is that of the surface patches, which must be
 * consistent with one another. Its included surface patches describe the
 * interior structure of the Surface.
 * <p/>
 * <p>Java class for SurfaceType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="SurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}patches"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceType", propOrder = {
  "patches"
})
@XmlSeeAlso({
  PolyhedralSurfaceType.class,
  TriangulatedSurfaceType.class
})
public class SurfaceType
  extends AbstractSurfaceType {

  @XmlElementRef(name = "patches", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
  protected JAXBElement<? extends SurfacePatchArrayPropertyType> patches;

  /**
   * This element encapsulates the patches of the surface.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link TrianglePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonPatchArrayPropertyType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends SurfacePatchArrayPropertyType> getPatches() {
    return patches;
  }

  /**
   * Sets the value of the patches property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link TrianglePatchArrayPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PolygonPatchArrayPropertyType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}
   * <p/>
   */
  public void setPatches(JAXBElement<? extends SurfacePatchArrayPropertyType> value) {
    this.patches = value;
  }

  public boolean isSetPatches() {
    return (this.patches != null);
  }
}
