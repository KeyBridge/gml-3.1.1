package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A temporal topology complex.
 * <p/>
 * <p>Java class for TimeTopologyComplexType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeTopologyComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeComplexType">
 *       &lt;sequence>
 *         &lt;element name="primitive" type="{http://www.opengis.net/gml}TimeTopologyPrimitivePropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTopologyComplexType", propOrder = {
  "primitive"
})
public class TimeTopologyComplexType
  extends AbstractTimeComplexType {

  @XmlElement(required = true)
  protected List<TimeTopologyPrimitivePropertyType> primitive;

  /**
   * Gets the value of the primitive property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the primitive property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getPrimitive().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TimeTopologyPrimitivePropertyType }
   *
   *
   */
  public List<TimeTopologyPrimitivePropertyType> getPrimitive() {
    if (primitive == null) {
      primitive = new ArrayList<TimeTopologyPrimitivePropertyType>();
    }
    return this.primitive;
  }

  public boolean isSetPrimitive() {
    return ((this.primitive != null) && (!this.primitive.isEmpty()));
  }

  public void unsetPrimitive() {
    this.primitive = null;
  }
}
