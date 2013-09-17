package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * GML property which refers to, or contains, a set of homogeneously typed
 * Values.
 * <p/>
 * <p>Java class for ValueArrayPropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ValueArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml}Value" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueArrayPropertyType", propOrder = {
  "value"
})
public class ValueArrayPropertyType {

  @XmlElementRefs({
    @XmlElementRef(name = "QuantityExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "CategoryExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "QuantityList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "Count", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "Boolean", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "Null", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "CountList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "CategoryList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "Category", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "BooleanList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "Quantity", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "CompositeValue", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "CountExtent", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  })
  @XmlAnyElement
  protected List<Object> value;

  /**
   * Gets the value of the value property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the value property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getValue().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNullListType }{@code >}
   * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
   * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
   * {@link JAXBElement }{@code <}{@link CodeOrNullListType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
   * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
   * {@link Element }
   * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
   * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
   * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
   * {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
   * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
   * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
   * <p/>
   *
   */
  public List<Object> getValue() {
    if (value == null) {
      value = new ArrayList<Object>();
    }
    return this.value;
  }

  public boolean isSetValue() {
    return ((this.value != null) && (!this.value.isEmpty()));
  }

  public void unsetValue() {
    this.value = null;
  }
}
