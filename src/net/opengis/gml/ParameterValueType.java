package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * A parameter value, ordered sequence of values, or reference to a file of
 * parameter values. This concrete complexType can be used for operation methods
 * without using an Application Schema that defines operation-method-specialized
 * element names and contents, especially for methods with only one instance.
 * This complexType can be used, extended, or restricted for well-known
 * operation methods, especially for methods with many instances.
 * <p/>
 * Java class for ParameterValueType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ParameterValueType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeneralParameterValueType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}value"/>
 *           &lt;element ref="{http://www.opengis.net/gml}dmsAngleValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml}stringValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml}integerValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml}booleanValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml}valueList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}integerValueList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}valueFile"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}valueOfParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueType", propOrder = {
  "value",
  "dmsAngleValue",
  "stringValue",
  "integerValue",
  "booleanValue",
  "valueList",
  "integerValueList",
  "valueFile",
  "valueOfParameter"
})
public class ParameterValueType
  extends AbstractGeneralParameterValueType {

  protected MeasureType value;
  protected DMSAngleType dmsAngleValue;
  protected String stringValue;
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger integerValue;
  protected Boolean booleanValue;
  protected MeasureListType valueList;
  @XmlList
  protected List<BigInteger> integerValueList;
  @XmlSchemaType(name = "anyURI")
  protected String valueFile;
  @XmlElement(required = true)
  protected OperationParameterRefType valueOfParameter;

  /**
   * Gets the value of the value property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setValue(MeasureType value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Gets the value of the dmsAngleValue property.
   * <p/>
   * @return possible object is {@link DMSAngleType }
   *
   */
  public DMSAngleType getDmsAngleValue() {
    return dmsAngleValue;
  }

  /**
   * Sets the value of the dmsAngleValue property.
   * <p/>
   * @param value allowed object is {@link DMSAngleType }
   *
   */
  public void setDmsAngleValue(DMSAngleType value) {
    this.dmsAngleValue = value;
  }

  public boolean isSetDmsAngleValue() {
    return (this.dmsAngleValue != null);
  }

  /**
   * Gets the value of the stringValue property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getStringValue() {
    return stringValue;
  }

  /**
   * Sets the value of the stringValue property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setStringValue(String value) {
    this.stringValue = value;
  }

  public boolean isSetStringValue() {
    return (this.stringValue != null);
  }

  /**
   * Gets the value of the integerValue property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getIntegerValue() {
    return integerValue;
  }

  /**
   * Sets the value of the integerValue property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setIntegerValue(BigInteger value) {
    this.integerValue = value;
  }

  public boolean isSetIntegerValue() {
    return (this.integerValue != null);
  }

  /**
   * Gets the value of the booleanValue property.
   * <p/>
   * @return possible object is {@link Boolean }
   *
   */
  public Boolean isBooleanValue() {
    return booleanValue;
  }

  /**
   * Sets the value of the booleanValue property.
   * <p/>
   * @param value allowed object is {@link Boolean }
   *
   */
  public void setBooleanValue(Boolean value) {
    this.booleanValue = value;
  }

  public boolean isSetBooleanValue() {
    return (this.booleanValue != null);
  }

  /**
   * Gets the value of the valueList property.
   * <p/>
   * @return possible object is {@link MeasureListType }
   *
   */
  public MeasureListType getValueList() {
    return valueList;
  }

  /**
   * Sets the value of the valueList property.
   * <p/>
   * @param value allowed object is {@link MeasureListType }
   *
   */
  public void setValueList(MeasureListType value) {
    this.valueList = value;
  }

  public boolean isSetValueList() {
    return (this.valueList != null);
  }

  /**
   * Gets the value of the integerValueList property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the integerValueList property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getIntegerValueList().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   *
   *
   */
  public List<BigInteger> getIntegerValueList() {
    if (integerValueList == null) {
      integerValueList = new ArrayList<BigInteger>();
    }
    return this.integerValueList;
  }

  public boolean isSetIntegerValueList() {
    return ((this.integerValueList != null) && (!this.integerValueList.isEmpty()));
  }

  public void unsetIntegerValueList() {
    this.integerValueList = null;
  }

  /**
   * Gets the value of the valueFile property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getValueFile() {
    return valueFile;
  }

  /**
   * Sets the value of the valueFile property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setValueFile(String value) {
    this.valueFile = value;
  }

  public boolean isSetValueFile() {
    return (this.valueFile != null);
  }

  /**
   * Gets the value of the valueOfParameter property.
   * <p/>
   * @return possible object is {@link OperationParameterRefType }
   *
   */
  public OperationParameterRefType getValueOfParameter() {
    return valueOfParameter;
  }

  /**
   * Sets the value of the valueOfParameter property.
   * <p/>
   * @param value allowed object is {@link OperationParameterRefType }
   *
   */
  public void setValueOfParameter(OperationParameterRefType value) {
    this.valueOfParameter = value;
  }

  public boolean isSetValueOfParameter() {
    return (this.valueOfParameter != null);
  }
}
