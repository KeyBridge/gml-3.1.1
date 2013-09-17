package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * The history relationship associates a feature with a sequence of TimeSlice
 * instances.
 * <p/>
 * Java class for HistoryPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="HistoryPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://www.opengis.net/gml}_TimeSlice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryPropertyType", propOrder = {
  "timeSlice"
})
@XmlSeeAlso({
  TrackType.class
})
public class HistoryPropertyType {

  @XmlElementRef(name = "_TimeSlice", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
  protected List<JAXBElement<? extends AbstractTimeSliceType>> timeSlice;

  /**
   * Gets the value of the timeSlice property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the timeSlice property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTimeSlice().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<? extends AbstractTimeSliceType>> getTimeSlice() {
    if (timeSlice == null) {
      timeSlice = new ArrayList<JAXBElement<? extends AbstractTimeSliceType>>();
    }
    return this.timeSlice;
  }

  public boolean isSetTimeSlice() {
    return ((this.timeSlice != null) && (!this.timeSlice.isEmpty()));
  }

  public void unsetTimeSlice() {
    this.timeSlice = null;
  }
}
