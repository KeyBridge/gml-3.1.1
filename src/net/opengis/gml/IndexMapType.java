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
 * Exends GridFunctionType with a lookUpTable. This contains a list of indexes
 * of members within the rangeSet corresponding with the members of the
 * domainSet. The domainSet is traversed in list order if it is enumerated
 * explicitly, or in the order specified by a SequenceRule if the domain is an
 * implicit set. The length of the lookUpTable corresponds with the length of
 * the subset of the domainSet for which the coverage is defined.
 * <p/>
 * Java class for IndexMapType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="IndexMapType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}GridFunctionType">
 *       &lt;sequence>
 *         &lt;element name="lookUpTable" type="{http://www.opengis.net/gml}integerList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexMapType", propOrder = {
  "lookUpTable"
})
public class IndexMapType
  extends GridFunctionType {

  @XmlList
  @XmlElement(required = true)
  protected List<BigInteger> lookUpTable;

  /**
   * Gets the value of the lookUpTable property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the lookUpTable property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLookUpTable().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
   *
   *
   */
  public List<BigInteger> getLookUpTable() {
    if (lookUpTable == null) {
      lookUpTable = new ArrayList<BigInteger>();
    }
    return this.lookUpTable;
  }

  public boolean isSetLookUpTable() {
    return ((this.lookUpTable != null) && (!this.lookUpTable.isEmpty()));
  }

  public void unsetLookUpTable() {
    this.lookUpTable = null;
  }
}
