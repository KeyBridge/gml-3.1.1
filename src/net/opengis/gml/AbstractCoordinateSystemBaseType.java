package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Basic encoding for coordinate system objects, simplifying and restricting the
 * DefinitionType as needed.
 * <p/>
 * Java class for AbstractCoordinateSystemBaseType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractCoordinateSystemBaseType">
 * &lt;complexContent> &lt;restriction
 * base="{http://www.opengis.net/gml}DefinitionType"> &lt;sequence> &lt;element
 * ref="{http://www.opengis.net/gml}metaDataProperty" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;element ref="{http://www.opengis.net/gml}csName"/>
 * &lt;/sequence> &lt;attribute ref="{http://www.opengis.net/gml}id
 * use="required""/> &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateSystemBaseType")
@XmlSeeAlso({
  AbstractCoordinateSystemType.class
})
public abstract class AbstractCoordinateSystemBaseType extends DefinitionType {
}
