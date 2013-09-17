package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for IncrementOrder.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="IncrementOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="+x+y"/>
 *     &lt;enumeration value="+y+x"/>
 *     &lt;enumeration value="+x-y"/>
 *     &lt;enumeration value="-x-y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "IncrementOrder")
@XmlEnum
public enum IncrementOrder {

  @XmlEnumValue("+x+y")
  PLUS_X_PLUS_Y("+x+y"),
  @XmlEnumValue("+y+x")
  Y_X("+y+x"),
  @XmlEnumValue("+x-y")
  PLUS_X_MINUS_Y("+x-y"),
  @XmlEnumValue("-x-y")
  MINUS_X_MINUS_Y("-x-y");
  private final String value;

  IncrementOrder(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static IncrementOrder fromValue(String v) {
    for (IncrementOrder c : IncrementOrder.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
