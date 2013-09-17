package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * The function or rule which defines the map from members of the domainSet to
 * the range. More functions will be added to this list
 * <p/>
 * Java class for CoverageFunctionType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CoverageFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}MappingRule"/>
 *         &lt;element ref="{http://www.opengis.net/gml}GridFunction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageFunctionType", propOrder = {
  "mappingRule",
  "gridFunction"
})
public class CoverageFunctionType {

  @XmlElement(name = "MappingRule")
  protected StringOrRefType mappingRule;
  @XmlElementRef(name = "GridFunction", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends GridFunctionType> gridFunction;

  /**
   * Gets the value of the mappingRule property.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getMappingRule() {
    return mappingRule;
  }

  /**
   * Sets the value of the mappingRule property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setMappingRule(StringOrRefType value) {
    this.mappingRule = value;
  }

  public boolean isSetMappingRule() {
    return (this.mappingRule != null);
  }

  /**
   * Gets the value of the gridFunction property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndexMapType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends GridFunctionType> getGridFunction() {
    return gridFunction;
  }

  /**
   * Sets the value of the gridFunction property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndexMapType }{@code >}
   * <p/>
   */
  public void setGridFunction(JAXBElement<? extends GridFunctionType> value) {
    this.gridFunction = value;
  }

  public boolean isSetGridFunction() {
    return (this.gridFunction != null);
  }
}
