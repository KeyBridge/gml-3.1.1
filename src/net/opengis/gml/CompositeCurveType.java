package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A CompositeCurve is defined by a sequence of (orientable) curves such that
 * the each curve in the sequence terminates at the start point of the
 * subsequent curve in the list.
 * <p/>
 * Java class for CompositeCurveType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CompositeCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCurveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}curveMember" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeCurveType", propOrder = {
  "curveMember"
})
public class CompositeCurveType
  extends AbstractCurveType {

  @XmlElement(required = true)
  protected List<CurvePropertyType> curveMember;

  /**
   * This element references or contains one curve in the composite curve. The
   * curves are contiguous, the collection of curves is ordered. NOTE: This
   * definition allows for a nested structure, i.e. a CompositeCurve may use,
   * for example, another CompositeCurve as a curve member.Gets the value of the
   * curveMember property.
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
}
