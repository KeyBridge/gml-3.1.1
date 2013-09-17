



package org.w3._2001.smil20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for restartDefaultType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class. <p>
 * <pre>
 * &lt;simpleType name="restartDefaultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="always"/>
 *     &lt;enumeration value="whenNotActive"/>
 *     &lt;enumeration value="inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "restartDefaultType")
@XmlEnum
public enum RestartDefaultType {

  @XmlEnumValue("never")
  NEVER("never"),
  @XmlEnumValue("always")
  ALWAYS("always"),
  @XmlEnumValue("whenNotActive")
  WHEN_NOT_ACTIVE("whenNotActive"),
  @XmlEnumValue("inherit")
  INHERIT("inherit");
  private final String value;

  RestartDefaultType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static RestartDefaultType fromValue(String v) {
    for (RestartDefaultType c : RestartDefaultType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
