package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Ordinal temporal reference systems are often hierarchically structured such
 * that an ordinal era at a given level of the hierarchy includes a sequence of
 * shorter, coterminous ordinal eras. This captured using the member/group
 * properties.
 * <p/>
 * Note that in this schema, TIme Ordinal Era is patterned on TimeEdge, which is
 * a variation from ISO 19108. This is in order to fulfill the requirements of
 * ordinal reference systems based on eras delimited by named points or nodes,
 * which are common in geology, archeology, etc.
 * <p/>
 * This change is subject of a change proposal to ISO
 * <p/>
 * <p>Java class for TimeOrdinalEraType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimeOrdinalEraType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence>
 *         &lt;element name="relatedTime" type="{http://www.opengis.net/gml}RelatedTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.opengis.net/gml}TimeNodePropertyType"/>
 *         &lt;element name="end" type="{http://www.opengis.net/gml}TimeNodePropertyType"/>
 *         &lt;element name="extent" type="{http://www.opengis.net/gml}TimePeriodPropertyType" minOccurs="0"/>
 *         &lt;element name="member" type="{http://www.opengis.net/gml}TimeOrdinalEraPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.opengis.net/gml}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOrdinalEraType", propOrder = {
  "relatedTime",
  "start",
  "end",
  "extent",
  "member",
  "group"
})
public class TimeOrdinalEraType
  extends DefinitionType {

  protected List<RelatedTimeType> relatedTime;
  @XmlElement(required = true)
  protected TimeNodePropertyType start;
  @XmlElement(required = true)
  protected TimeNodePropertyType end;
  protected TimePeriodPropertyType extent;
  protected List<TimeOrdinalEraPropertyType> member;
  protected ReferenceType group;

  /**
   * Gets the value of the relatedTime property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the relatedTime property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getRelatedTime().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link RelatedTimeType }
   *
   *
   */
  public List<RelatedTimeType> getRelatedTime() {
    if (relatedTime == null) {
      relatedTime = new ArrayList<RelatedTimeType>();
    }
    return this.relatedTime;
  }

  public boolean isSetRelatedTime() {
    return ((this.relatedTime != null) && (!this.relatedTime.isEmpty()));
  }

  public void unsetRelatedTime() {
    this.relatedTime = null;
  }

  /**
   * Gets the value of the start property.
   * <p/>
   * @return possible object is {@link TimeNodePropertyType }
   *
   */
  public TimeNodePropertyType getStart() {
    return start;
  }

  /**
   * Sets the value of the start property.
   * <p/>
   * @param value allowed object is {@link TimeNodePropertyType }
   *
   */
  public void setStart(TimeNodePropertyType value) {
    this.start = value;
  }

  public boolean isSetStart() {
    return (this.start != null);
  }

  /**
   * Gets the value of the end property.
   * <p/>
   * @return possible object is {@link TimeNodePropertyType }
   *
   */
  public TimeNodePropertyType getEnd() {
    return end;
  }

  /**
   * Sets the value of the end property.
   * <p/>
   * @param value allowed object is {@link TimeNodePropertyType }
   *
   */
  public void setEnd(TimeNodePropertyType value) {
    this.end = value;
  }

  public boolean isSetEnd() {
    return (this.end != null);
  }

  /**
   * Gets the value of the extent property.
   * <p/>
   * @return possible object is {@link TimePeriodPropertyType }
   *
   */
  public TimePeriodPropertyType getExtent() {
    return extent;
  }

  /**
   * Sets the value of the extent property.
   * <p/>
   * @param value allowed object is {@link TimePeriodPropertyType }
   *
   */
  public void setExtent(TimePeriodPropertyType value) {
    this.extent = value;
  }

  public boolean isSetExtent() {
    return (this.extent != null);
  }

  /**
   * Gets the value of the member property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the member property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getMember().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TimeOrdinalEraPropertyType }
   *
   *
   */
  public List<TimeOrdinalEraPropertyType> getMember() {
    if (member == null) {
      member = new ArrayList<TimeOrdinalEraPropertyType>();
    }
    return this.member;
  }

  public boolean isSetMember() {
    return ((this.member != null) && (!this.member.isEmpty()));
  }

  public void unsetMember() {
    this.member = null;
  }

  /**
   * Gets the value of the group property.
   * <p/>
   * @return possible object is {@link ReferenceType }
   *
   */
  public ReferenceType getGroup() {
    return group;
  }

  /**
   * Sets the value of the group property.
   * <p/>
   * @param value allowed object is {@link ReferenceType }
   *
   */
  public void setGroup(ReferenceType value) {
    this.group = value;
  }

  public boolean isSetGroup() {
    return (this.group != null);
  }
}
