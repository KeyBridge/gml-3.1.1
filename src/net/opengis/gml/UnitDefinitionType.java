package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of a unit of measure (or uom). The definition includes a
 * quantityType property, which indicates the phenomenon to which the units
 * apply, and a catalogSymbol, which gives the short symbol used for this unit.
 * This element is used when the relationship of this unit to other units or
 * units systems is unknown.
 * <p/>
 * <p>Java class for UnitDefinitionType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="UnitDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}quantityType"/>
 *         &lt;element ref="{http://www.opengis.net/gml}catalogSymbol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDefinitionType", propOrder = {
  "quantityType",
  "catalogSymbol"
})
@XmlSeeAlso({
  DerivedUnitType.class,
  ConventionalUnitType.class,
  BaseUnitType.class
})
public class UnitDefinitionType
  extends DefinitionType {

  @XmlElement(required = true)
  protected StringOrRefType quantityType;
  protected CodeType catalogSymbol;

  /**
   * Gets the value of the quantityType property.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getQuantityType() {
    return quantityType;
  }

  /**
   * Sets the value of the quantityType property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setQuantityType(StringOrRefType value) {
    this.quantityType = value;
  }

  public boolean isSetQuantityType() {
    return (this.quantityType != null);
  }

  /**
   * Gets the value of the catalogSymbol property.
   * <p/>
   * @return possible object is {@link CodeType }
   *
   */
  public CodeType getCatalogSymbol() {
    return catalogSymbol;
  }

  /**
   * Sets the value of the catalogSymbol property.
   * <p/>
   * @param value allowed object is {@link CodeType }
   *
   */
  public void setCatalogSymbol(CodeType value) {
    this.catalogSymbol = value;
  }

  public boolean isSetCatalogSymbol() {
    return (this.catalogSymbol != null);
  }
}
