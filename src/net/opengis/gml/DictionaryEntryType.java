package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * An entry in a dictionary of definitions. An instance of this type contains or
 * refers to a definition object.
 * <p/>
 * The number of definitions contained in this dictionaryEntry is restricted to
 * one, but a DefinitionCollection or Dictionary that contains multiple
 * definitions can be substituted if needed. Specialized descendents of this
 * dictionaryEntry might be restricted in an application schema to allow only
 * including specified types of definitions as valid entries in a dictionary.
 * <p/>
 * Java class for DictionaryEntryType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DictionaryEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml}Definition"/>
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
@XmlType(name = "DictionaryEntryType", propOrder = {
  "definition"
})
public class DictionaryEntryType {

  @XmlElementRef(name = "Definition", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected JAXBElement<? extends DefinitionType> definition;
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
   * This element in a dictionary entry contains the actual definition.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DefinitionProxyType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ImageDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OperationParameterType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EngineeringDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeCalendarEraType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractTimeReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeocentricCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OperationMethodType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CompoundCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link UnitDefinitionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OperationParameterGroupType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeCalendarType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TemporalDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeographicCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EngineeringCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SphericalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeOrdinalReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link VerticalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EllipsoidalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeClockType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DerivedCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ConventionalUnitType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeodeticDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralDerivedCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ProjectedCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link VerticalCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeCoordinateSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DerivedUnitType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TemporalCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ImageCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CartesianCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PrimeMeridianType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CoordinateSystemAxisType }{@code >}
   * <p/>
   */
  public JAXBElement<? extends DefinitionType> getDefinition() {
    return definition;
  }

  /**
   * Sets the value of the definition property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DefinitionProxyType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ImageDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OperationParameterType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EngineeringDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeCalendarEraType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractTimeReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeocentricCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OperationMethodType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CompoundCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link UnitDefinitionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link OperationParameterGroupType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeCalendarType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TemporalDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeographicCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EngineeringCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link SphericalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeOrdinalReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link VerticalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link EllipsoidalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeClockType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DerivedCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ConventionalUnitType }{@code >}
   *     {@link JAXBElement }{@code <}{@link GeodeticDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralDerivedCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ProjectedCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link VerticalCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TimeCoordinateSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
   *     {@link JAXBElement }{@code <}{@link DerivedUnitType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractReferenceSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
   *     {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TemporalCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
   *     {@link JAXBElement }{@code <}{@link ImageCRSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CartesianCSType }{@code >}
   *     {@link JAXBElement }{@code <}{@link PrimeMeridianType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CoordinateSystemAxisType }{@code >}
   * <p/>
   */
  public void setDefinition(JAXBElement<? extends DefinitionType> value) {
    this.definition = value;
  }

  public boolean isSetDefinition() {
    return (this.definition != null);
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
