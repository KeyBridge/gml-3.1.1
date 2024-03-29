package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A coordinate system (CS) is the set of coordinate system axes that spans a
 * given coordinate space. A CS is derived from a set of (mathematical) rules
 * for specifying how coordinates in a given space are to be assigned to points.
 * The coordinate values in a coordinate tuple shall be recorded in the order in
 * which the coordinate system axes associations are recorded, whenever those
 * coordinates use a coordinate reference system that uses this coordinate
 * system. This abstract complexType shall not be used, extended, or restricted,
 * in an Application Schema, to define a concrete subtype with a meaning
 * equivalent to a concrete subtype specified in this document.
 * <p/>
 * Java class for AbstractCoordinateSystemType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractCoordinateSystemType"> &lt;complexContent>
 * &lt;extension
 * base="{http://www.opengis.net/gml}AbstractCoordinateSystemBaseType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}csID"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}usesAxis" maxOccurs="unbounded"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateSystemType", propOrder = {
  "csID",
  "remarks",
  "usesAxis"
})
@XmlSeeAlso({
  ObliqueCartesianCSType.class,
  VerticalCSType.class,
  LinearCSType.class,
  SphericalCSType.class,
  EllipsoidalCSType.class,
  CartesianCSType.class,
  CylindricalCSType.class,
  TemporalCSType.class,
  UserDefinedCSType.class,
  PolarCSType.class
})
public abstract class AbstractCoordinateSystemType extends AbstractCoordinateSystemBaseType {

  protected List<IdentifierType> csID;
  protected StringOrRefType remarks;
  @XmlElement(required = true)
  protected List<CoordinateSystemAxisRefType> usesAxis;

  /**
   * Set of alternative identifications of this coordinate system. The first
   * csID, if any, is normally the primary identification code, and any others
   * are aliases. Gets the value of the csID property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the csID property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCsID().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
   *
   *
   */
  public List<IdentifierType> getCsID() {
    if (csID == null) {
      csID = new ArrayList<IdentifierType>();
    }
    return this.csID;
  }

  public boolean isSetCsID() {
    return ((this.csID != null) && (!this.csID.isEmpty()));
  }

  public void unsetCsID() {
    this.csID = null;
  }

  /**
   * Comments on or information about this coordinate system, including data
   * source information.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getRemarks() {
    return remarks;
  }

  /**
   * Sets the value of the remarks property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setRemarks(StringOrRefType value) {
    this.remarks = value;
  }

  public boolean isSetRemarks() {
    return (this.remarks != null);
  }

  /**
   * Ordered sequence of associations to the coordinate system axes included in
   * this coordinate system. Gets the value of the usesAxis property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the usesAxis property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUsesAxis().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link CoordinateSystemAxisRefType }
   *
   *
   */
  public List<CoordinateSystemAxisRefType> getUsesAxis() {
    if (usesAxis == null) {
      usesAxis = new ArrayList<CoordinateSystemAxisRefType>();
    }
    return this.usesAxis;
  }

  public boolean isSetUsesAxis() {
    return ((this.usesAxis != null) && (!this.usesAxis.isEmpty()));
  }

  public void unsetUsesAxis() {
    this.usesAxis = null;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 97 * hash + Objects.hashCode(this.csID);
    hash = 97 * hash + Objects.hashCode(this.remarks);
    hash = 97 * hash + Objects.hashCode(this.usesAxis);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final AbstractCoordinateSystemType other = (AbstractCoordinateSystemType) obj;
    if (!Objects.equals(this.csID, other.csID)) {
      return false;
    }
    if (!Objects.equals(this.remarks, other.remarks)) {
      return false;
    }
    if (!Objects.equals(this.usesAxis, other.usesAxis)) {
      return false;
    }
    return true;
  }
}
