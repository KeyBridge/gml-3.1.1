package net.opengis.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * An identification of a CRS object. The first use of the IdentifierType for an
 * object, if any, is normally the primary identification code, and any others
 * are aliases.
 * <p/>
 * Java class for IdentifierType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}name"/>
 *         &lt;element ref="{http://www.opengis.net/gml}version" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}remarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
  "name",
  "version",
  "remarks"
})
public class IdentifierType {

  @XmlElementRef(name = "name", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
  protected JAXBElement<CodeType> name;
  protected String version;
  protected StringOrRefType remarks;

  /**
   * The code or name for this Identifier, often from a controlled list or
   * pattern defined by a code space. The optional codeSpace attribute is
   * normally included to identify or reference a code space within which one or
   * more codes are defined. This code space is often defined by some authority
   * organization, where one organization may define multiple code spaces. The
   * range and format of each Code Space identifier is defined by that code
   * space authority. Information about that code space authority can be
   * included as metaDataProperty elements which are optionally allowed in all
   * CRS objects.
   * <p/>
   * @return possible object is null   {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * <p/>
   */
  public JAXBElement<CodeType> getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p/>
   * @param value allowed object is null   {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
   * <p/>
   */
  public void setName(JAXBElement<CodeType> value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the version property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the value of the version property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setVersion(String value) {
    this.version = value;
  }

  public boolean isSetVersion() {
    return (this.version != null);
  }

  /**
   * Remarks about this code or alias.
   * <p/>
   * @return possible object is {@link StringOrRefType }
   *
   */
  public StringOrRefType getRemarks() {
    return remarks;
  }

  /**
   * Sets the value of the remarks property.
   * <p/>
   * @param value allowed object is {@link StringOrRefType }
   *
   */
  public void setRemarks(StringOrRefType value) {
    this.remarks = value;
  }

  public boolean isSetRemarks() {
    return (this.remarks != null);
  }
}
