package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * An abstract operation on coordinates that usually includes a change of Datum.
 * The parameters of a coordinate transformation are empirically derived from
 * data containing the coordinates of a series of points in both coordinate
 * reference systems. This computational process is usually "over-determined",
 * allowing derivation of error (or accuracy) estimates for the transformation.
 * Also, the stochastic nature of the parameters may result in multiple
 * (different) versions of the same coordinate transformation.
 * <p/>
 * This abstract complexType is expected to be extended for well-known operation
 * methods with many Transformation instances, in Application Schemas that
 * define operation-method-specialized value element names and contents. This
 * transformation uses an operation method with associated parameter values.
 * However, operation methods and parameter values are directly associated with
 * concrete subtypes, not with this abstract type. All concrete types derived
 * from this type shall extend this type to include a "usesMethod" element that
 * references one "OperationMethod" element. Similarly, all concrete types
 * derived from this type shall extend this type to include one or more elements
 * each named "uses...Value" that each use the type of an element substitutable
 * for the "_generalParameterValue" element.
 * <p/>
 * Java class for AbstractGeneralTransformationType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractGeneralTransformationType">
 * &lt;complexContent> &lt;restriction
 * base="{http://www.opengis.net/gml}AbstractCoordinateOperationType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}metaDataProperty"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}coordinateOperationName"/> &lt;element
 * ref="{http://www.opengis.net/gml}coordinateOperationID" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element ref="{http://www.opengis.net/gml}remarks"
 * minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}operationVersion"/> &lt;element
 * ref="{http://www.opengis.net/gml}validArea" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}scope" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}_positionalAccuracy" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element ref="{http://www.opengis.net/gml}sourceCRS"/>
 * &lt;element ref="{http://www.opengis.net/gml}targetCRS"/> &lt;/sequence>
 * &lt;attribute ref="{http://www.opengis.net/gml}id use="required""/>
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralTransformationType")
@XmlSeeAlso({
  TransformationType.class
})
public abstract class AbstractGeneralTransformationType extends AbstractCoordinateOperationType {
}
