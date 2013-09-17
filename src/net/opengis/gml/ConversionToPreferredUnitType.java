package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Relation of a unit to the preferred unit for this quantity type, specified by
 * an arithmetic conversion (scaling and/or offset). A preferred unit is either
 * a base unit or a derived unit selected for all units of one quantity type.
 * The mandatory attribute "uom" shall reference the preferred unit that this
 * conversion applies to. The conversion is specified by one of two alternative
 * elements: "factor" or "formula".
 * <p/>
 * Java class for ConversionToPreferredUnitType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ConversionToPreferredUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}UnitOfMeasureType">
 *       &lt;choice>
 *         &lt;element name="factor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="formula" type="{http://www.opengis.net/gml}FormulaType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionToPreferredUnitType", propOrder = {
  "factor",
  "formula"
})
public class ConversionToPreferredUnitType
  extends UnitOfMeasureType {

  protected Double factor;
  protected FormulaType formula;

  /**
   * Gets the value of the factor property.
   * <p/>
   * @return possible object is {@link Double }
   *
   */
  public Double getFactor() {
    return factor;
  }

  /**
   * Sets the value of the factor property.
   * <p/>
   * @param value allowed object is {@link Double }
   *
   */
  public void setFactor(Double value) {
    this.factor = value;
  }

  public boolean isSetFactor() {
    return (this.factor != null);
  }

  /**
   * Gets the value of the formula property.
   * <p/>
   * @return possible object is {@link FormulaType }
   *
   */
  public FormulaType getFormula() {
    return formula;
  }

  /**
   * Sets the value of the formula property.
   * <p/>
   * @param value allowed object is {@link FormulaType }
   *
   */
  public void setFormula(FormulaType value) {
    this.formula = value;
  }

  public boolean isSetFormula() {
    return (this.formula != null);
  }
}
