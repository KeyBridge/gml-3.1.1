



package org.w3._2000._09.xmldsig;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RSAKeyValueType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RSAKeyValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Modulus" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *         &lt;element name="Exponent" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSAKeyValueType", propOrder = {
  "modulus",
  "exponent"
})
public class RSAKeyValueType {

  @XmlElement(name = "Modulus", required = true)
  protected byte[] modulus;
  @XmlElement(name = "Exponent", required = true)
  protected byte[] exponent;

  /**
   * Gets the value of the modulus property.
   * <p/>
   * @return possible object is byte[]
   */
  public byte[] getModulus() {
    return modulus;
  }

  /**
   * Sets the value of the modulus property.
   * <p/>
   * @param value allowed object is byte[]
   */
  public void setModulus(byte[] value) {
    this.modulus = value;
  }

  public boolean isSetModulus() {
    return (this.modulus != null);
  }

  /**
   * Gets the value of the exponent property.
   * <p/>
   * @return possible object is byte[]
   */
  public byte[] getExponent() {
    return exponent;
  }

  /**
   * Sets the value of the exponent property.
   * <p/>
   * @param value allowed object is byte[]
   */
  public void setExponent(byte[] value) {
    this.exponent = value;
  }

  public boolean isSetExponent() {
    return (this.exponent != null);
  }
}
