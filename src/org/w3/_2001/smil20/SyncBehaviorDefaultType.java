



package org.w3._2001.smil20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for syncBehaviorDefaultType.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class. <p>
 * <pre>
 * &lt;simpleType name="syncBehaviorDefaultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="canSlip"/>
 *     &lt;enumeration value="locked"/>
 *     &lt;enumeration value="independent"/>
 *     &lt;enumeration value="inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "syncBehaviorDefaultType")
@XmlEnum
public enum SyncBehaviorDefaultType {

  @XmlEnumValue("canSlip")
  CAN_SLIP("canSlip"),
  @XmlEnumValue("locked")
  LOCKED("locked"),
  @XmlEnumValue("independent")
  INDEPENDENT("independent"),
  @XmlEnumValue("inherit")
  INHERIT("inherit");
  private final String value;

  SyncBehaviorDefaultType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static SyncBehaviorDefaultType fromValue(String v) {
    for (SyncBehaviorDefaultType c : SyncBehaviorDefaultType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
