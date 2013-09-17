package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * In an ordinal reference system the order of events in time can be well
 * established, but the magnitude of the intervals between them can not be
 * accurately determined (e.g. a stratigraphic sequence).
 * <p/>
 * <p>Java class for TimeOrdinalReferenceSystemType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeOrdinalReferenceSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="component" type="{http://www.opengis.net/gml}TimeOrdinalEraPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOrdinalReferenceSystemType", propOrder = {
  "component"
})
public class TimeOrdinalReferenceSystemType
  extends AbstractTimeReferenceSystemType {

  @XmlElement(required = true)
  protected List<TimeOrdinalEraPropertyType> component;

  /**
   * Gets the value of the component property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the component property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getComponent().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TimeOrdinalEraPropertyType }
   *
   *
   */
  public List<TimeOrdinalEraPropertyType> getComponent() {
    if (component == null) {
      component = new ArrayList<TimeOrdinalEraPropertyType>();
    }
    return this.component;
  }

  public boolean isSetComponent() {
    return ((this.component != null) && (!this.component.isEmpty()));
  }

  public void unsetComponent() {
    this.component = null;
  }
}
