package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A two- or three-dimensional coordinate system with straight axes that are not
 * necessarily orthogonal. An ObliqueCartesianCS shall have two or three
 * usesAxis associations.
 * <p/>
 * Java class for ObliqueCartesianCSType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ObliqueCartesianCSType">
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
@XmlType(name = "ObliqueCartesianCSType")
public class ObliqueCartesianCSType
  extends AbstractCoordinateSystemType {
}
