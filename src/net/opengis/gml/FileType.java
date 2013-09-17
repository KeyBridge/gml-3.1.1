package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for FileType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="FileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}rangeParameters"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="fileStructure" type="{http://www.opengis.net/gml}FileValueModelType"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileType", propOrder = {
  "rangeParameters",
  "fileName",
  "fileStructure",
  "mimeType",
  "compression"
})
public class FileType {

  @XmlElement(required = true)
  protected RangeParametersType rangeParameters;
  @XmlElement(required = true)
  @XmlSchemaType(name = "anyURI")
  protected String fileName;
  @XmlElement(required = true)
  protected FileValueModelType fileStructure;
  @XmlSchemaType(name = "anyURI")
  protected String mimeType;
  @XmlSchemaType(name = "anyURI")
  protected String compression;

  /**
   * Gets the value of the rangeParameters property.
   * <p/>
   * @return possible object is {@link RangeParametersType }
   *
   */
  public RangeParametersType getRangeParameters() {
    return rangeParameters;
  }

  /**
   * Sets the value of the rangeParameters property.
   * <p/>
   * @param value allowed object is {@link RangeParametersType }
   *
   */
  public void setRangeParameters(RangeParametersType value) {
    this.rangeParameters = value;
  }

  public boolean isSetRangeParameters() {
    return (this.rangeParameters != null);
  }

  /**
   * Gets the value of the fileName property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * Sets the value of the fileName property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setFileName(String value) {
    this.fileName = value;
  }

  public boolean isSetFileName() {
    return (this.fileName != null);
  }

  /**
   * Gets the value of the fileStructure property.
   * <p/>
   * @return possible object is {@link FileValueModelType }
   *
   */
  public FileValueModelType getFileStructure() {
    return fileStructure;
  }

  /**
   * Sets the value of the fileStructure property.
   * <p/>
   * @param value allowed object is {@link FileValueModelType }
   *
   */
  public void setFileStructure(FileValueModelType value) {
    this.fileStructure = value;
  }

  public boolean isSetFileStructure() {
    return (this.fileStructure != null);
  }

  /**
   * Gets the value of the mimeType property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * Sets the value of the mimeType property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setMimeType(String value) {
    this.mimeType = value;
  }

  public boolean isSetMimeType() {
    return (this.mimeType != null);
  }

  /**
   * Gets the value of the compression property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getCompression() {
    return compression;
  }

  /**
   * Sets the value of the compression property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setCompression(String value) {
    this.compression = value;
  }

  public boolean isSetCompression() {
    return (this.compression != null);
  }
}
