package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A MultiSolid is defined by one or more Solids, referenced through solidMember
 * elements.
 * <p/>
 * Java class for MultiSolidType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="MultiSolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}solidMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}solidMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSolidType", propOrder = {
  "solidMember",
  "solidMembers"
})
public class MultiSolidType
  extends AbstractGeometricAggregateType {

  protected List<SolidPropertyType> solidMember;
  protected SolidArrayPropertyType solidMembers;

  /**
   * Gets the value of the solidMember property.
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

  /**
   * Gets the value of the solidMembers property.
   * <p/>
   * @return possible object is {@link SolidArrayPropertyType }
   *
   */
  public SolidArrayPropertyType getSolidMembers() {
    return solidMembers;
  }

  /**
   * Sets the value of the solidMembers property.
   * <p/>
   * @param value allowed object is {@link SolidArrayPropertyType }
   *
   */
  public void setSolidMembers(SolidArrayPropertyType value) {
    this.solidMembers = value;
  }

  public boolean isSetSolidMembers() {
    return (this.solidMembers != null);
  }
}
