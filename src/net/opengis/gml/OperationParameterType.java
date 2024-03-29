package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * The definition of a parameter used by an operation method. Most parameter
 * values are numeric, but other types of parameter values are possible. This
 * complexType is expected to be used or extended for all operation methods,
 * without defining operation-method-specialized element names.
 * <p/>
 * Java class for OperationParameterType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="OperationParameterType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}OperationParameterBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}parameterID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationParameterType", propOrder = {
  "parameterID",
  "remarks"
})
public class OperationParameterType
  extends OperationParameterBaseType {

  protected List<IdentifierType> parameterID;
  protected StringOrRefType remarks;

  /**
   * Set of alternative identifications of this operation parameter. The first
   * parameterID, if any, is normally the primary identification code, and any
   * others are aliases. Gets the value of the parameterID property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the parameterID property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getParameterID().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link IdentifierType }
   *
   *
   */
  public List<IdentifierType> getParameterID() {
    if (parameterID == null) {
      parameterID = new ArrayList<IdentifierType>();
    }
    return this.parameterID;
  }

  public boolean isSetParameterID() {
    return ((this.parameterID != null) && (!this.parameterID.isEmpty()));
  }

  public void unsetParameterID() {
    this.parameterID = null;
  }

  /**
   * Comments on or information about this operation parameter, including source
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
}
