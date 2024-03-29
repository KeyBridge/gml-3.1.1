package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A solid is the basis for 3-dimensional geometry. The extent of a solid is
 * defined by the boundary surfaces (shells). A shell is represented by a
 * composite surface, where every shell is used to represent a single connected
 * component of the boundary of a solid. It consists of a composite surface (a
 * list of orientable surfaces) connected in a topological cycle (an object
 * whose boundary is empty). Unlike a Ring, a Shell's elements have no natural
 * sort order. Like Rings, Shells are simple.
 * <p/>
 * Java class for SolidType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="SolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSolidType">
 *       &lt;sequence>
 *         &lt;element name="exterior" type="{http://www.opengis.net/gml}SurfacePropertyType" minOccurs="0"/>
 *         &lt;element name="interior" type="{http://www.opengis.net/gml}SurfacePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidType", propOrder = {
  "exterior",
  "interior"
})
public class SolidType
  extends AbstractSolidType {

  protected SurfacePropertyType exterior;
  protected List<SurfacePropertyType> interior;

  /**
   * Gets the value of the exterior property.
   * <p/>
   * @return possible object is {@link SurfacePropertyType }
   *
   */
  public SurfacePropertyType getExterior() {
    return exterior;
  }

  /**
   * Sets the value of the exterior property.
   * <p/>
   * @param value allowed object is {@link SurfacePropertyType }
   *
   */
  public void setExterior(SurfacePropertyType value) {
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
   * Objects of the following type(s) are allowed in the list
     * {@link SurfacePropertyType }
   *
   *
   */
  public List<SurfacePropertyType> getInterior() {
    if (interior == null) {
      interior = new ArrayList<SurfacePropertyType>();
    }
    return this.interior;
  }

  public boolean isSetInterior() {
    return ((this.interior != null) && (!this.interior.isEmpty()));
  }

  public void unsetInterior() {
    this.interior = null;
  }
}
