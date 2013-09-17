package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A one-dimensional coordinate system used to record the heights (or depths) of
 * points. Such a coordinate system is usually dependent on the Earth's gravity
 * field, perhaps loosely as when atmospheric pressure is the basis for the
 * vertical coordinate system axis. A VerticalCS shall have one usesAxis
 * association.
 * <p/>
 * <p>Java class for VerticalCSType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="VerticalCSType">
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
@XmlType(name = "VerticalCSType")
public class VerticalCSType
  extends AbstractCoordinateSystemType {
}
