package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * This variant of the arc computes the mid points of the arcs instead of
 * storing the coordinates directly. The control point sequence consists of the
 * start and end points of each arc plus the bulge.
 * <p/>
 * Java class for ArcStringByBulgeType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ArcStringByBulgeType">
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
 *         &lt;element name="bulge" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded"/>
 *         &lt;element name="normal" type="{http://www.opengis.net/gml}VectorType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArc2PointWithBulge" />
 *       &lt;attribute name="numArc" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcStringByBulgeType", propOrder = {
  "posOrPointPropertyOrPointRep",
  "posList",
  "coordinates",
  "bulge",
  "normal"
})
@XmlSeeAlso({
  ArcByBulgeType.class
})
public class ArcStringByBulgeType
  extends AbstractCurveSegmentType {

  @XmlElementRefs({
    @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  })
  protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
  protected DirectPositionListType posList;
  protected CoordinatesType coordinates;
  @XmlElement(type = Double.class)
  protected List<Double> bulge;
  @XmlElement(required = true)
  protected List<VectorType> normal;
  @XmlAttribute(name = "interpolation")
  protected CurveInterpolationType interpolation;
  @XmlAttribute(name = "numArc")
  protected BigInteger numArc;

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
   * Gets the value of the bulge property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the bulge property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBulge().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link Double }
   *
   *
   */
  public List<Double> getBulge() {
    if (bulge == null) {
      bulge = new ArrayList<Double>();
    }
    return this.bulge;
  }

  public boolean isSetBulge() {
    return ((this.bulge != null) && (!this.bulge.isEmpty()));
  }

  public void unsetBulge() {
    this.bulge = null;
  }

  /**
   * Gets the value of the normal property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the normal property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNormal().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
   *
   *
   */
  public List<VectorType> getNormal() {
    if (normal == null) {
      normal = new ArrayList<VectorType>();
    }
    return this.normal;
  }

  public boolean isSetNormal() {
    return ((this.normal != null) && (!this.normal.isEmpty()));
  }

  public void unsetNormal() {
    this.normal = null;
  }

  /**
   * Gets the value of the interpolation property.
   * <p/>
   * @return possible object is {@link CurveInterpolationType }
   *
   */
  public CurveInterpolationType getInterpolation() {
    if (interpolation == null) {
      return CurveInterpolationType.CIRCULAR_ARC_2_POINT_WITH_BULGE;
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

  /**
   * Gets the value of the numArc property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getNumArc() {
    return numArc;
  }

  /**
   * Sets the value of the numArc property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setNumArc(BigInteger value) {
    this.numArc = value;
  }

  public boolean isSetNumArc() {
    return (this.numArc != null);
  }
}
