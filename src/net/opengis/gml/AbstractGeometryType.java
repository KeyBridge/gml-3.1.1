package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * All geometry elements are derived directly or indirectly from this abstract
 * supertype. A geometry element may have an identifying attribute ("gml:id"), a
 * name (attribute "name") and a description (attribute "description"). It may
 * be associated with a spatial reference system (attribute "srsName"). The
 * following rules shall be adhered: - Every geometry type shall derive from
 * this abstract type. - Every geometry element (i.e. an element of a geometry
 * type) shall be directly or indirectly in the substitution group of _Geometry.
 * <p/>
 * Java class for AbstractGeometryType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractGeometryType"> &lt;complexContent>
 * &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 * &lt;attGroup ref="{http://www.opengis.net/gml}SRSReferenceGroup"/>
 * &lt;attribute name="gid" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometryType")
@XmlSeeAlso({
  GeometricComplexType.class,
  GridType.class,
  AbstractRingType.class,
  AbstractGeometricPrimitiveType.class,
  AbstractGeometricAggregateType.class
})
public abstract class AbstractGeometryType extends AbstractGMLType {

  @XmlAttribute(name = "gid")
  protected String gid;
  @XmlAttribute(name = "srsName")
  @XmlSchemaType(name = "anyURI")
  protected String srsName;
  @XmlAttribute(name = "srsDimension")
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger srsDimension;
  @XmlAttribute(name = "axisLabels")
  protected List<String> axisLabels;
  @XmlAttribute(name = "uomLabels")
  protected List<String> uomLabels;

  /**
   * Gets the value of the gid property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getGid() {
    return gid;
  }

  /**
   * Sets the value of the gid property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setGid(String value) {
    this.gid = value;
  }

  public boolean isSetGid() {
    return (this.gid != null);
  }

  /**
   * Gets the value of the srsName property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getSrsName() {
    return srsName;
  }

  /**
   * Sets the value of the srsName property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setSrsName(String value) {
    this.srsName = value;
  }

  public boolean isSetSrsName() {
    return (this.srsName != null);
  }

  /**
   * Gets the value of the srsDimension property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getSrsDimension() {
    return srsDimension;
  }

  /**
   * Sets the value of the srsDimension property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setSrsDimension(BigInteger value) {
    this.srsDimension = value;
  }

  public boolean isSetSrsDimension() {
    return (this.srsDimension != null);
  }

  /**
   * Gets the value of the axisLabels property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the axisLabels property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAxisLabels().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link String }
   *
   *
   */
  public List<String> getAxisLabels() {
    if (axisLabels == null) {
      axisLabels = new ArrayList<String>();
    }
    return this.axisLabels;
  }

  public boolean isSetAxisLabels() {
    return ((this.axisLabels != null) && (!this.axisLabels.isEmpty()));
  }

  public void unsetAxisLabels() {
    this.axisLabels = null;
  }

  /**
   * Gets the value of the uomLabels property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the uomLabels property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUomLabels().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link String }
   *
   *
   */
  public List<String> getUomLabels() {
    if (uomLabels == null) {
      uomLabels = new ArrayList<String>();
    }
    return this.uomLabels;
  }

  public boolean isSetUomLabels() {
    return ((this.uomLabels != null) && (!this.uomLabels.isEmpty()));
  }

  public void unsetUomLabels() {
    this.uomLabels = null;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 47 * hash + Objects.hashCode(this.gid);
    hash = 47 * hash + Objects.hashCode(this.srsName);
    hash = 47 * hash + Objects.hashCode(this.srsDimension);
    hash = 47 * hash + Objects.hashCode(this.axisLabels);
    hash = 47 * hash + Objects.hashCode(this.uomLabels);
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
    final AbstractGeometryType other = (AbstractGeometryType) obj;
    if (!Objects.equals(this.gid, other.gid)) {
      return false;
    }
    if (!Objects.equals(this.srsName, other.srsName)) {
      return false;
    }
    if (!Objects.equals(this.srsDimension, other.srsDimension)) {
      return false;
    }
    if (!Objects.equals(this.axisLabels, other.axisLabels)) {
      return false;
    }
    if (!Objects.equals(this.uomLabels, other.uomLabels)) {
      return false;
    }
    return true;
  }
}
