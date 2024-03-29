package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Integer number of degrees, plus the angle direction. This element can be used
 * for geographic Latitude and Longitude. For Latitude, the XML attribute
 * direction can take the values "N" or "S", meaning North or South of the
 * equator. For Longitude, direction can take the values "E" or "W", meaning
 * East or West of the prime meridian. This element can also be used for other
 * angles. In that case, the direction can take the values "+" or "-" (of
 * SignType), in the specified rotational direction from a specified reference
 * direction.
 * <p/>
 * Java class for DegreesType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DegreesType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml>DegreeValueType">
 *       &lt;attribute name="direction">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value="N"/>
 *                 &lt;enumeration value="E"/>
 *                 &lt;enumeration value="S"/>
 *                 &lt;enumeration value="W"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.opengis.net/gml}SignType">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DegreesType", propOrder = {
  "value"
})
public class DegreesType {

  @XmlValue
  protected int value;
  @XmlAttribute(name = "direction")
  protected String direction;

  /**
   * Integer number of degrees in a degree-minute-second or degree-minute
   * angular value, without indication of direction.
   * <p/>
   */
  public int getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   * <p/>
   */
  public void setValue(int value) {
    this.value = value;
  }

  public boolean isSetValue() {
    return true;
  }

  /**
   * Gets the value of the direction property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setDirection(String value) {
    this.direction = value;
  }

  public boolean isSetDirection() {
    return (this.direction != null);
  }
}
