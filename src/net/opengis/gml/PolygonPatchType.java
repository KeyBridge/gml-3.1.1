package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * A PolygonPatch is a surface patch that is defined by a set of boundary curves
 * and an underlying surface to which these curves adhere. The curves are
 * coplanar and the polygon uses planar interpolation in its interior.
 * Implements GM_Polygon of ISO 19107.
 * <p/>
 * Java class for PolygonPatchType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="PolygonPatchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfacePatchType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}exterior" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}interior" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PolygonPatchType", propOrder = {
  "exterior",
  "interior"
})
public class PolygonPatchType
  extends AbstractSurfacePatchType {

  @XmlElementRef(name = "exterior", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<AbstractRingPropertyType> exterior;
  @XmlElementRef(name = "interior", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<AbstractRingPropertyType>> interior;
  @XmlAttribute(name = "interpolation")
  protected SurfaceInterpolationType interpolation;

  /**
   * Gets the value of the exterior property.
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
   * Gets the value of the interior property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the interior property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getInterior().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<AbstractRingPropertyType>> getInterior() {
    if (interior == null) {
      interior = new ArrayList<JAXBElement<AbstractRingPropertyType>>();
    }
    return this.interior;
  }

  public boolean isSetInterior() {
    return ((this.interior != null) && (!this.interior.isEmpty()));
  }

  public void unsetInterior() {
    this.interior = null;
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
