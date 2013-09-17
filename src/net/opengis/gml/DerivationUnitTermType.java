package net.opengis.gml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Definition of one unit term for a derived unit of measure. This unit term
 * references another unit of measure (uom) and provides an integer exponent
 * applied to that unit in defining the compound unit. The exponent can be
 * positive or negative, but not zero.
 * <p/>
 * Java class for DerivationUnitTermType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DerivationUnitTermType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}UnitOfMeasureType">
 *       &lt;attribute name="exponent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivationUnitTermType")
public class DerivationUnitTermType
  extends UnitOfMeasureType {

  @XmlAttribute(name = "exponent")
  protected BigInteger exponent;

  /**
   * Gets the value of the exponent property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getExponent() {
    return exponent;
  }

  /**
   * Sets the value of the exponent property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setExponent(BigInteger value) {
    this.exponent = value;
  }

  public boolean isSetExponent() {
    return (this.exponent != null);
  }
}
