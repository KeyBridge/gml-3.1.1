package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;
import org.w3c.dom.Element;

/**
 * GML property which refers to, or contains, a Value
 * <p/>
 * <p>Java class for ValuePropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ValuePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;group ref="{http://www.opengis.net/gml}Value"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuePropertyType", propOrder = {
  "_boolean",
  "category",
  "quantity",
  "count",
  "booleanList",
  "categoryList",
  "quantityList",
  "countList",
  "categoryExtent",
  "quantityExtent",
  "countExtent",
  "compositeValue",
  "object",
  "_null"
})
@XmlSeeAlso({
  CountPropertyType.class,
  QuantityPropertyType.class,
  BooleanPropertyType.class,
  ScalarValuePropertyType.class,
  CategoryPropertyType.class
})
public class ValuePropertyType {

  @XmlElement(name = "Boolean")
  protected Boolean _boolean;
  @XmlElement(name = "Category")
  protected CodeType category;
  @XmlElement(name = "Quantity")
  protected MeasureType quantity;
  @XmlElement(name = "Count")
  protected BigInteger count;
  @XmlList
  @XmlElement(name = "BooleanList")
  protected List<String> booleanList;
  @XmlElement(name = "CategoryList")
  protected CodeOrNullListType categoryList;
  @XmlElement(name = "QuantityList")
  protected MeasureOrNullListType quantityList;
  @XmlList
  @XmlElement(name = "CountList")
  protected List<String> countList;
  @XmlElement(name = "CategoryExtent")
  protected CategoryExtentType categoryExtent;
  @XmlElement(name = "QuantityExtent")
  protected QuantityExtentType quantityExtent;
  @XmlList
  @XmlElement(name = "CountExtent")
  protected List<String> countExtent;
  @XmlElementRef(name = "CompositeValue", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends CompositeValueType> compositeValue;
  @XmlAnyElement
  protected Element object;
  @XmlList
  @XmlElement(name = "Null")
  protected List<String> _null;
  @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml")
  @XmlSchemaType(name = "anyURI")
  protected String remoteSchema;
  @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
  protected TypeType type;
  @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
  protected String href;
  @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
  protected String role;
  @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
  protected String arcrole;
  @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
  protected String title;
  @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
  protected ShowType show;
  @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
  protected ActuateType actuate;

  /**
   * Gets the value of the boolean property.
   * <p/>
   * @return possible object is {@link Boolean }
   *
   */
  public Boolean isBoolean() {
    return _boolean;
  }

  /**
   * Sets the value of the boolean property.
   * <p/>
   * @param value allowed object is {@link Boolean }
   *
   */
  public void setBoolean(Boolean value) {
    this._boolean = value;
  }

  public boolean isSetBoolean() {
    return (this._boolean != null);
  }

  /**
   * Gets the value of the category property.
   * <p/>
   * @return possible object is {@link CodeType }
   *
   */
  public CodeType getCategory() {
    return category;
  }

  /**
   * Sets the value of the category property.
   * <p/>
   * @param value allowed object is {@link CodeType }
   *
   */
  public void setCategory(CodeType value) {
    this.category = value;
  }

  public boolean isSetCategory() {
    return (this.category != null);
  }

  /**
   * Gets the value of the quantity property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the quantity property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setQuantity(MeasureType value) {
    this.quantity = value;
  }

  public boolean isSetQuantity() {
    return (this.quantity != null);
  }

  /**
   * Gets the value of the count property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getCount() {
    return count;
  }

  /**
   * Sets the value of the count property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setCount(BigInteger value) {
    this.count = value;
  }

  public boolean isSetCount() {
    return (this.count != null);
  }

  /**
   * Gets the value of the booleanList property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the booleanList property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getBooleanList().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link String }
   *
   *
   */
  public List<String> getBooleanList() {
    if (booleanList == null) {
      booleanList = new ArrayList<String>();
    }
    return this.booleanList;
  }

  public boolean isSetBooleanList() {
    return ((this.booleanList != null) && (!this.booleanList.isEmpty()));
  }

  public void unsetBooleanList() {
    this.booleanList = null;
  }

  /**
   * Gets the value of the categoryList property.
   * <p/>
   * @return possible object is {@link CodeOrNullListType }
   *
   */
  public CodeOrNullListType getCategoryList() {
    return categoryList;
  }

  /**
   * Sets the value of the categoryList property.
   * <p/>
   * @param value allowed object is {@link CodeOrNullListType }
   *
   */
  public void setCategoryList(CodeOrNullListType value) {
    this.categoryList = value;
  }

  public boolean isSetCategoryList() {
    return (this.categoryList != null);
  }

  /**
   * Gets the value of the quantityList property.
   * <p/>
   * @return possible object is {@link MeasureOrNullListType }
   *
   */
  public MeasureOrNullListType getQuantityList() {
    return quantityList;
  }

  /**
   * Sets the value of the quantityList property.
   * <p/>
   * @param value allowed object is {@link MeasureOrNullListType }
   *
   */
  public void setQuantityList(MeasureOrNullListType value) {
    this.quantityList = value;
  }

  public boolean isSetQuantityList() {
    return (this.quantityList != null);
  }

  /**
   * Gets the value of the countList property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the countList property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getCountList().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link String }
   *
   *
   */
  public List<String> getCountList() {
    if (countList == null) {
      countList = new ArrayList<String>();
    }
    return this.countList;
  }

  public boolean isSetCountList() {
    return ((this.countList != null) && (!this.countList.isEmpty()));
  }

  public void unsetCountList() {
    this.countList = null;
  }

  /**
   * Gets the value of the categoryExtent property.
   * <p/>
   * @return possible object is {@link CategoryExtentType }
   *
   */
  public CategoryExtentType getCategoryExtent() {
    return categoryExtent;
  }

  /**
   * Sets the value of the categoryExtent property.
   * <p/>
   * @param value allowed object is {@link CategoryExtentType }
   *
   */
  public void setCategoryExtent(CategoryExtentType value) {
    this.categoryExtent = value;
  }

  public boolean isSetCategoryExtent() {
    return (this.categoryExtent != null);
  }

  /**
   * Gets the value of the quantityExtent property.
   * <p/>
   * @return possible object is {@link QuantityExtentType }
   *
   */
  public QuantityExtentType getQuantityExtent() {
    return quantityExtent;
  }

  /**
   * Sets the value of the quantityExtent property.
   * <p/>
   * @param value allowed object is {@link QuantityExtentType }
   *
   */
  public void setQuantityExtent(QuantityExtentType value) {
    this.quantityExtent = value;
  }

  public boolean isSetQuantityExtent() {
    return (this.quantityExtent != null);
  }

  /**
   * Gets the value of the countExtent property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the countExtent property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getCountExtent().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link String }
   *
   *
   */
  public List<String> getCountExtent() {
    if (countExtent == null) {
      countExtent = new ArrayList<String>();
    }
    return this.countExtent;
  }

  public boolean isSetCountExtent() {
    return ((this.countExtent != null) && (!this.countExtent.isEmpty()));
  }

  public void unsetCountExtent() {
    this.countExtent = null;
  }

  /**
   * Gets the value of the compositeValue property.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends CompositeValueType> getCompositeValue() {
    return compositeValue;
  }

  /**
   * Sets the value of the compositeValue property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
   * <p/>
   */
  public void setCompositeValue(JAXBElement<? extends CompositeValueType> value) {
    this.compositeValue = value;
  }

  public boolean isSetCompositeValue() {
    return (this.compositeValue != null);
  }

  /**
   * Gets the value of the object property.
   * <p/>
   * @return possible object is {@link Element }
   *
   */
  public Element getObject() {
    return object;
  }

  /**
   * Sets the value of the object property.
   * <p/>
   * @param value allowed object is {@link Element }
   *
   */
  public void setObject(Element value) {
    this.object = value;
  }

  public boolean isSetObject() {
    return (this.object != null);
  }

  /**
   * Gets the value of the null property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the null property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getNull().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link String }
   *
   *
   */
  public List<String> getNull() {
    if (_null == null) {
      _null = new ArrayList<String>();
    }
    return this._null;
  }

  public boolean isSetNull() {
    return ((this._null != null) && (!this._null.isEmpty()));
  }

  public void unsetNull() {
    this._null = null;
  }

  /**
   * Gets the value of the remoteSchema property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getRemoteSchema() {
    return remoteSchema;
  }

  /**
   * Sets the value of the remoteSchema property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setRemoteSchema(String value) {
    this.remoteSchema = value;
  }

  public boolean isSetRemoteSchema() {
    return (this.remoteSchema != null);
  }

  /**
   * Gets the value of the type property.
   * <p/>
   * @return possible object is {@link TypeType }
   *
   */
  public TypeType getType() {
    if (type == null) {
      return TypeType.SIMPLE;
    } else {
      return type;
    }
  }

  /**
   * Sets the value of the type property.
   * <p/>
   * @param value allowed object is {@link TypeType }
   *
   */
  public void setType(TypeType value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the href property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getHref() {
    return href;
  }

  /**
   * Sets the value of the href property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setHref(String value) {
    this.href = value;
  }

  public boolean isSetHref() {
    return (this.href != null);
  }

  /**
   * Gets the value of the role property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getRole() {
    return role;
  }

  /**
   * Sets the value of the role property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setRole(String value) {
    this.role = value;
  }

  public boolean isSetRole() {
    return (this.role != null);
  }

  /**
   * Gets the value of the arcrole property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getArcrole() {
    return arcrole;
  }

  /**
   * Sets the value of the arcrole property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setArcrole(String value) {
    this.arcrole = value;
  }

  public boolean isSetArcrole() {
    return (this.arcrole != null);
  }

  /**
   * Gets the value of the title property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTitle(String value) {
    this.title = value;
  }

  public boolean isSetTitle() {
    return (this.title != null);
  }

  /**
   * Gets the value of the show property.
   * <p/>
   * @return possible object is {@link ShowType }
   *
   */
  public ShowType getShow() {
    return show;
  }

  /**
   * Sets the value of the show property.
   * <p/>
   * @param value allowed object is {@link ShowType }
   *
   */
  public void setShow(ShowType value) {
    this.show = value;
  }

  public boolean isSetShow() {
    return (this.show != null);
  }

  /**
   * Gets the value of the actuate property.
   * <p/>
   * @return possible object is {@link ActuateType }
   *
   */
  public ActuateType getActuate() {
    return actuate;
  }

  /**
   * Sets the value of the actuate property.
   * <p/>
   * @param value allowed object is {@link ActuateType }
   *
   */
  public void setActuate(ActuateType value) {
    this.actuate = value;
  }

  public boolean isSetActuate() {
    return (this.actuate != null);
  }
}
