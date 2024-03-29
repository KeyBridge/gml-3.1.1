package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Its optional co-boundary is a set of connected directedEdges. The orientation
 * of one of these dirEdges is "+" if the Node is the "to" node of the Edge, and
 * "-" if it is the "from" node.
 * <p/>
 * Java class for NodeType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="NodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedEdge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}pointProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
  "directedEdge",
  "pointProperty"
})
public class NodeType
  extends AbstractTopoPrimitiveType {

  protected List<DirectedEdgePropertyType> directedEdge;
  protected PointPropertyType pointProperty;

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
   * Gets the value of the pointProperty property.
   * <p/>
   * @return possible object is {@link PointPropertyType }
   *
   */
  public PointPropertyType getPointProperty() {
    return pointProperty;
  }

  /**
   * Sets the value of the pointProperty property.
   * <p/>
   * @param value allowed object is {@link PointPropertyType }
   *
   */
  public void setPointProperty(PointPropertyType value) {
    this.pointProperty = value;
  }

  public boolean isSetPointProperty() {
    return (this.pointProperty != null);
  }
}
