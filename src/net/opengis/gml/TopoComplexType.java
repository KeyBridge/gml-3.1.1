package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This type represents a TP_Complex capable of holding topological primitives.
 * <p/>
 * <p>Java class for TopoComplexType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTopologyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}maximalComplex"/>
 *         &lt;element ref="{http://www.opengis.net/gml}superComplex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}subComplex" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}topoPrimitiveMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}topoPrimitiveMembers" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isMaximal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoComplexType", propOrder = {
  "maximalComplex",
  "superComplex",
  "subComplex",
  "topoPrimitiveMember",
  "topoPrimitiveMembers"
})
public class TopoComplexType
  extends AbstractTopologyType {

  @XmlElement(required = true)
  protected TopoComplexMemberType maximalComplex;
  protected List<TopoComplexMemberType> superComplex;
  protected List<TopoComplexMemberType> subComplex;
  protected List<TopoPrimitiveMemberType> topoPrimitiveMember;
  protected TopoPrimitiveArrayAssociationType topoPrimitiveMembers;
  @XmlAttribute(name = "isMaximal")
  protected Boolean isMaximal;

  /**
   * Gets the value of the maximalComplex property.
   * <p/>
   * @return possible object is {@link TopoComplexMemberType }
   *
   */
  public TopoComplexMemberType getMaximalComplex() {
    return maximalComplex;
  }

  /**
   * Sets the value of the maximalComplex property.
   * <p/>
   * @param value allowed object is {@link TopoComplexMemberType }
   *
   */
  public void setMaximalComplex(TopoComplexMemberType value) {
    this.maximalComplex = value;
  }

  public boolean isSetMaximalComplex() {
    return (this.maximalComplex != null);
  }

  /**
   * Gets the value of the superComplex property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the superComplex property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getSuperComplex().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TopoComplexMemberType }
   *
   *
   */
  public List<TopoComplexMemberType> getSuperComplex() {
    if (superComplex == null) {
      superComplex = new ArrayList<TopoComplexMemberType>();
    }
    return this.superComplex;
  }

  public boolean isSetSuperComplex() {
    return ((this.superComplex != null) && (!this.superComplex.isEmpty()));
  }

  public void unsetSuperComplex() {
    this.superComplex = null;
  }

  /**
   * Gets the value of the subComplex property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the subComplex property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getSubComplex().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TopoComplexMemberType }
   *
   *
   */
  public List<TopoComplexMemberType> getSubComplex() {
    if (subComplex == null) {
      subComplex = new ArrayList<TopoComplexMemberType>();
    }
    return this.subComplex;
  }

  public boolean isSetSubComplex() {
    return ((this.subComplex != null) && (!this.subComplex.isEmpty()));
  }

  public void unsetSubComplex() {
    this.subComplex = null;
  }

  /**
   * Gets the value of the topoPrimitiveMember property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the topoPrimitiveMember property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getTopoPrimitiveMember().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TopoPrimitiveMemberType }
   *
   *
   */
  public List<TopoPrimitiveMemberType> getTopoPrimitiveMember() {
    if (topoPrimitiveMember == null) {
      topoPrimitiveMember = new ArrayList<TopoPrimitiveMemberType>();
    }
    return this.topoPrimitiveMember;
  }

  public boolean isSetTopoPrimitiveMember() {
    return ((this.topoPrimitiveMember != null) && (!this.topoPrimitiveMember.isEmpty()));
  }

  public void unsetTopoPrimitiveMember() {
    this.topoPrimitiveMember = null;
  }

  /**
   * Gets the value of the topoPrimitiveMembers property.
   * <p/>
   * @return possible object is {@link TopoPrimitiveArrayAssociationType }
   *
   */
  public TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers() {
    return topoPrimitiveMembers;
  }

  /**
   * Sets the value of the topoPrimitiveMembers property.
   * <p/>
   * @param value allowed object is {@link TopoPrimitiveArrayAssociationType }
   *
   */
  public void setTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType value) {
    this.topoPrimitiveMembers = value;
  }

  public boolean isSetTopoPrimitiveMembers() {
    return (this.topoPrimitiveMembers != null);
  }

  /**
   * Gets the value of the isMaximal property.
   * <p/>
   * @return possible object is {@link Boolean }
   *
   */
  public boolean isIsMaximal() {
    if (isMaximal == null) {
      return false;
    } else {
      return isMaximal;
    }
  }

  /**
   * Sets the value of the isMaximal property.
   * <p/>
   * @param value allowed object is {@link Boolean }
   *
   */
  public void setIsMaximal(boolean value) {
    this.isMaximal = value;
  }

  public boolean isSetIsMaximal() {
    return (this.isMaximal != null);
  }

  public void unsetIsMaximal() {
    this.isMaximal = null;
  }
}
