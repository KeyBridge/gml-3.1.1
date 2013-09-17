package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The TopoSurface type and element represent a homogeneous topological
 * expression, a set of directed faces, which if realised are isomorphic to a
 * geometric surface primitive. The intended use of TopoSurface is to appear
 * within a surface feature instance to express the structural and possibly
 * geometric relationships of this surface to other features via the shared face
 * definitions.
 * <p/>
 * <p>Java class for TopoSurfaceType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedFace" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoSurfaceType", propOrder = {
  "directedFace"
})
public class TopoSurfaceType
  extends AbstractTopologyType {

  @XmlElement(required = true)
  protected List<DirectedFacePropertyType> directedFace;

  /**
   * Gets the value of the directedFace property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the directedFace property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getDirectedFace().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link DirectedFacePropertyType }
   *
   *
   */
  public List<DirectedFacePropertyType> getDirectedFace() {
    if (directedFace == null) {
      directedFace = new ArrayList<DirectedFacePropertyType>();
    }
    return this.directedFace;
  }

  public boolean isSetDirectedFace() {
    return ((this.directedFace != null) && (!this.directedFace.isEmpty()));
  }

  public void unsetDirectedFace() {
    this.directedFace = null;
  }
}
