package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A Circle is an arc whose ends coincide to form a simple closed loop. The
 * "start" and "end" bearing are equal and shall be the bearing for the first
 * controlPoint listed. The three control points must be distinct non-co-linear
 * points for the Circle to be unambiguously defined. The arc is simply extended
 * past the third control point until the first control point is encountered.
 * <p/>
 * Java class for CircleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="CircleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}ArcType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleType")
public class CircleType
  extends ArcType {
}
