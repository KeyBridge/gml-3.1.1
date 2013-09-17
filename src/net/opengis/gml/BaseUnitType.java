package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of a unit of measure which is a base unit from the system of
 * units. A base unit cannot be derived by combination of other base units
 * within this system. Sometimes known as "fundamental unit".
 * <p/>
 * Java class for BaseUnitType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="BaseUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}UnitDefinitionType">
 *       &lt;sequence>
 *         &lt;element name="unitsSystem" type="{http://www.opengis.net/gml}ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseUnitType", propOrder = {
  "unitsSystem"
})
public class BaseUnitType
  extends UnitDefinitionType {

  @XmlElement(required = true)
  protected ReferenceType unitsSystem;

  /**
   * Gets the value of the unitsSystem property.
   * <p/>
   * @return possible object is {@link ReferenceType }
   *
   */
  public ReferenceType getUnitsSystem() {
    return unitsSystem;
  }

  /**
   * Sets the value of the unitsSystem property.
   * <p/>
   * @param value allowed object is {@link ReferenceType }
   *
   */
  public void setUnitsSystem(ReferenceType value) {
    this.unitsSystem = value;
  }

  public boolean isSetUnitsSystem() {
    return (this.unitsSystem != null);
  }
}
