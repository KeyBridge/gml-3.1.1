package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Closeness of the relative positions of two or more positions to their
 * respective relative positions accepted as or being true.
 * <p/>
 * Java class for RelativeInternalPositionalAccuracyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="RelativeInternalPositionalAccuracyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractPositionalAccuracyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}result"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeInternalPositionalAccuracyType", propOrder = {
  "result"
})
public class RelativeInternalPositionalAccuracyType
  extends AbstractPositionalAccuracyType {

  @XmlElement(required = true)
  protected MeasureType result;

  /**
   * Gets the value of the result property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getResult() {
    return result;
  }

  /**
   * Sets the value of the result property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setResult(MeasureType value) {
    this.result = value;
  }

  public boolean isSetResult() {
    return (this.result != null);
  }
}
