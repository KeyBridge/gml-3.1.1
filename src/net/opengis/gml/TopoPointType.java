package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The intended use of TopoPoint is to appear within a point feature to express
 * the structural and possibly geometric relationships of this point to other
 * features via shared node definitions. Note the orientation assigned to the
 * directedNode has no meaning in this context. It is preserved for symmetry
 * with the types and elements which follow.
 * <p/>
 * <p>Java class for TopoPointType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}directedNode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPointType", propOrder = {
  "directedNode"
})
public class TopoPointType
  extends AbstractTopologyType {

  @XmlElement(required = true)
  protected DirectedNodePropertyType directedNode;

  /**
   * Gets the value of the directedNode property.
   * <p/>
   * @return possible object is {@link DirectedNodePropertyType }
   *
   */
  public DirectedNodePropertyType getDirectedNode() {
    return directedNode;
  }

  /**
   * Sets the value of the directedNode property.
   * <p/>
   * @param value allowed object is {@link DirectedNodePropertyType }
   *
   */
  public void setDirectedNode(DirectedNodePropertyType value) {
    this.directedNode = value;
  }

  public boolean isSetDirectedNode() {
    return (this.directedNode != null);
  }
}
