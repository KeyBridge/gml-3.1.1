package org.w3._1999.xlink;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for showType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class. <p>
 * <pre>
 * &lt;simpleType name="showType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="embed"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "showType")
@XmlEnum
public enum ShowType {

  @XmlEnumValue("new")
  NEW("new"),
  @XmlEnumValue("replace")
  REPLACE("replace"),
  @XmlEnumValue("embed")
  EMBED("embed"),
  @XmlEnumValue("other")
  OTHER("other"),
  @XmlEnumValue("none")
  NONE("none");
  private final String value;

  ShowType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ShowType fromValue(String v) {
    for (ShowType c : ShowType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
