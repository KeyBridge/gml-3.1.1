package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Used to vary individual graphic parameters and attributes of the style,
 * symbol or text.
 * <p/>
 * Java class for StyleVariationType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="StyleVariationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="styleProperty" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="featurePropertyRange" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleVariationType", propOrder = {
  "value"
})
public class StyleVariationType {

  @XmlValue
  protected String value;
  @XmlAttribute(name = "styleProperty", required = true)
  protected String styleProperty;
  @XmlAttribute(name = "featurePropertyRange")
  protected String featurePropertyRange;

  /**
   * Gets the value of the value property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setValue(String value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Gets the value of the styleProperty property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getStyleProperty() {
    return styleProperty;
  }

  /**
   * Sets the value of the styleProperty property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setStyleProperty(String value) {
    this.styleProperty = value;
  }

  public boolean isSetStyleProperty() {
    return (this.styleProperty != null);
  }

  /**
   * Gets the value of the featurePropertyRange property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getFeaturePropertyRange() {
    return featurePropertyRange;
  }

  /**
   * Sets the value of the featurePropertyRange property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setFeaturePropertyRange(String value) {
    this.featurePropertyRange = value;
  }

  public boolean isSetFeaturePropertyRange() {
    return (this.featurePropertyRange != null);
  }
}
