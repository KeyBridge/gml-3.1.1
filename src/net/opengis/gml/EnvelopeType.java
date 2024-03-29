package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Envelope defines an extent using a pair of positions defining opposite
 * corners in arbitrary dimensions. The first direct position is the "lower
 * corner" (a coordinate position consisting of all the minimal ordinates for
 * each dimension for all points within the envelope), the second one the "upper
 * corner" (a coordinate position consisting of all the maximal ordinates for
 * each dimension for all points within the envelope).
 * <p/>
 * Java class for EnvelopeType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="EnvelopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="lowerCorner" type="{http://www.opengis.net/gml}DirectPositionType"/>
 *           &lt;element name="upperCorner" type="{http://www.opengis.net/gml}DirectPositionType"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}coord" maxOccurs="2" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml}pos" maxOccurs="2" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml}coordinates"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}SRSReferenceGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeType", propOrder = {
  "lowerCorner",
  "upperCorner",
  "coord",
  "pos",
  "coordinates"
})
@XmlSeeAlso({
  EnvelopeWithTimePeriodType.class
})
public class EnvelopeType {

  protected DirectPositionType lowerCorner;
  protected DirectPositionType upperCorner;
  protected List<CoordType> coord;
  protected List<DirectPositionType> pos;
  protected CoordinatesType coordinates;
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
   * Gets the value of the lowerCorner property.
   * <p/>
   * @return possible object is {@link DirectPositionType }
   *
   */
  public DirectPositionType getLowerCorner() {
    return lowerCorner;
  }

  /**
   * Sets the value of the lowerCorner property.
   * <p/>
   * @param value allowed object is {@link DirectPositionType }
   *
   */
  public void setLowerCorner(DirectPositionType value) {
    this.lowerCorner = value;
  }

  public boolean isSetLowerCorner() {
    return (this.lowerCorner != null);
  }

  /**
   * Gets the value of the upperCorner property.
   * <p/>
   * @return possible object is {@link DirectPositionType }
   *
   */
  public DirectPositionType getUpperCorner() {
    return upperCorner;
  }

  /**
   * Sets the value of the upperCorner property.
   * <p/>
   * @param value allowed object is {@link DirectPositionType }
   *
   */
  public void setUpperCorner(DirectPositionType value) {
    this.upperCorner = value;
  }

  public boolean isSetUpperCorner() {
    return (this.upperCorner != null);
  }

  /**
   * deprecated with GML version 3.0 Gets the value of the coord property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the coord property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCoord().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link CoordType }
   *
   *
   */
  public List<CoordType> getCoord() {
    if (coord == null) {
      coord = new ArrayList<CoordType>();
    }
    return this.coord;
  }

  public boolean isSetCoord() {
    return ((this.coord != null) && (!this.coord.isEmpty()));
  }

  public void unsetCoord() {
    this.coord = null;
  }

  /**
   * Deprecated with GML version 3.1. Use the explicit properties "lowerCorner"
   * and "upperCorner" instead.Gets the value of the pos property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the pos property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPos().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link DirectPositionType }
   *
   *
   */
  public List<DirectPositionType> getPos() {
    if (pos == null) {
      pos = new ArrayList<DirectPositionType>();
    }
    return this.pos;
  }

  public boolean isSetPos() {
    return ((this.pos != null) && (!this.pos.isEmpty()));
  }

  public void unsetPos() {
    this.pos = null;
  }

  /**
   * Deprecated with GML version 3.1.0. Use the explicit properties
   * "lowerCorner" and "upperCorner" instead.
   * <p/>
   * @return possible object is {@link CoordinatesType }
   *
   */
  public CoordinatesType getCoordinates() {
    return coordinates;
  }

  /**
   * Sets the value of the coordinates property.
   * <p/>
   * @param value allowed object is {@link CoordinatesType }
   *
   */
  public void setCoordinates(CoordinatesType value) {
    this.coordinates = value;
  }

  public boolean isSetCoordinates() {
    return (this.coordinates != null);
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
}
