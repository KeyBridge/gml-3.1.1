package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * An unrectified grid, which is a network composed of two or more sets of
 * equally spaced parallel lines in which the members of each set intersect the
 * members of the other sets at right angles.
 * <p/>
 * Java class for GridType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GridType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element name="limits" type="{http://www.opengis.net/gml}GridLimitsType"/>
 *         &lt;element name="axisName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dimension" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridType", propOrder = {
  "limits",
  "axisName"
})
@XmlSeeAlso({
  RectifiedGridType.class
})
public class GridType
  extends AbstractGeometryType {

  @XmlElement(required = true)
  protected GridLimitsType limits;
  @XmlElement(required = true)
  protected List<String> axisName;
  @XmlAttribute(name = "dimension", required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger dimension;

  /**
   * Gets the value of the limits property.
   * <p/>
   * @return possible object is {@link GridLimitsType }
   *
   */
  public GridLimitsType getLimits() {
    return limits;
  }

  /**
   * Sets the value of the limits property.
   * <p/>
   * @param value allowed object is {@link GridLimitsType }
   *
   */
  public void setLimits(GridLimitsType value) {
    this.limits = value;
  }

  public boolean isSetLimits() {
    return (this.limits != null);
  }

  /**
   * Gets the value of the axisName property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the axisName property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getAxisName().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link String }
   *
   *
   */
  public List<String> getAxisName() {
    if (axisName == null) {
      axisName = new ArrayList<String>();
    }
    return this.axisName;
  }

  public boolean isSetAxisName() {
    return ((this.axisName != null) && (!this.axisName.isEmpty()));
  }

  public void unsetAxisName() {
    this.axisName = null;
  }

  /**
   * Gets the value of the dimension property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getDimension() {
    return dimension;
  }

  /**
   * Sets the value of the dimension property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setDimension(BigInteger value) {
    this.dimension = value;
  }

  public boolean isSetDimension() {
    return (this.dimension != null);
  }
}
