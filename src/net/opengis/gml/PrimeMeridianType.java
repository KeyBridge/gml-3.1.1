package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A prime meridian defines the origin from which longitude values are
 * determined.
 * <p/>
 * Java class for PrimeMeridianType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="PrimeMeridianType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}PrimeMeridianBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}meridianID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}greenwichLongitude"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimeMeridianType", propOrder = {
  "meridianID",
  "remarks",
  "greenwichLongitude"
})
public class PrimeMeridianType
  extends PrimeMeridianBaseType {

  protected List<IdentifierType> meridianID;
  protected StringOrRefType remarks;
  @XmlElement(required = true)
  protected AngleChoiceType greenwichLongitude;

  /**
   * Set of alternative identifications of this prime meridian. The first
   * meridianID, if any, is normally the primary identification code, and any
   * others are aliases. Gets the value of the meridianID property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the meridianID property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMeridianID().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
   *
   *
   */
  public List<IdentifierType> getMeridianID() {
    if (meridianID == null) {
      meridianID = new ArrayList<IdentifierType>();
    }
    return this.meridianID;
  }

  public boolean isSetMeridianID() {
    return ((this.meridianID != null) && (!this.meridianID.isEmpty()));
  }

  public void unsetMeridianID() {
    this.meridianID = null;
  }

  /**
   * Comments on or information about this prime meridian, including source
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
   * Gets the value of the greenwichLongitude property.
   * <p/>
   * @return possible object is {@link AngleChoiceType }
   *
   */
  public AngleChoiceType getGreenwichLongitude() {
    return greenwichLongitude;
  }

  /**
   * Sets the value of the greenwichLongitude property.
   * <p/>
   * @param value allowed object is {@link AngleChoiceType }
   *
   */
  public void setGreenwichLongitude(AngleChoiceType value) {
    this.greenwichLongitude = value;
  }

  public boolean isSetGreenwichLongitude() {
    return (this.greenwichLongitude != null);
  }
}
