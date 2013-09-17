package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * [complexType of] The style descriptor for topologies of a feature. Describes
 * individual topology elements styles.
 * <p/>
 * <p>Java class for TopologyStyleType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopologyStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}symbol"/>
 *           &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}labelStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="topologyProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="topologyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologyStyleType", propOrder = {
  "symbol",
  "style",
  "labelStyle"
})
public class TopologyStyleType
  extends BaseStyleDescriptorType {

  protected SymbolType symbol;
  protected String style;
  protected LabelStylePropertyType labelStyle;
  @XmlAttribute(name = "topologyProperty")
  protected String topologyProperty;
  @XmlAttribute(name = "topologyType")
  protected String topologyType;

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
   * Gets the value of the topologyProperty property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTopologyProperty() {
    return topologyProperty;
  }

  /**
   * Sets the value of the topologyProperty property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTopologyProperty(String value) {
    this.topologyProperty = value;
  }

  public boolean isSetTopologyProperty() {
    return (this.topologyProperty != null);
  }

  /**
   * Gets the value of the topologyType property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTopologyType() {
    return topologyType;
  }

  /**
   * Sets the value of the topologyType property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTopologyType(String value) {
    this.topologyType = value;
  }

  public boolean isSetTopologyType() {
    return (this.topologyType != null);
  }
}
