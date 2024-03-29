package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines how values in the domain are mapped to the range set. The start point
 * and the sequencing rule are specified here.
 * <p/>
 * Java class for GridFunctionType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GridFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceRule" type="{http://www.opengis.net/gml}SequenceRuleType" minOccurs="0"/>
 *         &lt;element name="startPoint" type="{http://www.opengis.net/gml}integerList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridFunctionType", propOrder = {
  "sequenceRule",
  "startPoint"
})
@XmlSeeAlso({
  IndexMapType.class
})
public class GridFunctionType {

  protected SequenceRuleType sequenceRule;
  @XmlList
  protected List<BigInteger> startPoint;

  /**
   * Gets the value of the sequenceRule property.
   * <p/>
   * @return possible object is {@link SequenceRuleType }
   *
   */
  public SequenceRuleType getSequenceRule() {
    return sequenceRule;
  }

  /**
   * Sets the value of the sequenceRule property.
   * <p/>
   * @param value allowed object is {@link SequenceRuleType }
   *
   */
  public void setSequenceRule(SequenceRuleType value) {
    this.sequenceRule = value;
  }

  public boolean isSetSequenceRule() {
    return (this.sequenceRule != null);
  }

  /**
   * Gets the value of the startPoint property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the startPoint property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getStartPoint().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   *
   *
   */
  public List<BigInteger> getStartPoint() {
    if (startPoint == null) {
      startPoint = new ArrayList<BigInteger>();
    }
    return this.startPoint;
  }

  public boolean isSetStartPoint() {
    return ((this.startPoint != null) && (!this.startPoint.isEmpty()));
  }

  public void unsetStartPoint() {
    this.startPoint = null;
  }
}
