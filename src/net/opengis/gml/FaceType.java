package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * . The topological boundary of a face consists of a set of directed edges.
 * Note that all edges associated with a Face, including dangling and interior
 * edges, appear in the boundary. Dangling and interior edges are each
 * referenced by pairs of directedEdges with opposing orientations. The optional
 * coboundary of a face is a pair of directed solids which are bounded by this
 * face. If present, there is precisely one positively directed and one
 * negatively directed solid in the coboundary of every face. The positively
 * directed solid corresponds to the solid which lies in the direction of the
 * positively directed normal to the face in any geometric realisation. A face
 * may optionally be realised by a 2-dimensional (surface) geometric primitive.
 * <p/>
 * Java class for FaceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="FaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedEdge" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}directedTopoSolid" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}surfaceProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceType", propOrder = {
  "directedEdge",
  "directedTopoSolid",
  "surfaceProperty"
})
public class FaceType
  extends AbstractTopoPrimitiveType {

  @XmlElement(required = true)
  protected List<DirectedEdgePropertyType> directedEdge;
  protected List<DirectedTopoSolidPropertyType> directedTopoSolid;
  protected SurfacePropertyType surfaceProperty;

  /**
   * Gets the value of the directedEdge property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the directedEdge property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDirectedEdge().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link DirectedEdgePropertyType }
   *
   *
   */
  public List<DirectedEdgePropertyType> getDirectedEdge() {
    if (directedEdge == null) {
      directedEdge = new ArrayList<DirectedEdgePropertyType>();
    }
    return this.directedEdge;
  }

  public boolean isSetDirectedEdge() {
    return ((this.directedEdge != null) && (!this.directedEdge.isEmpty()));
  }

  public void unsetDirectedEdge() {
    this.directedEdge = null;
  }

  /**
   * Gets the value of the directedTopoSolid property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the directedTopoSolid property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDirectedTopoSolid().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link DirectedTopoSolidPropertyType }
   *
   *
   */
  public List<DirectedTopoSolidPropertyType> getDirectedTopoSolid() {
    if (directedTopoSolid == null) {
      directedTopoSolid = new ArrayList<DirectedTopoSolidPropertyType>();
    }
    return this.directedTopoSolid;
  }

  public boolean isSetDirectedTopoSolid() {
    return ((this.directedTopoSolid != null) && (!this.directedTopoSolid.isEmpty()));
  }

  public void unsetDirectedTopoSolid() {
    this.directedTopoSolid = null;
  }

  /**
   * Gets the value of the surfaceProperty property.
   * <p/>
   * @return possible object is {@link SurfacePropertyType }
   *
   */
  public SurfacePropertyType getSurfaceProperty() {
    return surfaceProperty;
  }

  /**
   * Sets the value of the surfaceProperty property.
   * <p/>
   * @param value allowed object is {@link SurfacePropertyType }
   *
   */
  public void setSurfaceProperty(SurfacePropertyType value) {
    this.surfaceProperty = value;
  }

  public boolean isSetSurfaceProperty() {
    return (this.surfaceProperty != null);
  }
}
