package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for QueryGrammarEnumeration.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="QueryGrammarEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="xquery"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "QueryGrammarEnumeration")
@XmlEnum
public enum QueryGrammarEnumeration {

  @XmlEnumValue("xpath")
  XPATH("xpath"),
  @XmlEnumValue("xquery")
  XQUERY("xquery"),
  @XmlEnumValue("other")
  OTHER("other");
  private final String value;

  QueryGrammarEnumeration(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static QueryGrammarEnumeration fromValue(String v) {
    for (QueryGrammarEnumeration c : QueryGrammarEnumeration.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
