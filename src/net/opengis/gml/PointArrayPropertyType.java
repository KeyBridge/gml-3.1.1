package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A container for an array of points. The elements are always contained in the
 * array property, referencing geometry elements or arrays of geometry elements
 * is not supported.
 * <p/>
 * Java class for PointArrayPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="PointArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}Point" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointArrayPropertyType", propOrder = {
  "point"
})
public class PointArrayPropertyType {

  @XmlElement(name = "Point")
  protected List<PointType> point;

  /**
   * Gets the value of the point property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the point property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPoint().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link PointType }
   *
   *
   */
  public List<PointType> getPoint() {
    if (point == null) {
      point = new ArrayList<PointType>();
    }
    return this.point;
  }

  public boolean isSetPoint() {
    return ((this.point != null) && (!this.point.isEmpty()));
  }

  public void unsetPoint() {
    this.point = null;
  }
}
