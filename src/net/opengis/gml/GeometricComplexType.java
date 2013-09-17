package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A geometric complex.
 * <p/>
 * Java class for GeometricComplexType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GeometricComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element name="element" type="{http://www.opengis.net/gml}GeometricPrimitivePropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricComplexType", propOrder = {
  "element"
})
public class GeometricComplexType
  extends AbstractGeometryType {

  @XmlElement(required = true)
  protected List<GeometricPrimitivePropertyType> element;

  /**
   * Gets the value of the element property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the element property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getElement().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link GeometricPrimitivePropertyType }
   *
   *
   */
  public List<GeometricPrimitivePropertyType> getElement() {
    if (element == null) {
      element = new ArrayList<GeometricPrimitivePropertyType>();
    }
    return this.element;
  }

  public boolean isSetElement() {
    return ((this.element != null) && (!this.element.isEmpty()));
  }

  public void unsetElement() {
    this.element = null;
  }
}
