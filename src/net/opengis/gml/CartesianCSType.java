package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A 1-, 2-, or 3-dimensional coordinate system. Gives the position of points
 * relative to orthogonal straight axes in the 2- and 3-dimensional cases. In
 * the 1-dimensional case, it contains a single straight coordinate axis. In the
 * multi-dimensional case, all axes shall have the same length unit of measure.
 * A CartesianCS shall have one, two, or three usesAxis associations.
 * <p/>
 * Java class for CartesianCSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CartesianCSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractCoordinateSystemType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartesianCSType")
public class CartesianCSType
  extends AbstractCoordinateSystemType {
}
