package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A non-abstract generic collection type that can be used as a document element
 * for a homogeneous collection of any GML types - Geometries, Topologies,
 * Features ...
 * <p/>
 * Java class for ArrayType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ArrayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
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
@XmlType(name = "ArrayType", propOrder = {
  "members"
})
public class ArrayType
  extends AbstractGMLType {

  protected ArrayAssociationType members;

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
