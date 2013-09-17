package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Value of a scale factor (or ratio) that has no physical unit. Uses the
 * MeasureType with the restriction that the unit of measure referenced by uom
 * must be suitable for a scale factor, such as percent, permil, or
 * parts-per-million.
 * <p/>
 * Java class for ScaleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ScaleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://www.opengis.net/gml>MeasureType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaleType")
public class ScaleType
  extends MeasureType {
}
