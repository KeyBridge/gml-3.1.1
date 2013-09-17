package net.opengis.gml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for SequenceRuleNames.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="SequenceRuleNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Linear"/>
 *     &lt;enumeration value="Boustrophedonic"/>
 *     &lt;enumeration value="Cantor-diagonal"/>
 *     &lt;enumeration value="Spiral"/>
 *     &lt;enumeration value="Morton"/>
 *     &lt;enumeration value="Hilbert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * <p/>
 */
@XmlType(name = "SequenceRuleNames")
@XmlEnum
public enum SequenceRuleNames {

  @XmlEnumValue("Linear")
  LINEAR("Linear"),
  @XmlEnumValue("Boustrophedonic")
  BOUSTROPHEDONIC("Boustrophedonic"),
  @XmlEnumValue("Cantor-diagonal")
  CANTOR_DIAGONAL("Cantor-diagonal"),
  @XmlEnumValue("Spiral")
  SPIRAL("Spiral"),
  @XmlEnumValue("Morton")
  MORTON("Morton"),
  @XmlEnumValue("Hilbert")
  HILBERT("Hilbert");
  private final String value;

  SequenceRuleNames(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static SequenceRuleNames fromValue(String v) {
    for (SequenceRuleNames c : SequenceRuleNames.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
