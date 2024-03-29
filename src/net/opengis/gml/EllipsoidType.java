package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An ellipsoid is a geometric figure that can be used to describe the
 * approximate shape of the earth. In mathematical terms, it is a surface formed
 * by the rotation of an ellipse about its minor axis.
 * <p/>
 * Java class for EllipsoidType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="EllipsoidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}EllipsoidBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}ellipsoidID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}semiMajorAxis"/>
 *         &lt;element ref="{http://www.opengis.net/gml}secondDefiningParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EllipsoidType", propOrder = {
  "ellipsoidID",
  "remarks",
  "semiMajorAxis",
  "secondDefiningParameter"
})
public class EllipsoidType
  extends EllipsoidBaseType {

  protected List<IdentifierType> ellipsoidID;
  protected StringOrRefType remarks;
  @XmlElement(required = true)
  protected MeasureType semiMajorAxis;
  @XmlElement(required = true)
  protected SecondDefiningParameterType secondDefiningParameter;

  /**
   * Set of alternative identifications of this ellipsoid. The first
   * ellipsoidID, if any, is normally the primary identification code, and any
   * others are aliases. Gets the value of the ellipsoidID property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the ellipsoidID property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getEllipsoidID().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
   *
   *
   */
  public List<IdentifierType> getEllipsoidID() {
    if (ellipsoidID == null) {
      ellipsoidID = new ArrayList<IdentifierType>();
    }
    return this.ellipsoidID;
  }

  public boolean isSetEllipsoidID() {
    return ((this.ellipsoidID != null) && (!this.ellipsoidID.isEmpty()));
  }

  public void unsetEllipsoidID() {
    this.ellipsoidID = null;
  }

  /**
   * Comments on or information about this ellipsoid, including source
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
   * Gets the value of the semiMajorAxis property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getSemiMajorAxis() {
    return semiMajorAxis;
  }

  /**
   * Sets the value of the semiMajorAxis property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setSemiMajorAxis(MeasureType value) {
    this.semiMajorAxis = value;
  }

  public boolean isSetSemiMajorAxis() {
    return (this.semiMajorAxis != null);
  }

  /**
   * Gets the value of the secondDefiningParameter property.
   * <p/>
   * @return possible object is {@link SecondDefiningParameterType }
   *
   */
  public SecondDefiningParameterType getSecondDefiningParameter() {
    return secondDefiningParameter;
  }

  /**
   * Sets the value of the secondDefiningParameter property.
   * <p/>
   * @param value allowed object is {@link SecondDefiningParameterType }
   *
   */
  public void setSecondDefiningParameter(SecondDefiningParameterType value) {
    this.secondDefiningParameter = value;
  }

  public boolean isSetSecondDefiningParameter() {
    return (this.secondDefiningParameter != null);
  }
}
