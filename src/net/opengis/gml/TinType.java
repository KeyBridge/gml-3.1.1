package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * A tin is a triangulated surface that uses the Delauny algorithm or a similar
 * algorithm complemented with consideration of breaklines, stoplines, and
 * maximum length of triangle sides. These networks satisfy the Delauny's
 * criterion away from the modifications: Fore each triangle in the network, the
 * circle passing through its vertices does not contain, in its interior, the
 * vertex of any other triangle.
 * <p/>
 * <p>Java class for TinType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TinType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}TriangulatedSurfaceType">
 *       &lt;sequence>
 *         &lt;element name="stopLines" type="{http://www.opengis.net/gml}LineStringSegmentArrayPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="breakLines" type="{http://www.opengis.net/gml}LineStringSegmentArrayPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxLength" type="{http://www.opengis.net/gml}LengthType"/>
 *         &lt;element name="controlPoint">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *                   &lt;group ref="{http://www.opengis.net/gml}geometricPositionGroup" maxOccurs="unbounded" minOccurs="3"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TinType", propOrder = {
  "stopLines",
  "breakLines",
  "maxLength",
  "controlPoint"
})
public class TinType
  extends TriangulatedSurfaceType {

  protected List<LineStringSegmentArrayPropertyType> stopLines;
  protected List<LineStringSegmentArrayPropertyType> breakLines;
  @XmlElement(required = true)
  protected LengthType maxLength;
  @XmlElement(required = true)
  protected TinType.ControlPoint controlPoint;

  /**
   * Gets the value of the stopLines property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the stopLines property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getStopLines().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link LineStringSegmentArrayPropertyType }
   *
   *
   */
  public List<LineStringSegmentArrayPropertyType> getStopLines() {
    if (stopLines == null) {
      stopLines = new ArrayList<LineStringSegmentArrayPropertyType>();
    }
    return this.stopLines;
  }

  public boolean isSetStopLines() {
    return ((this.stopLines != null) && (!this.stopLines.isEmpty()));
  }

  public void unsetStopLines() {
    this.stopLines = null;
  }

  /**
   * Gets the value of the breakLines property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the breakLines property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getBreakLines().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link LineStringSegmentArrayPropertyType }
   *
   *
   */
  public List<LineStringSegmentArrayPropertyType> getBreakLines() {
    if (breakLines == null) {
      breakLines = new ArrayList<LineStringSegmentArrayPropertyType>();
    }
    return this.breakLines;
  }

  public boolean isSetBreakLines() {
    return ((this.breakLines != null) && (!this.breakLines.isEmpty()));
  }

  public void unsetBreakLines() {
    this.breakLines = null;
  }

  /**
   * Gets the value of the maxLength property.
   * <p/>
   * @return possible object is {@link LengthType }
   *
   */
  public LengthType getMaxLength() {
    return maxLength;
  }

  /**
   * Sets the value of the maxLength property.
   * <p/>
   * @param value allowed object is {@link LengthType }
   *
   */
  public void setMaxLength(LengthType value) {
    this.maxLength = value;
  }

  public boolean isSetMaxLength() {
    return (this.maxLength != null);
  }

  /**
   * Gets the value of the controlPoint property.
   * <p/>
   * @return possible object is {@link TinType.ControlPoint }
   *
   */
  public TinType.ControlPoint getControlPoint() {
    return controlPoint;
  }

  /**
   * Sets the value of the controlPoint property.
   * <p/>
   * @param value allowed object is {@link TinType.ControlPoint }
   *
   */
  public void setControlPoint(TinType.ControlPoint value) {
    this.controlPoint = value;
  }

  public boolean isSetControlPoint() {
    return (this.controlPoint != null);
  }

  /**
   * <p>Java class for anonymous complex type.
   * <p/>
   * <p>The following schema fragment specifies the expected content contained
   * within this class.
   * <p/>
   * <
   * pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;choice>
   *         &lt;element ref="{http://www.opengis.net/gml}posList"/>
   *         &lt;group ref="{http://www.opengis.net/gml}geometricPositionGroup" maxOccurs="unbounded" minOccurs="3"/>
   *       &lt;/choice>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   * <p/>
   *
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "posList",
    "geometricPositionGroup"
  })
  public static class ControlPoint {

    protected DirectPositionListType posList;
    @XmlElements({
      @XmlElement(name = "pos", type = DirectPositionType.class),
      @XmlElement(name = "pointProperty", type = PointPropertyType.class)
    })
    protected List<Object> geometricPositionGroup;

    /**
     * Gets the value of the posList property.
     * <p/>
     * @return possible object is {@link DirectPositionListType }
     *
     */
    public DirectPositionListType getPosList() {
      return posList;
    }

    /**
     * Sets the value of the posList property.
     * <p/>
     * @param value allowed object is {@link DirectPositionListType }
     *
     */
    public void setPosList(DirectPositionListType value) {
      this.posList = value;
    }

    public boolean isSetPosList() {
      return (this.posList != null);
    }

    /**
     * Gets the value of the geometricPositionGroup property.
     * <p/>
     * <p> This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the geometricPositionGroup property.
     * <p/>
     * <p> For example, to add a new item, do as follows:
     * <pre>
     *    getGeometricPositionGroup().add(newItem);
     * </pre>
     * <p/>
     *
     * <p> Objects of the following type(s) are allowed in the list null     {@link DirectPositionType }
         * {@link PointPropertyType }
     *
     *
     */
    public List<Object> getGeometricPositionGroup() {
      if (geometricPositionGroup == null) {
        geometricPositionGroup = new ArrayList<Object>();
      }
      return this.geometricPositionGroup;
    }

    public boolean isSetGeometricPositionGroup() {
      return ((this.geometricPositionGroup != null) && (!this.geometricPositionGroup.isEmpty()));
    }

    public void unsetGeometricPositionGroup() {
      this.geometricPositionGroup = null;
    }
  }
}
