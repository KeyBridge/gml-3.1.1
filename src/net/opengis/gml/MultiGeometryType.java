package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A geometry collection must include one or more geometries, referenced through
 * geometryMember elements.
 * <p/>
 * Java class for MultiGeometryType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="MultiGeometryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}geometryMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}geometryMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiGeometryType", propOrder = {
  "geometryMember",
  "geometryMembers"
})
public class MultiGeometryType
  extends AbstractGeometricAggregateType {

  protected List<GeometryPropertyType> geometryMember;
  protected GeometryArrayPropertyType geometryMembers;

  /**
   * Gets the value of the geometryMember property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the geometryMember property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getGeometryMember().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link GeometryPropertyType }
   *
   *
   */
  public List<GeometryPropertyType> getGeometryMember() {
    if (geometryMember == null) {
      geometryMember = new ArrayList<GeometryPropertyType>();
    }
    return this.geometryMember;
  }

  public boolean isSetGeometryMember() {
    return ((this.geometryMember != null) && (!this.geometryMember.isEmpty()));
  }

  public void unsetGeometryMember() {
    this.geometryMember = null;
  }

  /**
   * Gets the value of the geometryMembers property.
   * <p/>
   * @return possible object is {@link GeometryArrayPropertyType }
   *
   */
  public GeometryArrayPropertyType getGeometryMembers() {
    return geometryMembers;
  }

  /**
   * Sets the value of the geometryMembers property.
   * <p/>
   * @param value allowed object is {@link GeometryArrayPropertyType }
   *
   */
  public void setGeometryMembers(GeometryArrayPropertyType value) {
    this.geometryMembers = value;
  }

  public boolean isSetGeometryMembers() {
    return (this.geometryMembers != null);
  }
}
