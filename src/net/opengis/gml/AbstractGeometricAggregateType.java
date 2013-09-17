package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * This is the abstract root type of the geometric aggregates.
 * <p/>
 * Java class for AbstractGeometricAggregateType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractGeometricAggregateType">
 * &lt;complexContent> &lt;extension
 * base="{http://www.opengis.net/gml}AbstractGeometryType"> &lt;/extension>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometricAggregateType")
@XmlSeeAlso({
  MultiPolygonType.class,
  MultiCurveType.class,
  MultiSurfaceType.class,
  MultiLineStringType.class,
  MultiGeometryType.class,
  MultiSolidType.class,
  MultiPointType.class
})
public abstract class AbstractGeometricAggregateType extends AbstractGeometryType {
}
