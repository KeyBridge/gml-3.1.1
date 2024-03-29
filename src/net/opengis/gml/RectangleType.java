package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * Represents a rectangle as a surface with an outer boundary consisting of a
 * linear ring. Note that this is a polygon (subtype) with no inner boundaries.
 * The number of points in the linear ring must be five.
 * <p/>
 * Java class for RectangleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="RectangleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfacePatchType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}exterior"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}SurfaceInterpolationType" fixed="planar" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectangleType", propOrder = {
  "exterior"
})
public class RectangleType
  extends AbstractSurfacePatchType {

  @XmlElementRef(name = "exterior", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
  protected JAXBElement<AbstractRingPropertyType> exterior;
  @XmlAttribute(name = "interpolation")
  protected SurfaceInterpolationType interpolation;

  /**
   * Constraint: The Ring shall be a LinearRing and must form a rectangle; the
   * first and the last position must be co-incident.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
   * <p/>
   */
  public JAXBElement<AbstractRingPropertyType> getExterior() {
    return exterior;
  }

  /**
   * Sets the value of the exterior property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
   * <p/>
   */
  public void setExterior(JAXBElement<AbstractRingPropertyType> value) {
    this.exterior = value;
  }

  public boolean isSetExterior() {
    return (this.exterior != null);
  }

  /**
   * Gets the value of the interpolation property.
   * <p/>
   * @return possible object is {@link SurfaceInterpolationType }
   *
   */
  public SurfaceInterpolationType getInterpolation() {
    if (interpolation == null) {
      return SurfaceInterpolationType.PLANAR;
    } else {
      return interpolation;
    }
  }

  /**
   * Sets the value of the interpolation property.
   * <p/>
   * @param value allowed object is {@link SurfaceInterpolationType }
   *
   */
  public void setInterpolation(SurfaceInterpolationType value) {
    this.interpolation = value;
  }

  public boolean isSetInterpolation() {
    return (this.interpolation != null);
  }
}
