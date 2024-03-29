package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A MultiCurve is defined by one or more Curves, referenced through curveMember
 * elements.
 * <p/>
 * Java class for MultiCurveType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="MultiCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}curveMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}curveMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCurveType", propOrder = {
  "curveMember",
  "curveMembers"
})
public class MultiCurveType
  extends AbstractGeometricAggregateType {

  protected List<CurvePropertyType> curveMember;
  protected CurveArrayPropertyType curveMembers;

  /**
   * Gets the value of the curveMember property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the curveMember property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCurveMember().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link CurvePropertyType }
   *
   *
   */
  public List<CurvePropertyType> getCurveMember() {
    if (curveMember == null) {
      curveMember = new ArrayList<CurvePropertyType>();
    }
    return this.curveMember;
  }

  public boolean isSetCurveMember() {
    return ((this.curveMember != null) && (!this.curveMember.isEmpty()));
  }

  public void unsetCurveMember() {
    this.curveMember = null;
  }

  /**
   * Gets the value of the curveMembers property.
   * <p/>
   * @return possible object is {@link CurveArrayPropertyType }
   *
   */
  public CurveArrayPropertyType getCurveMembers() {
    return curveMembers;
  }

  /**
   * Sets the value of the curveMembers property.
   * <p/>
   * @param value allowed object is {@link CurveArrayPropertyType }
   *
   */
  public void setCurveMembers(CurveArrayPropertyType value) {
    this.curveMembers = value;
  }

  public boolean isSetCurveMembers() {
    return (this.curveMembers != null);
  }
}
