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
import javax.xml.bind.annotation.XmlType;

/**
 * Cubic splines are similar to line strings in that they are a sequence of
 * segments each with its own defining function. A cubic spline uses the control
 * points and a set of derivative parameters to define a piecewise 3rd degree
 * polynomial interpolation. Unlike line-strings, the parameterization by arc
 * length is not necessarily still a polynomial. The function describing the
 * curve must be C2, that is, have a continuous 1st and 2nd derivative at all
 * points, and pass through the controlPoints in the order given. Between the
 * control points, the curve segment is defined by a cubic polynomial. At each
 * control point, the polynomial changes in such a manner that the 1st and 2nd
 * derivative vectors are the same from either side. The control parameters
 * record must contain vectorAtStart, and vectorAtEnd which are the unit tangent
 * vectors at controlPoint[1] and controlPoint[n] where n = controlPoint.count.
 * Note: only the direction of the vectors is relevant, not their length.
 * <p/>
 * Java class for CubicSplineType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CubicSplineType">
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
 *         &lt;element name="vectorAtStart" type="{http://www.opengis.net/gml}VectorType"/>
 *         &lt;element name="vectorAtEnd" type="{http://www.opengis.net/gml}VectorType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="cubicSpline" />
 *       &lt;attribute name="degree" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CubicSplineType", propOrder = {
  "posOrPointPropertyOrPointRep",
  "posList",
  "coordinates",
  "vectorAtStart",
  "vectorAtEnd"
})
public class CubicSplineType
  extends AbstractCurveSegmentType {

  @XmlElementRefs({
    @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  })
  protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
  protected DirectPositionListType posList;
  protected CoordinatesType coordinates;
  @XmlElement(required = true)
  protected VectorType vectorAtStart;
  @XmlElement(required = true)
  protected VectorType vectorAtEnd;
  @XmlAttribute(name = "interpolation")
  protected CurveInterpolationType interpolation;
  @XmlAttribute(name = "degree")
  protected BigInteger degree;

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
   * Gets the value of the vectorAtStart property.
   * <p/>
   * @return possible object is {@link VectorType }
   *
   */
  public VectorType getVectorAtStart() {
    return vectorAtStart;
  }

  /**
   * Sets the value of the vectorAtStart property.
   * <p/>
   * @param value allowed object is {@link VectorType }
   *
   */
  public void setVectorAtStart(VectorType value) {
    this.vectorAtStart = value;
  }

  public boolean isSetVectorAtStart() {
    return (this.vectorAtStart != null);
  }

  /**
   * Gets the value of the vectorAtEnd property.
   * <p/>
   * @return possible object is {@link VectorType }
   *
   */
  public VectorType getVectorAtEnd() {
    return vectorAtEnd;
  }

  /**
   * Sets the value of the vectorAtEnd property.
   * <p/>
   * @param value allowed object is {@link VectorType }
   *
   */
  public void setVectorAtEnd(VectorType value) {
    this.vectorAtEnd = value;
  }

  public boolean isSetVectorAtEnd() {
    return (this.vectorAtEnd != null);
  }

  /**
   * Gets the value of the interpolation property.
   * <p/>
   * @return possible object is {@link CurveInterpolationType }
   *
   */
  public CurveInterpolationType getInterpolation() {
    if (interpolation == null) {
      return CurveInterpolationType.CUBIC_SPLINE;
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
   * Gets the value of the degree property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getDegree() {
    if (degree == null) {
      return new BigInteger("3");
    } else {
      return degree;
    }
  }

  /**
   * Sets the value of the degree property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setDegree(BigInteger value) {
    this.degree = value;
  }

  public boolean isSetDegree() {
    return (this.degree != null);
  }
}
