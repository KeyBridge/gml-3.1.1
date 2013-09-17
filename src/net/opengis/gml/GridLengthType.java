package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Value of a length (or distance) quantity in a grid, where the grid spacing
 * does not have any associated physical units, or does not have a constant
 * physical spacing. This grid length will often be used in a digital image
 * grid, where the base units are likely to be pixel spacings. Uses the
 * MeasureType with the restriction that the unit of measure referenced by uom
 * must be suitable for length along the axes of a grid, such as pixel spacings
 * or grid spacings.
 * <p/>
 * Java class for GridLengthType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GridLengthType">
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
@XmlType(name = "GridLengthType")
public class GridLengthType
  extends MeasureType {
}
