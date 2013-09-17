package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A non-abstract generic collection type that can be used as a document element
 * for a collection of any GML types - Geometries, Topologies, Features ...
 * <p/>
 * FeatureCollections may only contain Features. GeometryCollections may only
 * contain Geometrys. Bags are less constrained they must contain objects that
 * are substitutable for gml:_Object. This may mix several levels, including
 * Features, Definitions, Dictionaries, Geometries etc.
 * <p/>
 * The content model would ideally be member 0..* members 0..1 member 0..* for
 * maximum flexibility in building a collection from both homogeneous and
 * distinct components: included "member" elements each contain a single Object
 * an included "members" element contains a set of Objects
 * <p/>
 * However, this is non-deterministic, thus prohibited by XSD.
 * <p/>
 * Java class for BagType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="BagType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}member" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}members" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagType", propOrder = {
  "member",
  "members"
})
public class BagType
  extends AbstractGMLType {

  protected List<AssociationType> member;
  protected ArrayAssociationType members;

  /**
   * Gets the value of the member property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the member property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMember().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link AssociationType }
   *
   *
   */
  public List<AssociationType> getMember() {
    if (member == null) {
      member = new ArrayList<AssociationType>();
    }
    return this.member;
  }

  public boolean isSetMember() {
    return ((this.member != null) && (!this.member.isEmpty()));
  }

  public void unsetMember() {
    this.member = null;
  }

  /**
   * Gets the value of the members property.
   * <p/>
   * @return possible object is {@link ArrayAssociationType }
   *
   */
  public ArrayAssociationType getMembers() {
    return members;
  }

  /**
   * Sets the value of the members property.
   * <p/>
   * @param value allowed object is {@link ArrayAssociationType }
   *
   */
  public void setMembers(ArrayAssociationType value) {
    this.members = value;
  }

  public boolean isSetMembers() {
    return (this.members != null);
  }
}
