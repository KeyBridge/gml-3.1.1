package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The end Node of each directedEdge of a TopoCurveType is the start Node of the
 * next directedEdge of the TopoCurveType in document order. The TopoCurve type
 * and element represent a homogeneous topological expression, a list of
 * directed edges, which if realised are isomorphic to a geometric curve
 * primitive. The intended use of TopoCurve is to appear within a line feature
 * instance to express the structural and geometric relationships of this line
 * to other features via the shared edge definitions.
 * <p/>
 * <p>Java class for TopoCurveType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedEdge" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoCurveType", propOrder = {
  "directedEdge"
})
public class TopoCurveType
  extends AbstractTopologyType {

  @XmlElement(required = true)
  protected List<DirectedEdgePropertyType> directedEdge;

  /**
   * Gets the value of the directedEdge property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the directedEdge property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getDirectedEdge().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
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
}
