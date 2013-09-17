package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Type declaration of the element "TimeNode".
 * <p/>
 * <p>Java class for TimeNodeType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeTopologyPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="previousEdge" type="{http://www.opengis.net/gml}TimeEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nextEdge" type="{http://www.opengis.net/gml}TimeEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.opengis.net/gml}TimeInstantPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeNodeType", propOrder = {
  "previousEdge",
  "nextEdge",
  "position"
})
public class TimeNodeType
  extends AbstractTimeTopologyPrimitiveType {

  protected List<TimeEdgePropertyType> previousEdge;
  protected List<TimeEdgePropertyType> nextEdge;
  protected TimeInstantPropertyType position;

  /**
   * Gets the value of the previousEdge property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the previousEdge property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getPreviousEdge().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TimeEdgePropertyType }
   *
   *
   */
  public List<TimeEdgePropertyType> getPreviousEdge() {
    if (previousEdge == null) {
      previousEdge = new ArrayList<TimeEdgePropertyType>();
    }
    return this.previousEdge;
  }

  public boolean isSetPreviousEdge() {
    return ((this.previousEdge != null) && (!this.previousEdge.isEmpty()));
  }

  public void unsetPreviousEdge() {
    this.previousEdge = null;
  }

  /**
   * Gets the value of the nextEdge property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the nextEdge property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getNextEdge().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TimeEdgePropertyType }
   *
   *
   */
  public List<TimeEdgePropertyType> getNextEdge() {
    if (nextEdge == null) {
      nextEdge = new ArrayList<TimeEdgePropertyType>();
    }
    return this.nextEdge;
  }

  public boolean isSetNextEdge() {
    return ((this.nextEdge != null) && (!this.nextEdge.isEmpty()));
  }

  public void unsetNextEdge() {
    this.nextEdge = null;
  }

  /**
   * Gets the value of the position property.
   * <p/>
   * @return possible object is {@link TimeInstantPropertyType }
   *
   */
  public TimeInstantPropertyType getPosition() {
    return position;
  }

  /**
   * Sets the value of the position property.
   * <p/>
   * @param value allowed object is {@link TimeInstantPropertyType }
   *
   */
  public void setPosition(TimeInstantPropertyType value) {
    this.position = value;
  }

  public boolean isSetPosition() {
    return (this.position != null);
  }
}
