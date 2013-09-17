package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * A pass-through operation specifies that a subset of a coordinate tuple is
 * subject to a specific coordinate operation.
 * <p/>
 * Java class for PassThroughOperationType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="PassThroughOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateOperationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}modifiedCoordinate" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}usesOperation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassThroughOperationType", propOrder = {
  "modifiedCoordinate",
  "usesOperation"
})
public class PassThroughOperationType
  extends AbstractCoordinateOperationType {

  @XmlElement(required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected List<BigInteger> modifiedCoordinate;
  @XmlElement(required = true)
  protected OperationRefType usesOperation;

  /**
   * Ordered sequence of positive integers defining the positions in a
   * coordinate tuple of the coordinates affected by this pass-through
   * operation. Gets the value of the modifiedCoordinate property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the modifiedCoordinate property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getModifiedCoordinate().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   *
   *
   */
  public List<BigInteger> getModifiedCoordinate() {
    if (modifiedCoordinate == null) {
      modifiedCoordinate = new ArrayList<BigInteger>();
    }
    return this.modifiedCoordinate;
  }

  public boolean isSetModifiedCoordinate() {
    return ((this.modifiedCoordinate != null) && (!this.modifiedCoordinate.isEmpty()));
  }

  public void unsetModifiedCoordinate() {
    this.modifiedCoordinate = null;
  }

  /**
   * Gets the value of the usesOperation property.
   * <p/>
   * @return possible object is {@link OperationRefType }
   *
   */
  public OperationRefType getUsesOperation() {
    return usesOperation;
  }

  /**
   * Sets the value of the usesOperation property.
   * <p/>
   * @param value allowed object is {@link OperationRefType }
   *
   */
  public void setUsesOperation(OperationRefType value) {
    this.usesOperation = value;
  }

  public boolean isSetUsesOperation() {
    return (this.usesOperation != null);
  }
}
