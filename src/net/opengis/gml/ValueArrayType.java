package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * A Value Array is used for homogeneous arrays of primitive and aggregate
 * values. The member values may be scalars, composites, arrays or lists.
 * ValueArray has the same content model as CompositeValue, but the member
 * values must be homogeneous. The element declaration contains a Schematron
 * constraint which expresses this restriction precisely. Since the members are
 * homogeneous, the referenceSystem (uom, codeSpace) may be specified on the
 * ValueArray itself and implicitly inherited by all the members if desired.
 * Note that a_ScalarValueList is preferred for arrays of Scalar Values since
 * this is a more efficient encoding.
 * <p/>
 * <p>Java class for ValueArrayType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ValueArrayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}CompositeValueType">
 *       &lt;attGroup ref="{http://www.opengis.net/gml}referenceSystem"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueArrayType")
public class ValueArrayType
  extends CompositeValueType {

  @XmlAttribute(name = "codeSpace")
  @XmlSchemaType(name = "anyURI")
  protected String codeSpace;
  @XmlAttribute(name = "uom")
  @XmlSchemaType(name = "anyURI")
  protected String uom;

  /**
   * Gets the value of the codeSpace property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getCodeSpace() {
    return codeSpace;
  }

  /**
   * Sets the value of the codeSpace property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setCodeSpace(String value) {
    this.codeSpace = value;
  }

  public boolean isSetCodeSpace() {
    return (this.codeSpace != null);
  }

  /**
   * Gets the value of the uom property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getUom() {
    return uom;
  }

  /**
   * Sets the value of the uom property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setUom(String value) {
    this.uom = value;
  }

  public boolean isSetUom() {
    return (this.uom != null);
  }
}
