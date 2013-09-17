package net.opengis.gml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * This variant of the arc requires that the points on the arc have to be
 * computed instead of storing the coordinates directly. The control point is
 * the center point of the arc plus the radius and the bearing at start and end.
 * This represenation can be used only in 2D.
 * <p/>
 * Java class for ArcByCenterPointType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ArcByCenterPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.opengis.net/gml}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="radius" type="{http://www.opengis.net/gml}LengthType"/>
 *         &lt;element name="startAngle" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/>
 *         &lt;element name="endAngle" type="{http://www.opengis.net/gml}AngleType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml}CurveInterpolationType" fixed="circularArcCenterPointWithRadius" />
 *       &lt;attribute name="numArc" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArcByCenterPointType", propOrder = {
  "pos",
  "pointProperty",
  "pointRep",
  "posList",
  "coordinates",
  "radius",
  "startAngle",
  "endAngle"
})
@XmlSeeAlso({
  CircleByCenterPointType.class
})
public class ArcByCenterPointType
  extends AbstractCurveSegmentType {

  protected DirectPositionType pos;
  protected PointPropertyType pointProperty;
  protected PointPropertyType pointRep;
  protected DirectPositionListType posList;
  protected CoordinatesType coordinates;
  @XmlElement(required = true)
  protected LengthType radius;
  protected AngleType startAngle;
  protected AngleType endAngle;
  @XmlAttribute(name = "interpolation")
  protected CurveInterpolationType interpolation;
  @XmlAttribute(name = "numArc", required = true)
  protected BigInteger numArc;

  /**
   * Gets the value of the pos property.
   * <p/>
   * @return possible object is {@link DirectPositionType }
   *
   */
  public DirectPositionType getPos() {
    return pos;
  }

  /**
   * Sets the value of the pos property.
   * <p/>
   * @param value allowed object is {@link DirectPositionType }
   *
   */
  public void setPos(DirectPositionType value) {
    this.pos = value;
  }

  public boolean isSetPos() {
    return (this.pos != null);
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

  /**
   * Deprecated with GML version 3.1.0. Use "pointProperty" instead. Included
   * for backwards compatibility with GML 3.0.0.
   * <p/>
   * @return possible object is {@link PointPropertyType }
   *
   */
  public PointPropertyType getPointRep() {
    return pointRep;
  }

  /**
   * Sets the value of the pointRep property.
   * <p/>
   * @param value allowed object is {@link PointPropertyType }
   *
   */
  public void setPointRep(PointPropertyType value) {
    this.pointRep = value;
  }

  public boolean isSetPointRep() {
    return (this.pointRep != null);
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
   * Gets the value of the radius property.
   * <p/>
   * @return possible object is {@link LengthType }
   *
   */
  public LengthType getRadius() {
    return radius;
  }

  /**
   * Sets the value of the radius property.
   * <p/>
   * @param value allowed object is {@link LengthType }
   *
   */
  public void setRadius(LengthType value) {
    this.radius = value;
  }

  public boolean isSetRadius() {
    return (this.radius != null);
  }

  /**
   * Gets the value of the startAngle property.
   * <p/>
   * @return possible object is {@link AngleType }
   *
   */
  public AngleType getStartAngle() {
    return startAngle;
  }

  /**
   * Sets the value of the startAngle property.
   * <p/>
   * @param value allowed object is {@link AngleType }
   *
   */
  public void setStartAngle(AngleType value) {
    this.startAngle = value;
  }

  public boolean isSetStartAngle() {
    return (this.startAngle != null);
  }

  /**
   * Gets the value of the endAngle property.
   * <p/>
   * @return possible object is {@link AngleType }
   *
   */
  public AngleType getEndAngle() {
    return endAngle;
  }

  /**
   * Sets the value of the endAngle property.
   * <p/>
   * @param value allowed object is {@link AngleType }
   *
   */
  public void setEndAngle(AngleType value) {
    this.endAngle = value;
  }

  public boolean isSetEndAngle() {
    return (this.endAngle != null);
  }

  /**
   * Gets the value of the interpolation property.
   * <p/>
   * @return possible object is {@link CurveInterpolationType }
   *
   */
  public CurveInterpolationType getInterpolation() {
    if (interpolation == null) {
      return CurveInterpolationType.CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS;
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
    if (numArc == null) {
      return new BigInteger("1");
    } else {
      return numArc;
    }
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
