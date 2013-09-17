package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * [complexType of] The style descriptor for geometries of a feature.
 * <p/>
 * Java class for GeometryStyleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GeometryStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}symbol"/>
 *           &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="geometryProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geometryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryStyleType", propOrder = {
  "symbol",
  "style",
  "labelStyle"
})
public class GeometryStyleType
  extends BaseStyleDescriptorType {

  protected SymbolType symbol;
  protected String style;
  protected LabelStylePropertyType labelStyle;
  @XmlAttribute(name = "geometryProperty")
  protected String geometryProperty;
  @XmlAttribute(name = "geometryType")
  protected String geometryType;

  /**
   * Gets the value of the symbol property.
   * <p/>
   * @return possible object is {@link SymbolType }
   *
   */
  public SymbolType getSymbol() {
    return symbol;
  }

  /**
   * Sets the value of the symbol property.
   * <p/>
   * @param value allowed object is {@link SymbolType }
   *
   */
  public void setSymbol(SymbolType value) {
    this.symbol = value;
  }

  public boolean isSetSymbol() {
    return (this.symbol != null);
  }

  /**
   * Gets the value of the style property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getStyle() {
    return style;
  }

  /**
   * Sets the value of the style property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setStyle(String value) {
    this.style = value;
  }

  public boolean isSetStyle() {
    return (this.style != null);
  }

  /**
   * Gets the value of the labelStyle property.
   * <p/>
   * @return possible object is {@link LabelStylePropertyType }
   *
   */
  public LabelStylePropertyType getLabelStyle() {
    return labelStyle;
  }

  /**
   * Sets the value of the labelStyle property.
   * <p/>
   * @param value allowed object is {@link LabelStylePropertyType }
   *
   */
  public void setLabelStyle(LabelStylePropertyType value) {
    this.labelStyle = value;
  }

  public boolean isSetLabelStyle() {
    return (this.labelStyle != null);
  }

  /**
   * Gets the value of the geometryProperty property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getGeometryProperty() {
    return geometryProperty;
  }

  /**
   * Sets the value of the geometryProperty property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setGeometryProperty(String value) {
    this.geometryProperty = value;
  }

  public boolean isSetGeometryProperty() {
    return (this.geometryProperty != null);
  }

  /**
   * Gets the value of the geometryType property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getGeometryType() {
    return geometryType;
  }

  /**
   * Sets the value of the geometryType property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setGeometryType(String value) {
    this.geometryType = value;
  }

  public boolean isSetGeometryType() {
    return (this.geometryType != null);
  }
}
