package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A composite solid is a geometry type with all the geometric properties of a
 * (primitive) solid. Essentially, a composite solid is a collection of solids
 * that join in pairs on common boundary surfaces and which, when considered as
 * a whole, form a single solid.
 * <p/>
 * Java class for CompositeSolidType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CompositeSolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSolidType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}solidMember" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeSolidType", propOrder = {
  "solidMember"
})
public class CompositeSolidType
  extends AbstractSolidType {

  @XmlElement(required = true)
  protected List<SolidPropertyType> solidMember;

  /**
   * This element references or contains one solid in the composite solid. The
   * solids are contiguous. NOTE: This definition allows for a nested structure,
   * i.e. a CompositeSolid may use, for example, another CompositeSolid as a
   * member.Gets the value of the solidMember property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the solidMember property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSolidMember().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link SolidPropertyType }
   *
   *
   */
  public List<SolidPropertyType> getSolidMember() {
    if (solidMember == null) {
      solidMember = new ArrayList<SolidPropertyType>();
    }
    return this.solidMember;
  }

  public boolean isSetSolidMember() {
    return ((this.solidMember != null) && (!this.solidMember.isEmpty()));
  }

  public void unsetSolidMember() {
    this.solidMember = null;
  }
}
