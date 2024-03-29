package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Abstract parameter value or group of parameter values.
 * <p/>
 * This abstract complexType is expected to be extended and restricted for
 * well-known operation methods with many instances, in Application Schemas that
 * define operation-method-specialized element names and contents. Specific
 * parameter value elements are directly contained in concrete subtypes, not in
 * this abstract type. All concrete types derived from this type shall extend
 * this type to include one "...Value" element with an appropriate type, which
 * should be one of the element types allowed in the ParameterValueType. In
 * addition, all derived concrete types shall extend this type to include a
 * "valueOfParameter" element that references one element substitutable for the
 * "OperationParameter" element.
 * <p/>
 * Java class for AbstractGeneralParameterValueType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractGeneralParameterValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralParameterValueType")
@XmlSeeAlso({
  ParameterValueType.class,
  ParameterValueGroupType.class
})
public abstract class AbstractGeneralParameterValueType {
}
