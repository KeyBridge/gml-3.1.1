



package org.w3._2000._09.xmldsig;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for X509IssuerSerialType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="X509IssuerSerialType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509IssuerSerialType", propOrder = {
  "x509IssuerName",
  "x509SerialNumber"
})
public class X509IssuerSerialType {

  @XmlElement(name = "X509IssuerName", required = true)
  protected String x509IssuerName;
  @XmlElement(name = "X509SerialNumber", required = true)
  protected BigInteger x509SerialNumber;

  /**
   * Gets the value of the x509IssuerName property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getX509IssuerName() {
    return x509IssuerName;
  }

  /**
   * Sets the value of the x509IssuerName property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setX509IssuerName(String value) {
    this.x509IssuerName = value;
  }

  public boolean isSetX509IssuerName() {
    return (this.x509IssuerName != null);
  }

  /**
   * Gets the value of the x509SerialNumber property.
   * <p/>
   * @return possible object is {@link BigInteger }
   * <p/>
   */
  public BigInteger getX509SerialNumber() {
    return x509SerialNumber;
  }

  /**
   * Sets the value of the x509SerialNumber property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   * <p/>
   */
  public void setX509SerialNumber(BigInteger value) {
    this.x509SerialNumber = value;
  }

  public boolean isSetX509SerialNumber() {
    return (this.x509SerialNumber != null);
  }
}
