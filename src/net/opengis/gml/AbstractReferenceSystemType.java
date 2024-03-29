package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Description of a spatial and/or temporal reference system used by a dataset.
 * <p/>
 * Java class for AbstractReferenceSystemType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractReferenceSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}srsID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}validArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}scope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractReferenceSystemType", propOrder = {
  "srsID",
  "remarks",
  "validArea",
  "scope"
})
@XmlSeeAlso({
  GeographicCRSType.class,
  TemporalCRSType.class,
  ImageCRSType.class,
  VerticalCRSType.class,
  EngineeringCRSType.class,
  GeocentricCRSType.class,
  AbstractGeneralDerivedCRSType.class,
  CompoundCRSType.class
})
public abstract class AbstractReferenceSystemType
  extends AbstractReferenceSystemBaseType {

  protected List<IdentifierType> srsID;
  protected StringOrRefType remarks;
  protected ExtentType validArea;
  protected String scope;

  /**
   * Set of alterative identifications of this reference system. The first
   * srsID, if any, is normally the primary identification code, and any others
   * are aliases.Gets the value of the srsID property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the srsID property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSrsID().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
   *
   *
   */
  public List<IdentifierType> getSrsID() {
    if (srsID == null) {
      srsID = new ArrayList<IdentifierType>();
    }
    return this.srsID;
  }

  public boolean isSetSrsID() {
    return ((this.srsID != null) && (!this.srsID.isEmpty()));
  }

  public void unsetSrsID() {
    this.srsID = null;
  }

  /**
   * Comments on or information about this reference system, including source
   * information.
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
}
