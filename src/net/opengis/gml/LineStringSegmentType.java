package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * A LineStringSegment is a curve segment that is defined by two or more
 * coordinate tuples, with linear interpolation between them. Note:
 * LineStringSegment implements GM_LineString of ISO 19107.
 * <p/>
 * Java class for LineStringSegmentType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="LineStringSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="2">
 *             &lt;element ref="{http://www.opengis.net/gml}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="linear" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStringSegmentType", propOrder = {
  "posOrPointPropertyOrPointRep",
  "posList",
  "coordinates"
})
public class LineStringSegmentType
  extends AbstractCurveSegmentType {

  @XmlElementRefs({
    @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  })
  protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
  protected DirectPositionListType posList;
  protected CoordinatesType coordinates;
  @XmlAttribute(name = "interpolation")
  protected CurveInterpolationType interpolation;

  /**
   * Gets the value of the posOrPointPropertyOrPointRep property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the posOrPointPropertyOrPointRep property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPosOrPointPropertyOrPointRep().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<?>> getPosOrPointPropertyOrPointRep() {
    if (posOrPointPropertyOrPointRep == null) {
      posOrPointPropertyOrPointRep = new ArrayList<JAXBElement<?>>();
    }
    return this.posOrPointPropertyOrPointRep;
  }

  public boolean isSetPosOrPointPropertyOrPointRep() {
    return ((this.posOrPointPropertyOrPointRep != null) && (!this.posOrPointPropertyOrPointRep.isEmpty()));
  }

  public void unsetPosOrPointPropertyOrPointRep() {
    this.posOrPointPropertyOrPointRep = null;
  }

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
   * Deprecated with GML version 3.1.0. Use "posList" instead.
   * <p/>
   * @return possible object is {@link CoordinatesType }
   *
   */
  public CoordinatesType getCoordinates() {
    return coordinates;
  }

  /**
   * Sets the value of the coordinates property.
   * <p/>
   * @param value allowed object is {@link CoordinatesType }
   *
   */
  public void setCoordinates(CoordinatesType value) {
    this.coordinates = value;
  }

  public boolean isSetCoordinates() {
    return (this.coordinates != null);
  }

  /**
   * Gets the value of the interpolation property.
   * <p/>
   * @return possible object is {@link CurveInterpolationType }
   *
   */
  public CurveInterpolationType getInterpolation() {
    if (interpolation == null) {
      return CurveInterpolationType.LINEAR;
    } else {
      return interpolation;
    }
  }

  /**
   * Sets the value of the interpolation property.
   * <p/>
   * @param value allowed object is {@link CurveInterpolationType }
   *
   */
  public void setInterpolation(CurveInterpolationType value) {
    this.interpolation = value;
  }

  public boolean isSetInterpolation() {
    return (this.interpolation != null);
  }
}
