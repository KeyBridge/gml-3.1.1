package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides grid coordinate values for the diametrically opposed corners of an
 * envelope that bounds a section of grid. The value of a single coordinate is
 * the number of offsets from the origin of the grid in the direction of a
 * specific axis.
 * <p/>
 * Java class for GridEnvelopeType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GridEnvelopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="low" type="{http://www.opengis.net/gml}integerList"/>
 *         &lt;element name="high" type="{http://www.opengis.net/gml}integerList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridEnvelopeType", propOrder = {
  "low",
  "high"
})
public class GridEnvelopeType {

  @XmlList
  @XmlElement(required = true)
  protected List<BigInteger> low;
  @XmlList
  @XmlElement(required = true)
  protected List<BigInteger> high;

  /**
   * Gets the value of the low property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the low property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLow().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   *
   *
   */
  public List<BigInteger> getLow() {
    if (low == null) {
      low = new ArrayList<BigInteger>();
    }
    return this.low;
  }

  public boolean isSetLow() {
    return ((this.low != null) && (!this.low.isEmpty()));
  }

  public void unsetLow() {
    this.low = null;
  }

  /**
   * Gets the value of the high property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the high property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHigh().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   *
   *
   */
  public List<BigInteger> getHigh() {
    if (high == null) {
      high = new ArrayList<BigInteger>();
    }
    return this.high;
  }

  public boolean isSetHigh() {
    return ((this.high != null) && (!this.high.isEmpty()));
  }

  public void unsetHigh() {
    this.high = null;
  }
}
