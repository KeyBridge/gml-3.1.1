package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * A Polygon is a special surface that is defined by a single surface patch. The
 * boundary of this patch is coplanar and the polygon uses planar interpolation
 * in its interior. It is backwards compatible with the Polygon of GML 2,
 * GM_Polygon of ISO 19107 is implemented by PolygonPatch.
 * <p/>
 * Java class for PolygonType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="PolygonType"> &lt;complexContent> &lt;extension
 * base="{http://www.opengis.net/gml}AbstractSurfaceType"> &lt;sequence>
 * &lt;element ref="{http://www.opengis.net/gml}exterior" minOccurs="0"/>
 * &lt;element ref="{http://www.opengis.net/gml}interior" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonType", propOrder = {
  "exterior",
  "interior"
})
public class PolygonType extends AbstractSurfaceType {

  @XmlElementRef(name = "exterior", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<AbstractRingPropertyType> exterior;
  @XmlElementRef(name = "interior", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<AbstractRingPropertyType>> interior;

  /**
   * Gets the value of the exterior property.
   * <p/>
   * @return possible object is null null null   {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
   * <p/>
   */
  public JAXBElement<AbstractRingPropertyType> getExterior() {
    return exterior;
  }

  /**
   * Sets the value of the exterior property.
   * <p/>
   * @param value allowed object is null null null   {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
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
   * Objects of the following type(s) are allowed in the list null null null   {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}
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

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.exterior);
    hash = 89 * hash + Objects.hashCode(this.interior);
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
    final PolygonType other = (PolygonType) obj;
    if (!Objects.equals(this.exterior, other.exterior)) {
      return false;
    }
    if (!Objects.equals(this.interior, other.interior)) {
      return false;
    }
    return true;
  }
}
