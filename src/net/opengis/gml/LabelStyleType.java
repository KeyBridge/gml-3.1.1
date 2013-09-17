package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * [complexType of] The style descriptor for labels of a feature, geometry or
 * topology.
 * <p/>
 * Java class for LabelStyleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="LabelStyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}BaseStyleDescriptorType">
 *       &lt;sequence>
 *         &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="label" type="{http://www.opengis.net/gml}LabelType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelStyleType", propOrder = {
  "style",
  "label"
})
public class LabelStyleType
  extends BaseStyleDescriptorType {

  @XmlElement(required = true)
  protected String style;
  @XmlElement(required = true)
  protected LabelType label;

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
   * Gets the value of the label property.
   * <p/>
   * @return possible object is {@link LabelType }
   *
   */
  public LabelType getLabel() {
    return label;
  }

  /**
   * Sets the value of the label property.
   * <p/>
   * @param value allowed object is {@link LabelType }
   *
   */
  public void setLabel(LabelType value) {
    this.label = value;
  }

  public boolean isSetLabel() {
    return (this.label != null);
  }
}
