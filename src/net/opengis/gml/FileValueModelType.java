package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for FileValueModelType.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="FileValueModelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Record Interleaved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "FileValueModelType")
@XmlEnum
public enum FileValueModelType {

  @XmlEnumValue("Record Interleaved")
  RECORD_INTERLEAVED("Record Interleaved");
  private final String value;

  FileValueModelType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static FileValueModelType fromValue(String v) {
    for (FileValueModelType c : FileValueModelType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
