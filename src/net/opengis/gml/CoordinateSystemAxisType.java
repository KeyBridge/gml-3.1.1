package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of a coordinate system axis.
 * <p/>
 * Java class for CoordinateSystemAxisType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CoordinateSystemAxisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}CoordinateSystemAxisBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}axisID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}axisAbbrev"/>
 *         &lt;element ref="{http://www.opengis.net/gml}axisDirection"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml}uom use="required""/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemAxisType", propOrder = {
  "axisID",
  "remarks",
  "axisAbbrev",
  "axisDirection"
})
public class CoordinateSystemAxisType
  extends CoordinateSystemAxisBaseType {

  protected List<IdentifierType> axisID;
  protected StringOrRefType remarks;
  @XmlElement(required = true)
  protected CodeType axisAbbrev;
  @XmlElement(required = true)
  protected CodeType axisDirection;
  @XmlAttribute(name = "uom", namespace = "http://www.opengis.net/gml", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String uom;

  /**
   * Set of alternative identifications of this coordinate system axis. The
   * first axisID, if any, is normally the primary identification code, and any
   * others are aliases. Gets the value of the axisID property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the axisID property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAxisID().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
   *
   *
   */
  public List<IdentifierType> getAxisID() {
    if (axisID == null) {
      axisID = new ArrayList<IdentifierType>();
    }
    return this.axisID;
  }

  public boolean isSetAxisID() {
    return ((this.axisID != null) && (!this.axisID.isEmpty()));
  }

  public void unsetAxisID() {
    this.axisID = null;
  }

  /**
   * Comments on or information about this coordinate system axis, including
   * data source information.
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
   * Gets the value of the axisAbbrev property.
   * <p/>
   * @return possible object is {@link CodeType }
   *
   */
  public CodeType getAxisAbbrev() {
    return axisAbbrev;
  }

  /**
   * Sets the value of the axisAbbrev property.
   * <p/>
   * @param value allowed object is {@link CodeType }
   *
   */
  public void setAxisAbbrev(CodeType value) {
    this.axisAbbrev = value;
  }

  public boolean isSetAxisAbbrev() {
    return (this.axisAbbrev != null);
  }

  /**
   * Gets the value of the axisDirection property.
   * <p/>
   * @return possible object is {@link CodeType }
   *
   */
  public CodeType getAxisDirection() {
    return axisDirection;
  }

  /**
   * Sets the value of the axisDirection property.
   * <p/>
   * @param value allowed object is {@link CodeType }
   *
   */
  public void setAxisDirection(CodeType value) {
    this.axisDirection = value;
  }

  public boolean isSetAxisDirection() {
    return (this.axisDirection != null);
  }

  /**
   * Gets the value of the uom property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getUom() {
    return uom;
  }

  /**
   * Sets the value of the uom property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setUom(String value) {
    this.uom = value;
  }

  public boolean isSetUom() {
    return (this.uom != null);
  }
}
