package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Deprecated in GML 3.1.0
 * <p/>
 * Java class for PriorityLocationPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="PriorityLocationPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}LocationPropertyType">
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityLocationPropertyType")
public class PriorityLocationPropertyType
  extends LocationPropertyType {

  @XmlAttribute(name = "priority")
  protected String priority;

  /**
   * Gets the value of the priority property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getPriority() {
    return priority;
  }

  /**
   * Sets the value of the priority property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setPriority(String value) {
    this.priority = value;
  }

  public boolean isSetPriority() {
    return (this.priority != null);
  }
}
