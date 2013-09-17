package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A coordinate reference system describing the position of points through two
 * or more independent coordinate reference systems.
 * <p/>
 * Java class for CompoundCRSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CompoundCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}includesCRS" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundCRSType", propOrder = {
  "includesCRS"
})
public class CompoundCRSType
  extends AbstractReferenceSystemType {

  @XmlElement(required = true)
  protected List<CoordinateReferenceSystemRefType> includesCRS;

  /**
   * Ordered sequence of associations to all the component coordinate reference
   * systems included in this compound coordinate reference system. Gets the
   * value of the includesCRS property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the includesCRS property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getIncludesCRS().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link CoordinateReferenceSystemRefType }
   *
   *
   */
  public List<CoordinateReferenceSystemRefType> getIncludesCRS() {
    if (includesCRS == null) {
      includesCRS = new ArrayList<CoordinateReferenceSystemRefType>();
    }
    return this.includesCRS;
  }

  public boolean isSetIncludesCRS() {
    return ((this.includesCRS != null) && (!this.includesCRS.isEmpty()));
  }

  public void unsetIncludesCRS() {
    this.includesCRS = null;
  }
}
