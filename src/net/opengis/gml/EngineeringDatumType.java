package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * An engineering datum defines the origin of an engineering coordinate
 * reference system, and is used in a region around that origin. This origin can
 * be fixed with respect to the earth (such as a defined point at a construction
 * site), or be a defined point on a moving vehicle (such as on a ship or
 * satellite).
 * <p/>
 * Java class for EngineeringDatumType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="EngineeringDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringDatumType")
public class EngineeringDatumType
  extends AbstractDatumType {
}
