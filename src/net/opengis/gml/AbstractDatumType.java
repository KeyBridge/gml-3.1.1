package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * A datum specifies the relationship of a coordinate system to the earth, thus
 * creating a coordinate reference system. A datum uses a parameter or set of
 * parameters that determine the location of the origin of the coordinate
 * reference system. Each datum subtype can be associated with only specific
 * types of coordinate systems. This abstract complexType shall not be used,
 * extended, or restricted, in an Application Schema, to define a concrete
 * subtype with a meaning equivalent to a concrete subtype specified in this
 * document.
 * <p/>
 * Java class for AbstractDatumType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractDatumType"> &lt;complexContent>
 * &lt;extension base="{http://www.opengis.net/gml}AbstractDatumBaseType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}datumID"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}anchorPoint" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}realizationEpoch" minOccurs="0"/>
 * &lt;element ref="{http://www.opengis.net/gml}validArea" minOccurs="0"/>
 * &lt;element ref="{http://www.opengis.net/gml}scope" minOccurs="0"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDatumType", propOrder = {
  "datumID",
  "remarks",
  "anchorPoint",
  "realizationEpoch",
  "validArea",
  "scope"
})
@XmlSeeAlso({
  VerticalDatumType.class,
  EngineeringDatumType.class,
  ImageDatumType.class,
  GeodeticDatumType.class,
  TemporalDatumBaseType.class
})
public abstract class AbstractDatumType extends AbstractDatumBaseType {

  protected List<IdentifierType> datumID;
  protected StringOrRefType remarks;
  protected CodeType anchorPoint;
  @XmlSchemaType(name = "date")
  protected XMLGregorianCalendar realizationEpoch;
  protected ExtentType validArea;
  protected String scope;

  /**
   * Set of alternative identifications of this datum. The first datumID, if
   * any, is normally the primary identification code, and any others are
   * aliases. Gets the value of the datumID property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the datumID property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDatumID().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
   *
   *
   */
  public List<IdentifierType> getDatumID() {
    if (datumID == null) {
      datumID = new ArrayList<IdentifierType>();
    }
    return this.datumID;
  }

  public boolean isSetDatumID() {
    return ((this.datumID != null) && (!this.datumID.isEmpty()));
  }

  public void unsetDatumID() {
    this.datumID = null;
  }

  /**
   * Comments on this reference system, including source information.
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
   * Gets the value of the anchorPoint property.
   * <p/>
   * @return possible object is {@link CodeType }
   *
   */
  public CodeType getAnchorPoint() {
    return anchorPoint;
  }

  /**
   * Sets the value of the anchorPoint property.
   * <p/>
   * @param value allowed object is {@link CodeType }
   *
   */
  public void setAnchorPoint(CodeType value) {
    this.anchorPoint = value;
  }

  public boolean isSetAnchorPoint() {
    return (this.anchorPoint != null);
  }

  /**
   * Gets the value of the realizationEpoch property.
   * <p/>
   * @return possible object is {@link XMLGregorianCalendar }
   *
   */
  public XMLGregorianCalendar getRealizationEpoch() {
    return realizationEpoch;
  }

  /**
   * Sets the value of the realizationEpoch property.
   * <p/>
   * @param value allowed object is {@link XMLGregorianCalendar }
   *
   */
  public void setRealizationEpoch(XMLGregorianCalendar value) {
    this.realizationEpoch = value;
  }

  public boolean isSetRealizationEpoch() {
    return (this.realizationEpoch != null);
  }

  /**
   * Gets the value of the validArea property.
   * <p/>
   * @return possible object is {@link ExtentType }
   *
   */
  public ExtentType getValidArea() {
    return validArea;
  }

  /**
   * Sets the value of the validArea property.
   * <p/>
   * @param value allowed object is {@link ExtentType }
   *
   */
  public void setValidArea(ExtentType value) {
    this.validArea = value;
  }

  public boolean isSetValidArea() {
    return (this.validArea != null);
  }

  /**
   * Gets the value of the scope property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getScope() {
    return scope;
  }

  /**
   * Sets the value of the scope property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setScope(String value) {
    this.scope = value;
  }

  public boolean isSetScope() {
    return (this.scope != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 79 * hash + Objects.hashCode(this.datumID);
    hash = 79 * hash + Objects.hashCode(this.remarks);
    hash = 79 * hash + Objects.hashCode(this.anchorPoint);
    hash = 79 * hash + Objects.hashCode(this.realizationEpoch);
    hash = 79 * hash + Objects.hashCode(this.validArea);
    hash = 79 * hash + Objects.hashCode(this.scope);
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
    final AbstractDatumType other = (AbstractDatumType) obj;
    if (this.hashCode() != obj.hashCode()) {
      return false;
    }
    return true;
  }
}
