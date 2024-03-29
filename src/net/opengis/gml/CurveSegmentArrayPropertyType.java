package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * A container for an array of curve segments.
 * <p/>
 * Java class for CurveSegmentArrayPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CurveSegmentArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_CurveSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveSegmentArrayPropertyType", propOrder = {
  "curveSegment"
})
public class CurveSegmentArrayPropertyType {

  @XmlElementRef(name = "_CurveSegment", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<? extends AbstractCurveSegmentType>> curveSegment;

  /**
   * Gets the value of the curveSegment property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the curveSegment property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurveSegment().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
   * {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
   * {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
   * {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
   * {@link JAXBElement }{@code <}{@link ArcType }{@code >}
   * {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
   * {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
   * {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
   * {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
   * {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
   * {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
   * {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
   * {@link JAXBElement }{@code <}{@link CircleType }{@code >}
   * {@link JAXBElement }{@code <}{@link BezierType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<? extends AbstractCurveSegmentType>> getCurveSegment() {
    if (curveSegment == null) {
      curveSegment = new ArrayList<JAXBElement<? extends AbstractCurveSegmentType>>();
    }
    return this.curveSegment;
  }

  public boolean isSetCurveSegment() {
    return ((this.curveSegment != null) && (!this.curveSegment.isEmpty()));
  }

  public void unsetCurveSegment() {
    this.curveSegment = null;
  }
}
