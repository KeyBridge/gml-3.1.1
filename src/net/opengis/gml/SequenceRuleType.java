package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Java class for SequenceRuleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="SequenceRuleType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml>SequenceRuleNames">
 *       &lt;attribute name="order" type="{http://www.opengis.net/gml}IncrementOrder" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRuleType", propOrder = {
  "value"
})
public class SequenceRuleType {

  @XmlValue
  protected SequenceRuleNames value;
  @XmlAttribute(name = "order")
  protected IncrementOrder order;

  /**
   * List of codes (adopted from ISO 19123 Annex C) that identifies the rule for
   * traversing a grid to correspond with the sequence of members of the
   * rangeSet.
   * <p/>
   * @return possible object is {@link SequenceRuleNames }
   *
   */
  public SequenceRuleNames getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   * @param value allowed object is {@link SequenceRuleNames }
   *
   */
  public void setValue(SequenceRuleNames value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return (this.value != null);
  }

  /**
   * Gets the value of the order property.
   * <p/>
   * @return possible object is {@link IncrementOrder }
   *
   */
  public IncrementOrder getOrder() {
    return order;
  }

  /**
   * Sets the value of the order property.
   * <p/>
   * @param value allowed object is {@link IncrementOrder }
   *
   */
  public void setOrder(IncrementOrder value) {
    this.order = value;
  }

  public boolean isSetOrder() {
    return (this.order != null);
  }
}
