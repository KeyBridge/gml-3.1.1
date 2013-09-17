package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * The element "complex" carries a reference to the complex containing this
 * primitive.
 * <p/>
 * Java class for AbstractTimeTopologyPrimitiveType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractTimeTopologyPrimitiveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimePrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="complex" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeTopologyPrimitiveType", propOrder = {
  "complex"
})
@XmlSeeAlso({
  TimeNodeType.class,
  TimeEdgeType.class
})
public abstract class AbstractTimeTopologyPrimitiveType
  extends AbstractTimePrimitiveType {

  protected ReferenceType complex;

  /**
   * Gets the value of the complex property.
   * <p/>
   * @return possible object is {@link ReferenceType }
   *
   */
  public ReferenceType getComplex() {
    return complex;
  }

  /**
   * Sets the value of the complex property.
   * <p/>
   * @param value allowed object is {@link ReferenceType }
   *
   */
  public void setComplex(ReferenceType value) {
    this.complex = value;
  }

  public boolean isSetComplex() {
    return (this.complex != null);
  }
}
