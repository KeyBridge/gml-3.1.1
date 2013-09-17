package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * A dynamic feature collection may possess a history and/or a timestamp.
 * <p/>
 * Java class for DynamicFeatureCollectionType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DynamicFeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}FeatureCollectionType">
 *       &lt;group ref="{http://www.opengis.net/gml}dynamicProperties"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureCollectionType", propOrder = {
  "validTime",
  "history",
  "dataSource"
})
public class DynamicFeatureCollectionType
  extends FeatureCollectionType {

  protected TimePrimitivePropertyType validTime;
  @XmlElementRef(name = "history", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends HistoryPropertyType> history;
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
   * Gets the value of the history property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends HistoryPropertyType> getHistory() {
    return history;
  }

  /**
   * Sets the value of the history property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link TrackType }{@code >}
     *     {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}
   * <p/>
   */
  public void setHistory(JAXBElement<? extends HistoryPropertyType> value) {
    this.history = value;
  }

  public boolean isSetHistory() {
    return (this.history != null);
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
