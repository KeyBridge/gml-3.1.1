package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for KnotTypesType.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="KnotTypesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="uniform"/>
 *     &lt;enumeration value="quasiUniform"/>
 *     &lt;enumeration value="piecewiseBezier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "KnotTypesType")
@XmlEnum
public enum KnotTypesType {

  @XmlEnumValue("uniform")
  UNIFORM("uniform"),
  @XmlEnumValue("quasiUniform")
  QUASI_UNIFORM("quasiUniform"),
  @XmlEnumValue("piecewiseBezier")
  PIECEWISE_BEZIER("piecewiseBezier");
  private final String value;

  KnotTypesType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static KnotTypesType fromValue(String v) {
    for (KnotTypesType c : KnotTypesType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
