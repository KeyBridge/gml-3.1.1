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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A B-Spline is a piecewise parametric polynomial or rational curve described
 * in terms of control points and basis functions. Knots are breakpoints on the
 * curve that connect its pieces. They are given as a non-decreasing sequence of
 * real numbers. If the weights in the knots are equal then it is a polynomial
 * spline. The degree is the algebraic degree of the basis functions.
 * <p/>
 * Java class for BSplineType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="BSplineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.opengis.net/gml}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="knot" type="{http://www.opengis.net/gml}KnotPropertyType" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}CurveInterpolationType" default="polynomialSpline" />
 *       &lt;attribute name="isPolynomial" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="knotType" type="{http://www.opengis.net/gml}KnotTypesType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BSplineType", propOrder = {
  "posOrPointPropertyOrPointRep",
  "posList",
  "coordinates",
  "degree",
  "knot"
})
@XmlSeeAlso({
  BezierType.class
})
public class BSplineType
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
  @XmlSchemaType(name = "nonNegativeInteger")
  protected BigInteger degree;
  @XmlElement(required = true)
  protected List<KnotPropertyType> knot;
  @XmlAttribute(name = "interpolation")
  protected CurveInterpolationType interpolation;
  @XmlAttribute(name = "isPolynomial")
  protected Boolean isPolynomial;
  @XmlAttribute(name = "knotType")
  protected KnotTypesType knotType;

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
   * Gets the value of the degree property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getDegree() {
    return degree;
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

  /**
   * Gets the value of the knot property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the knot property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKnot().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link KnotPropertyType }
   *
   *
   */
  public List<KnotPropertyType> getKnot() {
    if (knot == null) {
      knot = new ArrayList<KnotPropertyType>();
    }
    return this.knot;
  }

  public boolean isSetKnot() {
    return ((this.knot != null) && (!this.knot.isEmpty()));
  }

  public void unsetKnot() {
    this.knot = null;
  }

  /**
   * Gets the value of the interpolation property.
   * <p/>
   * @return possible object is {@link CurveInterpolationType }
   *
   */
  public CurveInterpolationType getInterpolation() {
    if (interpolation == null) {
      return CurveInterpolationType.POLYNOMIAL_SPLINE;
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
   * Gets the value of the isPolynomial property.
   * <p/>
   * @return possible object is {@link Boolean }
   *
   */
  public boolean isIsPolynomial() {
    return isPolynomial;
  }

  /**
   * Sets the value of the isPolynomial property.
   * <p/>
   * @param value allowed object is {@link Boolean }
   *
   */
  public void setIsPolynomial(boolean value) {
    this.isPolynomial = value;
  }

  public boolean isSetIsPolynomial() {
    return (this.isPolynomial != null);
  }

  public void unsetIsPolynomial() {
    this.isPolynomial = null;
  }

  /**
   * Gets the value of the knotType property.
   * <p/>
   * @return possible object is {@link KnotTypesType }
   *
   */
  public KnotTypesType getKnotType() {
    return knotType;
  }

  /**
   * Sets the value of the knotType property.
   * <p/>
   * @param value allowed object is {@link KnotTypesType }
   *
   */
  public void setKnotType(KnotTypesType value) {
    this.knotType = value;
  }

  public boolean isSetKnotType() {
    return (this.knotType != null);
  }
}
