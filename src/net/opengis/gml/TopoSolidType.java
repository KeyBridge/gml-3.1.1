package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The topological boundary of a TopoSolid consists of a set of directed faces.
 * Note that all faces associated with the TopoSolid, including dangling faces,
 * appear in the boundary. The coboundary of a TopoSolid is empty and hence
 * requires no representation.
 * <p/>
 * <p>Java class for TopoSolidType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoSolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopoPrimitiveType">
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
@XmlType(name = "TopoSolidType", propOrder = {
  "directedFace"
})
public class TopoSolidType
  extends AbstractTopoPrimitiveType {

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
