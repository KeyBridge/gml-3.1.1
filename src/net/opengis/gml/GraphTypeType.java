package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for GraphTypeType.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="GraphTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TREE"/>
 *     &lt;enumeration value="BICONNECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "GraphTypeType")
@XmlEnum
public enum GraphTypeType {

  TREE,
  BICONNECTED;

  public String value() {
    return name();
  }

  public static GraphTypeType fromValue(String v) {
    return valueOf(v);
  }
}
