package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A Ring is used to represent a single connected component of a surface
 * boundary. It consists of a sequence of curves connected in a cycle (an object
 * whose boundary is empty). A Ring is structurally similar to a composite curve
 * in that the endPoint of each curve in the sequence is the startPoint of the
 * next curve in the Sequence. Since the sequence is circular, there is no
 * exception to this rule. Each ring, like all boundaries, is a cycle and each
 * ring is simple. NOTE: Even though each Ring is simple, the boundary need not
 * be simple. The easiest case of this is where one of the interior rings of a
 * surface is tangent to its exterior ring.
 * <p/>
 * Java class for RingType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="RingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractRingType">
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
@XmlType(name = "RingType", propOrder = {
  "curveMember"
})
public class RingType
  extends AbstractRingType {

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
