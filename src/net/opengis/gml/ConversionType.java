package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A concrete operation on coordinates that does not include any change of
 * Datum. The best-known example of a coordinate conversion is a map projection.
 * The parameters describing coordinate conversions are defined rather than
 * empirically derived. Note that some conversions have no parameters.
 * <p/>
 * This concrete complexType can be used with all operation methods, without
 * using an Application Schema that defines operation-method-specialized element
 * names and contents, especially for methods with only one Conversion instance.
 * <p/>
 * Java class for ConversionType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ConversionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralConversionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}usesMethod"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionType", propOrder = {
  "usesMethod",
  "usesValue"
})
public class ConversionType
  extends AbstractGeneralConversionType {

  @XmlElement(required = true)
  protected OperationMethodRefType usesMethod;
  protected List<ParameterValueType> usesValue;

  /**
   * Gets the value of the usesMethod property.
   * <p/>
   * @return possible object is {@link OperationMethodRefType }
   *
   */
  public OperationMethodRefType getUsesMethod() {
    return usesMethod;
  }

  /**
   * Sets the value of the usesMethod property.
   * <p/>
   * @param value allowed object is {@link OperationMethodRefType }
   *
   */
  public void setUsesMethod(OperationMethodRefType value) {
    this.usesMethod = value;
  }

  public boolean isSetUsesMethod() {
    return (this.usesMethod != null);
  }

  /**
   * Unordered list of composition associations to the set of parameter values
   * used by this conversion operation. Gets the value of the usesValue
   * property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the usesValue property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getUsesValue().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link ParameterValueType }
   *
   *
   */
  public List<ParameterValueType> getUsesValue() {
    if (usesValue == null) {
      usesValue = new ArrayList<ParameterValueType>();
    }
    return this.usesValue;
  }

  public boolean isSetUsesValue() {
    return ((this.usesValue != null) && (!this.usesValue.isEmpty()));
  }

  public void unsetUsesValue() {
    this.usesValue = null;
  }
}
