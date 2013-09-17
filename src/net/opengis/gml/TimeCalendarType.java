package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A calendar is a discrete temporal reference system that provides a basis for
 * defining temporal position to a resolution of one day. A single calendar may
 * reference more than one calendar era.
 * <p/>
 * <p>Java class for TimeCalendarType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeCalendarType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="referenceFrame" type="{http://www.opengis.net/gml}TimeCalendarEraPropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCalendarType", propOrder = {
  "referenceFrame"
})
public class TimeCalendarType
  extends AbstractTimeReferenceSystemType {

  @XmlElement(required = true)
  protected List<TimeCalendarEraPropertyType> referenceFrame;

  /**
   * Gets the value of the referenceFrame property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the referenceFrame property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getReferenceFrame().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TimeCalendarEraPropertyType }
   *
   *
   */
  public List<TimeCalendarEraPropertyType> getReferenceFrame() {
    if (referenceFrame == null) {
      referenceFrame = new ArrayList<TimeCalendarEraPropertyType>();
    }
    return this.referenceFrame;
  }

  public boolean isSetReferenceFrame() {
    return ((this.referenceFrame != null) && (!this.referenceFrame.isEmpty()));
  }

  public void unsetReferenceFrame() {
    this.referenceFrame = null;
  }
}
