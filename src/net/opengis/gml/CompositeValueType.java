package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Aggregate value built from other Values using the Composite pattern. It
 * contains zero or an arbitrary number of valueComponent elements, and zero or
 * one valueComponents elements. It may be used for strongly coupled aggregates
 * (vectors, tensors) or for arbitrary collections of values.
 * <p/>
 * Java class for CompositeValueType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CompositeValueType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}valueComponent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}valueComponents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeValueType", propOrder = {
  "valueComponent",
  "valueComponents"
})
@XmlSeeAlso({
  ValueArrayType.class
})
public class CompositeValueType
  extends AbstractGMLType {

  protected List<ValuePropertyType> valueComponent;
  protected ValueArrayPropertyType valueComponents;

  /**
   * Gets the value of the valueComponent property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the valueComponent property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValueComponent().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link ValuePropertyType }
   *
   *
   */
  public List<ValuePropertyType> getValueComponent() {
    if (valueComponent == null) {
      valueComponent = new ArrayList<ValuePropertyType>();
    }
    return this.valueComponent;
  }

  public boolean isSetValueComponent() {
    return ((this.valueComponent != null) && (!this.valueComponent.isEmpty()));
  }

  public void unsetValueComponent() {
    this.valueComponent = null;
  }

  /**
   * Gets the value of the valueComponents property.
   * <p/>
   * @return possible object is {@link ValueArrayPropertyType }
   *
   */
  public ValueArrayPropertyType getValueComponents() {
    return valueComponents;
  }

  /**
   * Sets the value of the valueComponents property.
   * <p/>
   * @param value allowed object is {@link ValueArrayPropertyType }
   *
   */
  public void setValueComponents(ValueArrayPropertyType value) {
    this.valueComponents = value;
  }

  public boolean isSetValueComponents() {
    return (this.valueComponents != null);
  }
}
