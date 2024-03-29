package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * An abstraction of a surface to support the different levels of complexity. A
 * surface is always a continuous region of a plane.
 * <p/>
 * Java class for AbstractSurfaceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractSurfaceType"> &lt;complexContent>
 * &lt;extension
 * base="{http://www.opengis.net/gml}AbstractGeometricPrimitiveType">
 * &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSurfaceType")
@XmlSeeAlso({
  PolygonType.class,
  OrientableSurfaceType.class,
  CompositeSurfaceType.class,
  SurfaceType.class
})
public class AbstractSurfaceType extends AbstractGeometricPrimitiveType {
}
