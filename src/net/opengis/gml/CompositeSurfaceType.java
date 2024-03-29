package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A CompositeSurface is defined by a set of orientable surfaces. A composite
 * surface is geometry type with all the geometric properties of a (primitive)
 * surface. Essentially, a composite surface is a collection of surfaces that
 * join in pairs on common boundary curves and which, when considered as a
 * whole, form a single surface.
 * <p/>
 * Java class for CompositeSurfaceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CompositeSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}surfaceMember" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeSurfaceType", propOrder = {
  "surfaceMember"
})
public class CompositeSurfaceType
  extends AbstractSurfaceType {

  @XmlElement(required = true)
  protected List<SurfacePropertyType> surfaceMember;

  /**
   * This element references or contains one surface in the composite surface.
   * The surfaces are contiguous. NOTE: This definition allows for a nested
   * structure, i.e. a CompositeSurface may use, for example, another
   * CompositeSurface as a member.Gets the value of the surfaceMember property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the surfaceMember property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSurfaceMember().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link SurfacePropertyType }
   *
   *
   */
  public List<SurfacePropertyType> getSurfaceMember() {
    if (surfaceMember == null) {
      surfaceMember = new ArrayList<SurfacePropertyType>();
    }
    return this.surfaceMember;
  }

  public boolean isSetSurfaceMember() {
    return ((this.surfaceMember != null) && (!this.surfaceMember.isEmpty()));
  }

  public void unsetSurfaceMember() {
    this.surfaceMember = null;
  }
}
