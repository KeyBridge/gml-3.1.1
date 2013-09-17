package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * All complexContent GML elements are directly or indirectly derived from this
 * abstract supertype to establish a hierarchy of GML types that may be
 * distinguished from other XML types by their ancestry. Elements in this
 * hierarchy may have an ID and are thus referenceable.
 * <p/>
 * Java class for AbstractGMLType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractGMLType"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;group
 * ref="{http://www.opengis.net/gml}StandardObjectProperties"/> &lt;/sequence>
 * &lt;attribute ref="{http://www.opengis.net/gml}id"/> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGMLType", propOrder = {
  "metaDataProperty",
  "description",
  "name"
})
@XmlSeeAlso({
  FeatureStyleType.class,
  BagType.class,
  ArrayType.class,
  AbstractTimeSliceType.class,
  AbstractTimeObjectType.class,
  CompositeValueType.class,
  AbstractStyleType.class,
  AbstractGeometryType.class,
  AbstractTopologyType.class,
  BaseStyleDescriptorType.class,
  AbstractFeatureType.class,
  DefinitionType.class
})
public abstract class AbstractGMLType {

  protected List<MetaDataPropertyType> metaDataProperty;
  protected StringOrRefType description;
  @XmlElementRef(name = "name", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<CodeType>> name;
  @XmlAttribute(name = "id", namespace = "http://www.opengis.net/gml")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;

  /**
   * Gets the value of the metaDataProperty property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the metaDataProperty property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMetaDataProperty().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link MetaDataPropertyType }
   *
   *
   */
  public List<MetaDataPropertyType> getMetaDataProperty() {
    if (metaDataProperty == null) {
      metaDataProperty = new ArrayList<MetaDataPropertyType>();
    }
    return this.metaDataProperty;
  }

  public boolean isSetMetaDataProperty() {
    return ((this.metaDataProperty != null) && (!this.metaDataProperty.isEmpty()));
  }

  public void unsetMetaDataProperty() {
    this.metaDataProperty = null;
  }

  /**
   * Gets the value of the description property.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setDescription(StringOrRefType value) {
    this.description = value;
  }

  public boolean isSetDescription() {
    return (this.description != null);
  }

  /**
   * Multiple names may be provided. These will often be distinguished by being
   * assigned by different authorities, as indicated by the value of the
   * codeSpace attribute. In an instance document there will usually only be one
   * name per authority.Gets the value of the name property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the name property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getName().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null null   {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<CodeType>> getName() {
    if (name == null) {
      name = new ArrayList<JAXBElement<CodeType>>();
    }
    return this.name;
  }

  public boolean isSetName() {
    return ((this.name != null) && (!this.name.isEmpty()));
  }

  public void unsetName() {
    this.name = null;
  }

  /**
   * Gets the value of the id property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setId(String value) {
    this.id = value;
  }

  public boolean isSetId() {
    return (this.id != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 43 * hash + Objects.hashCode(this.metaDataProperty);
    hash = 43 * hash + Objects.hashCode(this.description);
    hash = 43 * hash + Objects.hashCode(this.name);
    hash = 43 * hash + Objects.hashCode(this.id);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final AbstractGMLType other = (AbstractGMLType) obj;
    if (!Objects.equals(this.metaDataProperty, other.metaDataProperty)) {
      return false;
    }
    if (!Objects.equals(this.description, other.description)) {
      return false;
    }
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.id, other.id)) {
      return false;
    }
    return true;
  }
}
