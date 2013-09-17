package net.opengis.gml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * An element of a covariance matrix.
 * <p/>
 * Java class for CovarianceElementType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CovarianceElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}rowIndex"/>
 *         &lt;element ref="{http://www.opengis.net/gml}columnIndex"/>
 *         &lt;element ref="{http://www.opengis.net/gml}covariance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CovarianceElementType", propOrder = {
  "rowIndex",
  "columnIndex",
  "covariance"
})
public class CovarianceElementType {

  @XmlElement(required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger rowIndex;
  @XmlElement(required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger columnIndex;
  protected double covariance;

  /**
   * Gets the value of the rowIndex property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getRowIndex() {
    return rowIndex;
  }

  /**
   * Sets the value of the rowIndex property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setRowIndex(BigInteger value) {
    this.rowIndex = value;
  }

  public boolean isSetRowIndex() {
    return (this.rowIndex != null);
  }

  /**
   * Gets the value of the columnIndex property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getColumnIndex() {
    return columnIndex;
  }

  /**
   * Sets the value of the columnIndex property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setColumnIndex(BigInteger value) {
    this.columnIndex = value;
  }

  public boolean isSetColumnIndex() {
    return (this.columnIndex != null);
  }

  /**
   * Gets the value of the covariance property.
   * <p/>
   */
  public double getCovariance() {
    return covariance;
  }

  /**
   * Sets the value of the covariance property.
   * <p/>
   */
  public void setCovariance(double value) {
    this.covariance = value;
  }

  public boolean isSetCovariance() {
    return true;
  }
}
