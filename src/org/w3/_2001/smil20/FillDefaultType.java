



package org.w3._2001.smil20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for fillDefaultType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class. <p>
 * <pre>
 * &lt;simpleType name="fillDefaultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="freeze"/>
 *     &lt;enumeration value="hold"/>
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="inherit"/>
 *     &lt;enumeration value="transition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "fillDefaultType")
@XmlEnum
public enum FillDefaultType {

  @XmlEnumValue("remove")
  REMOVE("remove"),
  @XmlEnumValue("freeze")
  FREEZE("freeze"),
  @XmlEnumValue("hold")
  HOLD("hold"),
  @XmlEnumValue("auto")
  AUTO("auto"),
  @XmlEnumValue("inherit")
  INHERIT("inherit"),
  @XmlEnumValue("transition")
  TRANSITION("transition");
  private final String value;

  FillDefaultType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static FillDefaultType fromValue(String v) {
    for (FillDefaultType c : FillDefaultType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
