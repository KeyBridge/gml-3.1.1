package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for DataBlockType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DataBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}rangeParameters"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}tupleList"/>
 *           &lt;element ref="{http://www.opengis.net/gml}doubleOrNullTupleList"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataBlockType", propOrder = {
  "rangeParameters",
  "tupleList",
  "doubleOrNullTupleList"
})
public class DataBlockType {

  @XmlElement(required = true)
  protected RangeParametersType rangeParameters;
  protected CoordinatesType tupleList;
  @XmlList
  protected List<String> doubleOrNullTupleList;

  /**
   * Gets the value of the rangeParameters property.
   * <p/>
   * @return possible object is {@link RangeParametersType }
   *
   */
  public RangeParametersType getRangeParameters() {
    return rangeParameters;
  }

  /**
   * Sets the value of the rangeParameters property.
   * <p/>
   * @param value allowed object is {@link RangeParametersType }
   *
   */
  public void setRangeParameters(RangeParametersType value) {
    this.rangeParameters = value;
  }

  public boolean isSetRangeParameters() {
    return (this.rangeParameters != null);
  }

  /**
   * Gets the value of the tupleList property.
   * <p/>
   * @return possible object is {@link CoordinatesType }
   *
   */
  public CoordinatesType getTupleList() {
    return tupleList;
  }

  /**
   * Sets the value of the tupleList property.
   * <p/>
   * @param value allowed object is {@link CoordinatesType }
   *
   */
  public void setTupleList(CoordinatesType value) {
    this.tupleList = value;
  }

  public boolean isSetTupleList() {
    return (this.tupleList != null);
  }

  /**
   * Gets the value of the doubleOrNullTupleList property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the doubleOrNullTupleList property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDoubleOrNullTupleList().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link String }
   *
   *
   */
  public List<String> getDoubleOrNullTupleList() {
    if (doubleOrNullTupleList == null) {
      doubleOrNullTupleList = new ArrayList<String>();
    }
    return this.doubleOrNullTupleList;
  }

  public boolean isSetDoubleOrNullTupleList() {
    return ((this.doubleOrNullTupleList != null) && (!this.doubleOrNullTupleList.isEmpty()));
  }

  public void unsetDoubleOrNullTupleList() {
    this.doubleOrNullTupleList = null;
  }
}
