



package org.w3._2001.smil20.language;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3._2001.smil20.FillDefaultType;
import org.w3._2001.smil20.FillTimingAttrsType;
import org.w3._2001.smil20.RestartDefaultType;
import org.w3._2001.smil20.RestartTimingType;
import org.w3._2001.smil20.SetPrototype;
import org.w3._2001.smil20.SyncBehaviorDefaultType;
import org.w3._2001.smil20.SyncBehaviorType;
import org.w3c.dom.Element;

/**
 * <p>Java class for setType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="setType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/SMIL20/}setPrototype">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}skipContentAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}TimingAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}CoreAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}animTargetAttrs"/>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setType", propOrder = {
  "any"
})
public class SetType
  extends SetPrototype {

  @XmlAnyElement(lax = true)
  protected List<Object> any;
  @XmlAttribute(name = "skip-content")
  protected Boolean skipContent;
  @XmlAttribute(name = "syncBehavior")
  protected SyncBehaviorType syncBehavior;
  @XmlAttribute(name = "syncTolerance")
  protected String syncTolerance;
  @XmlAttribute(name = "repeat")
  @XmlSchemaType(name = "nonNegativeInteger")
  protected BigInteger repeat;
  @XmlAttribute(name = "repeatDur")
  protected String repeatDur;
  @XmlAttribute(name = "repeatCount")
  protected BigDecimal repeatCount;
  @XmlAttribute(name = "dur")
  protected String dur;
  @XmlAttribute(name = "begin")
  protected String begin;
  @XmlAttribute(name = "end")
  protected String end;
  @XmlAttribute(name = "min")
  protected String min;
  @XmlAttribute(name = "max")
  protected String max;
  @XmlAttribute(name = "restartDefault")
  protected RestartDefaultType restartDefault;
  @XmlAttribute(name = "fillDefault")
  protected FillDefaultType fillDefault;
  @XmlAttribute(name = "restart")
  protected RestartTimingType restart;
  @XmlAttribute(name = "syncBehaviorDefault")
  protected SyncBehaviorDefaultType syncBehaviorDefault;
  @XmlAttribute(name = "syncToleranceDefault")
  protected String syncToleranceDefault;
  @XmlAttribute(name = "fill")
  protected FillTimingAttrsType fill;
  @XmlAttribute(name = "id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected String id;
  @XmlAttribute(name = "class")
  protected String clazz;
  @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
  protected String lang;
  @XmlAttribute(name = "alt")
  protected String alt;
  @XmlAttribute(name = "longdesc")
  @XmlSchemaType(name = "anyURI")
  protected String longdesc;
  @XmlAttribute(name = "targetElement")
  @XmlIDREF
  @XmlSchemaType(name = "IDREF")
  protected Object targetElement;
  @XmlAnyAttribute
  private Map<QName, String> otherAttributes = new HashMap<QName, String>();

  /**
   * Gets the value of the any property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the any property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getAny().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p> Objects of the following type(s) are allowed in the list    {@link Element }
     * {@link Object }
   * <p/>
   * <p/>
   */
  public List<Object> getAny() {
    if (any == null) {
      any = new ArrayList<Object>();
    }
    return this.any;
  }

  public boolean isSetAny() {
    return ((this.any != null) && (!this.any.isEmpty()));
  }

  public void unsetAny() {
    this.any = null;
  }

  /**
   * Gets the value of the skipContent property.
   * <p/>
   * @return possible object is {@link Boolean }
   * <p/>
   */
  public boolean isSkipContent() {
    if (skipContent == null) {
      return true;
    } else {
      return skipContent;
    }
  }

  /**
   * Sets the value of the skipContent property.
   * <p/>
   * @param value allowed object is {@link Boolean }
   * <p/>
   */
  public void setSkipContent(boolean value) {
    this.skipContent = value;
  }

  public boolean isSetSkipContent() {
    return (this.skipContent != null);
  }

  public void unsetSkipContent() {
    this.skipContent = null;
  }

  /**
   * Gets the value of the syncBehavior property.
   * <p/>
   * @return possible object is {@link SyncBehaviorType }
   * <p/>
   */
  public SyncBehaviorType getSyncBehavior() {
    if (syncBehavior == null) {
      return SyncBehaviorType.DEFAULT;
    } else {
      return syncBehavior;
    }
  }

  /**
   * Sets the value of the syncBehavior property.
   * <p/>
   * @param value allowed object is {@link SyncBehaviorType }
   * <p/>
   */
  public void setSyncBehavior(SyncBehaviorType value) {
    this.syncBehavior = value;
  }

  public boolean isSetSyncBehavior() {
    return (this.syncBehavior != null);
  }

  /**
   * Gets the value of the syncTolerance property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getSyncTolerance() {
    return syncTolerance;
  }

  /**
   * Sets the value of the syncTolerance property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setSyncTolerance(String value) {
    this.syncTolerance = value;
  }

  public boolean isSetSyncTolerance() {
    return (this.syncTolerance != null);
  }

  /**
   * Gets the value of the repeat property.
   * <p/>
   * @return possible object is {@link BigInteger }
   * <p/>
   */
  public BigInteger getRepeat() {
    return repeat;
  }

  /**
   * Sets the value of the repeat property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   * <p/>
   */
  public void setRepeat(BigInteger value) {
    this.repeat = value;
  }

  public boolean isSetRepeat() {
    return (this.repeat != null);
  }

  /**
   * Gets the value of the repeatDur property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getRepeatDur() {
    return repeatDur;
  }

  /**
   * Sets the value of the repeatDur property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setRepeatDur(String value) {
    this.repeatDur = value;
  }

  public boolean isSetRepeatDur() {
    return (this.repeatDur != null);
  }

  /**
   * Gets the value of the repeatCount property.
   * <p/>
   * @return possible object is {@link BigDecimal }
   * <p/>
   */
  public BigDecimal getRepeatCount() {
    return repeatCount;
  }

  /**
   * Sets the value of the repeatCount property.
   * <p/>
   * @param value allowed object is {@link BigDecimal }
   * <p/>
   */
  public void setRepeatCount(BigDecimal value) {
    this.repeatCount = value;
  }

  public boolean isSetRepeatCount() {
    return (this.repeatCount != null);
  }

  /**
   * Gets the value of the dur property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getDur() {
    return dur;
  }

  /**
   * Sets the value of the dur property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setDur(String value) {
    this.dur = value;
  }

  public boolean isSetDur() {
    return (this.dur != null);
  }

  /**
   * Gets the value of the begin property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getBegin() {
    return begin;
  }

  /**
   * Sets the value of the begin property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setBegin(String value) {
    this.begin = value;
  }

  public boolean isSetBegin() {
    return (this.begin != null);
  }

  /**
   * Gets the value of the end property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getEnd() {
    return end;
  }

  /**
   * Sets the value of the end property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setEnd(String value) {
    this.end = value;
  }

  public boolean isSetEnd() {
    return (this.end != null);
  }

  /**
   * Gets the value of the min property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getMin() {
    return min;
  }

  /**
   * Sets the value of the min property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setMin(String value) {
    this.min = value;
  }

  public boolean isSetMin() {
    return (this.min != null);
  }

  /**
   * Gets the value of the max property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getMax() {
    return max;
  }

  /**
   * Sets the value of the max property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setMax(String value) {
    this.max = value;
  }

  public boolean isSetMax() {
    return (this.max != null);
  }

  /**
   * Gets the value of the restartDefault property.
   * <p/>
   * @return possible object is {@link RestartDefaultType }
   * <p/>
   */
  public RestartDefaultType getRestartDefault() {
    if (restartDefault == null) {
      return RestartDefaultType.INHERIT;
    } else {
      return restartDefault;
    }
  }

  /**
   * Sets the value of the restartDefault property.
   * <p/>
   * @param value allowed object is {@link RestartDefaultType }
   * <p/>
   */
  public void setRestartDefault(RestartDefaultType value) {
    this.restartDefault = value;
  }

  public boolean isSetRestartDefault() {
    return (this.restartDefault != null);
  }

  /**
   * Gets the value of the fillDefault property.
   * <p/>
   * @return possible object is {@link FillDefaultType }
   * <p/>
   */
  public FillDefaultType getFillDefault() {
    if (fillDefault == null) {
      return FillDefaultType.INHERIT;
    } else {
      return fillDefault;
    }
  }

  /**
   * Sets the value of the fillDefault property.
   * <p/>
   * @param value allowed object is {@link FillDefaultType }
   * <p/>
   */
  public void setFillDefault(FillDefaultType value) {
    this.fillDefault = value;
  }

  public boolean isSetFillDefault() {
    return (this.fillDefault != null);
  }

  /**
   * Gets the value of the restart property.
   * <p/>
   * @return possible object is {@link RestartTimingType }
   * <p/>
   */
  public RestartTimingType getRestart() {
    if (restart == null) {
      return RestartTimingType.DEFAULT;
    } else {
      return restart;
    }
  }

  /**
   * Sets the value of the restart property.
   * <p/>
   * @param value allowed object is {@link RestartTimingType }
   * <p/>
   */
  public void setRestart(RestartTimingType value) {
    this.restart = value;
  }

  public boolean isSetRestart() {
    return (this.restart != null);
  }

  /**
   * Gets the value of the syncBehaviorDefault property.
   * <p/>
   * @return possible object is {@link SyncBehaviorDefaultType }
   * <p/>
   */
  public SyncBehaviorDefaultType getSyncBehaviorDefault() {
    if (syncBehaviorDefault == null) {
      return SyncBehaviorDefaultType.INHERIT;
    } else {
      return syncBehaviorDefault;
    }
  }

  /**
   * Sets the value of the syncBehaviorDefault property.
   * <p/>
   * @param value allowed object is {@link SyncBehaviorDefaultType }
   * <p/>
   */
  public void setSyncBehaviorDefault(SyncBehaviorDefaultType value) {
    this.syncBehaviorDefault = value;
  }

  public boolean isSetSyncBehaviorDefault() {
    return (this.syncBehaviorDefault != null);
  }

  /**
   * Gets the value of the syncToleranceDefault property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getSyncToleranceDefault() {
    if (syncToleranceDefault == null) {
      return "inherit";
    } else {
      return syncToleranceDefault;
    }
  }

  /**
   * Sets the value of the syncToleranceDefault property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setSyncToleranceDefault(String value) {
    this.syncToleranceDefault = value;
  }

  public boolean isSetSyncToleranceDefault() {
    return (this.syncToleranceDefault != null);
  }

  /**
   * Gets the value of the fill property.
   * <p/>
   * @return possible object is {@link FillTimingAttrsType }
   * <p/>
   */
  public FillTimingAttrsType getFill() {
    if (fill == null) {
      return FillTimingAttrsType.DEFAULT;
    } else {
      return fill;
    }
  }

  /**
   * Sets the value of the fill property.
   * <p/>
   * @param value allowed object is {@link FillTimingAttrsType }
   * <p/>
   */
  public void setFill(FillTimingAttrsType value) {
    this.fill = value;
  }

  public boolean isSetFill() {
    return (this.fill != null);
  }

  /**
   * Gets the value of the id property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setId(String value) {
    this.id = value;
  }

  public boolean isSetId() {
    return (this.id != null);
  }

  /**
   * Gets the value of the clazz property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getClazz() {
    return clazz;
  }

  /**
   * Sets the value of the clazz property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setClazz(String value) {
    this.clazz = value;
  }

  public boolean isSetClazz() {
    return (this.clazz != null);
  }

  /**
   * Gets the value of the lang property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getLang() {
    return lang;
  }

  /**
   * Sets the value of the lang property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setLang(String value) {
    this.lang = value;
  }

  public boolean isSetLang() {
    return (this.lang != null);
  }

  /**
   * Gets the value of the alt property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getAlt() {
    return alt;
  }

  /**
   * Sets the value of the alt property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setAlt(String value) {
    this.alt = value;
  }

  public boolean isSetAlt() {
    return (this.alt != null);
  }

  /**
   * Gets the value of the longdesc property.
   * <p/>
   * @return possible object is {@link String }
   * <p/>
   */
  public String getLongdesc() {
    return longdesc;
  }

  /**
   * Sets the value of the longdesc property.
   * <p/>
   * @param value allowed object is {@link String }
   * <p/>
   */
  public void setLongdesc(String value) {
    this.longdesc = value;
  }

  public boolean isSetLongdesc() {
    return (this.longdesc != null);
  }

  /**
   * Gets the value of the targetElement property.
   * <p/>
   * @return possible object is {@link Object }
   * <p/>
   */
  public Object getTargetElement() {
    return targetElement;
  }

  /**
   * Sets the value of the targetElement property.
   * <p/>
   * @param value allowed object is {@link Object }
   * <p/>
   */
  public void setTargetElement(Object value) {
    this.targetElement = value;
  }

  public boolean isSetTargetElement() {
    return (this.targetElement != null);
  }

  /**
   * Gets a map that contains attributes that aren't bound to any typed property
   * on this class.
   * <p/>
   * <p> the map is keyed by the name of the attribute and the value is the
   * string value of the attribute.
   * <p/>
   * the map returned by this method is live, and you can add new attribute by
   * updating the map directly. Because of this design, there's no setter.
   * <p/>
   * <p/>
   * @return always non-null
   */
  public Map<QName, String> getOtherAttributes() {
    return otherAttributes;
  }
}
