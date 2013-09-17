package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * A container for an array of curves. The elements are always contained in the
 * array property, referencing geometry elements or arrays of geometry elements
 * is not supported.
 * <p/>
 * Java class for CurveArrayPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CurveArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Curve" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveArrayPropertyType", propOrder = {
  "curve"
})
public class CurveArrayPropertyType {

  @XmlElementRef(name = "_Curve", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<? extends AbstractCurveType>> curve;

  /**
   * Gets the value of the curve property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the curve property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurve().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
   * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
   * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<? extends AbstractCurveType>> getCurve() {
    if (curve == null) {
      curve = new ArrayList<JAXBElement<? extends AbstractCurveType>>();
    }
    return this.curve;
  }

  public boolean isSetCurve() {
    return ((this.curve != null) && (!this.curve.isEmpty()));
  }

  public void unsetCurve() {
    this.curve = null;
  }
}
