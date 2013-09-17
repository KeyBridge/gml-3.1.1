package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * DirectPosition instances hold the coordinates for a position within some
 * coordinate reference system (CRS). Since DirectPositions, as data types, will
 * often be included in larger objects (such as geometry elements) that have
 * references to CRS, the "srsName" attribute will in general be missing, if
 * this particular DirectPosition is included in a larger element with such a
 * reference to a CRS. In this case, the CRS is implicitly assumed to take on
 * the value of the containing object's CRS.
 * <p/>
 * Java class for DirectPositionType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="DirectPositionType"> &lt;simpleContent>
 * &lt;extension base="&lt;http://www.opengis.net/gml>doubleList"> &lt;attGroup
 * ref="{http://www.opengis.net/gml}SRSReferenceGroup"/> &lt;/extension>
 * &lt;/simpleContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectPositionType", propOrder = {
  "value"
})
public class DirectPositionType {

  /**
   * A List of coordinate values. For coordinate pairs the first entry is the
   * latitude and the second entry is the longitude.
   * <p/>
   * Recommend using the latitude and longitude getter/setter methods instead of
   * directly accessing this list.
   */
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

  public DirectPositionType() {
  }

  public DirectPositionType(Double latitude, Double longitude) {
    setLatitude(latitude);
    setLongitude(longitude);
  }

  /**
   * XML List based on XML Schema double type. An element of this type contains
   * a space-separated list of double values.
   * <p/>
   * Gets the value of the value property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the value property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValue().add(newItem);
   * </pre>
   * <p/>
   * @return a non null list with guaranteed two entries.
   */
  public List<Double> getValue() {
    if (value == null) {
      value = new ArrayList<Double>();
      value.add(null);
      value.add(null);
    }
    return this.value;
  }

  public boolean isSetValue() {
    return ((this.value != null) && (!this.value.isEmpty()));
  }

  public void unsetValue() {
    this.value = null;
  }

  public Double getLatitude() {
    return isSetValue() ? value.get(0) : null;
  }

  public final void setLatitude(Double latitude) {
    getValue().set(0, latitude);
  }

  public Double getLongitude() {
    return isSetValue() && value.size() == 2 ? value.get(1) : null;
  }

  public final void setLongitude(Double longitude) {
    getValue().set(1, longitude);
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

  /**
   * @return a minimal string of [latitude, longitude]
   */
  @Override
  public String toString() {
    return getLatitude() + ", " + getLongitude();
  }

  public String toStringFull() {
    return "DirectPositionType{"
      + "value=" + value
      + ", srsName=" + srsName
      + ", srsDimension=" + srsDimension
      + ", axisLabels=" + axisLabels
      + ", uomLabels=" + uomLabels
      + '}';
  }
}
