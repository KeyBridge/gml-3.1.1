package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for SuccessionType.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="SuccessionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="substitution"/>
 *     &lt;enumeration value="division"/>
 *     &lt;enumeration value="fusion"/>
 *     &lt;enumeration value="initiation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "SuccessionType")
@XmlEnum
public enum SuccessionType {

  @XmlEnumValue("substitution")
  SUBSTITUTION("substitution"),
  @XmlEnumValue("division")
  DIVISION("division"),
  @XmlEnumValue("fusion")
  FUSION("fusion"),
  @XmlEnumValue("initiation")
  INITIATION("initiation");
  private final String value;

  SuccessionType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static SuccessionType fromValue(String v) {
    for (SuccessionType c : SuccessionType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
