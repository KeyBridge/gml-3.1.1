package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference to a unit of measure definition that applies to all the numerical
 * values described by the element containing this element. Notice that a
 * complexType which needs to include the uom attribute can do so by extending
 * this complexType. Alternately, this complexType can be used as a pattern for
 * a new complexType.
 * <p/>
 * <p>Java class for UnitOfMeasureType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="UnitOfMeasureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="uom" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitOfMeasureType")
@XmlSeeAlso({
  ConversionToPreferredUnitType.class,
  DerivationUnitTermType.class
})
public class UnitOfMeasureType {

  @XmlAttribute(name = "uom", required = true)
  @XmlSchemaType(name = "anyURI")
  protected String uom;

  /**
   * Gets the value of the uom property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getUom() {
    return uom;
  }

  /**
   * Sets the value of the uom property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setUom(String value) {
    this.uom = value;
  }

  public boolean isSetUom() {
    return (this.uom != null);
  }
}
