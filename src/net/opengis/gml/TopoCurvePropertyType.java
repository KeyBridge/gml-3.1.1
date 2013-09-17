package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TopoCurvePropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoCurvePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}TopoCurve"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoCurvePropertyType", propOrder = {
  "topoCurve"
})
public class TopoCurvePropertyType {

  @XmlElement(name = "TopoCurve", required = true)
  protected TopoCurveType topoCurve;

  /**
   * Gets the value of the topoCurve property.
   * <p/>
   * @return possible object is {@link TopoCurveType }
   *
   */
  public TopoCurveType getTopoCurve() {
    return topoCurve;
  }

  /**
   * Sets the value of the topoCurve property.
   * <p/>
   * @param value allowed object is {@link TopoCurveType }
   *
   */
  public void setTopoCurve(TopoCurveType value) {
    this.topoCurve = value;
  }

  public boolean isSetTopoCurve() {
    return (this.topoCurve != null);
  }
}
