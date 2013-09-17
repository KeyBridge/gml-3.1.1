package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for DrawingTypeType.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="DrawingTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POLYLINE"/>
 *     &lt;enumeration value="ORTHOGONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "DrawingTypeType")
@XmlEnum
public enum DrawingTypeType {

  POLYLINE,
  ORTHOGONAL;

  public String value() {
    return name();
  }

  public static DrawingTypeType fromValue(String v) {
    return valueOf(v);
  }
}
