package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for SignType.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="SignType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="-"/>
 *     &lt;enumeration value="+"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "SignType")
@XmlEnum
public enum SignType {

  @XmlEnumValue("-")
  VALUE_1("-"),
  @XmlEnumValue("+")
  VALUE_2("+");
  private final String value;

  SignType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static SignType fromValue(String v) {
    for (SignType c : SignType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
