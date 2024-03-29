package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * An abstraction of a curve to support the different levels of complexity. The
 * curve can always be viewed as a geometric primitive, i.e. is continuous.
 * <p/>
 * Java class for AbstractCurveType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractCurveType"> &lt;complexContent>
 * &lt;extension
 * base="{http://www.opengis.net/gml}AbstractGeometricPrimitiveType">
 * &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCurveType")
@XmlSeeAlso({
  CurveType.class,
  OrientableCurveType.class,
  LineStringType.class,
  CompositeCurveType.class
})
public abstract class AbstractCurveType extends AbstractGeometricPrimitiveType {
}
