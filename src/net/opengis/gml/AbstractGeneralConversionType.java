package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * An abstract operation on coordinates that does not include any change of
 * datum. The best-known example of a coordinate conversion is a map projection.
 * The parameters describing coordinate conversions are defined rather than
 * empirically derived. Note that some conversions have no parameters.
 * <p/>
 * This abstract complexType is expected to be extended for well-known operation
 * methods with many Conversion instances, in Application Schemas that define
 * operation-method-specialized element names and contents. This conversion uses
 * an operation method, usually with associated parameter values. However,
 * operation methods and parameter values are directly associated with concrete
 * subtypes, not with this abstract type. All concrete types derived from this
 * type shall extend this type to include a "usesMethod" element that references
 * the "OperationMethod" element. Similarly, all concrete types derived from
 * this type shall extend this type to include zero or more elements each named
 * "uses...Value" that each use the type of an element substitutable for the
 * "_generalParameterValue" element.
 * <p/>
 * Java class for AbstractGeneralConversionType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractGeneralConversionType">
 * &lt;complexContent> &lt;restriction
 * base="{http://www.opengis.net/gml}AbstractCoordinateOperationType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}metaDataProperty"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}coordinateOperationName"/> &lt;element
 * ref="{http://www.opengis.net/gml}coordinateOperationID" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element ref="{http://www.opengis.net/gml}remarks"
 * minOccurs="0"/> &lt;element ref="{http://www.opengis.net/gml}validArea"
 * minOccurs="0"/> &lt;element ref="{http://www.opengis.net/gml}scope"
 * minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}_positionalAccuracy" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;attribute
 * ref="{http://www.opengis.net/gml}id use="required""/> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralConversionType")
@XmlSeeAlso({
  ConversionType.class
})
public abstract class AbstractGeneralConversionType extends AbstractCoordinateOperationType {
}
