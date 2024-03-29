package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of a unit of measure which is related to a preferred unit for this
 * quantity type through a conversion formula. A method for deriving this unit
 * by algebraic combination of more primitive units, may also be provided.
 * <p/>
 * Java class for ConventionalUnitType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ConventionalUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}UnitDefinitionType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}conversionToPreferredUnit"/>
 *           &lt;element ref="{http://www.opengis.net/gml}roughConversionToPreferredUnit"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml}derivationUnitTerm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConventionalUnitType", propOrder = {
  "conversionToPreferredUnit",
  "roughConversionToPreferredUnit",
  "derivationUnitTerm"
})
public class ConventionalUnitType
  extends UnitDefinitionType {

  protected ConversionToPreferredUnitType conversionToPreferredUnit;
  protected ConversionToPreferredUnitType roughConversionToPreferredUnit;
  protected List<DerivationUnitTermType> derivationUnitTerm;

  /**
   * Gets the value of the conversionToPreferredUnit property.
   * <p/>
   * @return possible object is {@link ConversionToPreferredUnitType }
   *
   */
  public ConversionToPreferredUnitType getConversionToPreferredUnit() {
    return conversionToPreferredUnit;
  }

  /**
   * Sets the value of the conversionToPreferredUnit property.
   * <p/>
   * @param value allowed object is {@link ConversionToPreferredUnitType }
   *
   */
  public void setConversionToPreferredUnit(ConversionToPreferredUnitType value) {
    this.conversionToPreferredUnit = value;
  }

  public boolean isSetConversionToPreferredUnit() {
    return (this.conversionToPreferredUnit != null);
  }

  /**
   * Gets the value of the roughConversionToPreferredUnit property.
   * <p/>
   * @return possible object is {@link ConversionToPreferredUnitType }
   *
   */
  public ConversionToPreferredUnitType getRoughConversionToPreferredUnit() {
    return roughConversionToPreferredUnit;
  }

  /**
   * Sets the value of the roughConversionToPreferredUnit property.
   * <p/>
   * @param value allowed object is {@link ConversionToPreferredUnitType }
   *
   */
  public void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType value) {
    this.roughConversionToPreferredUnit = value;
  }

  public boolean isSetRoughConversionToPreferredUnit() {
    return (this.roughConversionToPreferredUnit != null);
  }

  /**
   * Gets the value of the derivationUnitTerm property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the derivationUnitTerm property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDerivationUnitTerm().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link DerivationUnitTermType }
   *
   *
   */
  public List<DerivationUnitTermType> getDerivationUnitTerm() {
    if (derivationUnitTerm == null) {
      derivationUnitTerm = new ArrayList<DerivationUnitTermType>();
    }
    return this.derivationUnitTerm;
  }

  public boolean isSetDerivationUnitTerm() {
    return ((this.derivationUnitTerm != null) && (!this.derivationUnitTerm.isEmpty()));
  }

  public void unsetDerivationUnitTerm() {
    this.derivationUnitTerm = null;
  }
}
