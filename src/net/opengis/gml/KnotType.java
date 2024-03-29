package net.opengis.gml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * A knot is a breakpoint on a piecewise spline curve.
 * <p/>
 * Java class for KnotType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="KnotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="multiplicity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnotType", propOrder = {
  "value",
  "multiplicity",
  "weight"
})
public class KnotType {

  protected double value;
  @XmlElement(required = true)
  @XmlSchemaType(name = "nonNegativeInteger")
  protected BigInteger multiplicity;
  protected double weight;

  /**
   * Gets the value of the value property.
   * <p/>
   */
  public double getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   */
  public void setValue(double value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return true;
  }

  /**
   * Gets the value of the multiplicity property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getMultiplicity() {
    return multiplicity;
  }

  /**
   * Sets the value of the multiplicity property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setMultiplicity(BigInteger value) {
    this.multiplicity = value;
  }

  public boolean isSetMultiplicity() {
    return (this.multiplicity != null);
  }

  /**
   * Gets the value of the weight property.
   * <p/>
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Sets the value of the weight property.
   * <p/>
   */
  public void setWeight(double value) {
    this.weight = value;
  }

  public boolean isSetWeight() {
    return true;
  }
}
