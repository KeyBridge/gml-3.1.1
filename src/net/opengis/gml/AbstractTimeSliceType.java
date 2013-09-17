package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A timeslice encapsulates the time-varying properties of a dynamic feature--it
 * must be extended to represent a timestamped projection of a feature. The
 * dataSource property describes how the temporal data was acquired.
 * <p/>
 * Java class for AbstractTimeSliceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}validTime"/>
 *         &lt;element ref="{http://www.opengis.net/gml}dataSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeSliceType", propOrder = {
  "validTime",
  "dataSource"
})
@XmlSeeAlso({
  MovingObjectStatusType.class
})
public abstract class AbstractTimeSliceType
  extends AbstractGMLType {

  @XmlElement(required = true)
  protected TimePrimitivePropertyType validTime;
  protected StringOrRefType dataSource;

  /**
   * Gets the value of the validTime property.
   * <p/>
   * @return possible object is {@link TimePrimitivePropertyType }
   *
   */
  public TimePrimitivePropertyType getValidTime() {
    return validTime;
  }

  /**
   * Sets the value of the validTime property.
   * <p/>
   * @param value allowed object is {@link TimePrimitivePropertyType }
   *
   */
  public void setValidTime(TimePrimitivePropertyType value) {
    this.validTime = value;
  }

  public boolean isSetValidTime() {
    return (this.validTime != null);
  }

  /**
   * Gets the value of the dataSource property.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getDataSource() {
    return dataSource;
  }

  /**
   * Sets the value of the dataSource property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setDataSource(StringOrRefType value) {
    this.dataSource = value;
  }

  public boolean isSetDataSource() {
    return (this.dataSource != null);
  }
}
