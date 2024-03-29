package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Vector instances hold the compoents for a (usually spatial) vector within
 * some coordinate reference system (CRS). Since Vectors will often be included
 * in larger objects that have references to CRS, the "srsName" attribute may be
 * missing. In this case, the CRS is implicitly assumed to take on the value of
 * the containing object's CRS.
 * <p/>
 * Note that this content model is the same as DirectPositionType, but is
 * defined separately to reflect the distinct semantics, and to avoid validation
 * problems. SJDC 2004-12-02
 * <p/>
 * <p>Java class for VectorType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="VectorType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml>doubleList">
 *       &lt;attGroup ref="{http://www.opengis.net/gml}SRSReferenceGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VectorType", propOrder = {
  "value"
})
public class VectorType {

  @XmlValue
  protected List<Double> value;
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
   * XML List based on XML Schema double type. An element of this type contains
   * a space-separated list of double values Gets the value of the value
   * property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the value property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getValue().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link Double }
   *
   *
   */
  public List<Double> getValue() {
    if (value == null) {
      value = new ArrayList<Double>();
    }
    return this.value;
  }

  public boolean isSetValue() {
    return ((this.value != null) && (!this.value.isEmpty()));
  }

  public void unsetValue() {
    this.value = null;
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
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the axisLabels property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getAxisLabels().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link String }
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
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the uomLabels property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getUomLabels().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link String }
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
}
