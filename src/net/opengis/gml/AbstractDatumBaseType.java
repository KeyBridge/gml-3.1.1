package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Basic encoding for datum objects, simplifying and restricting the
 * DefinitionType as needed.
 * <p/>
 * Java class for AbstractDatumBaseType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractDatumBaseType"> &lt;complexContent>
 * &lt;restriction base="{http://www.opengis.net/gml}DefinitionType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}metaDataProperty"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}datumName"/> &lt;/sequence> &lt;attribute
 * ref="{http://www.opengis.net/gml}id use="required""/> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDatumBaseType")
@XmlSeeAlso({
  AbstractDatumType.class
})
public abstract class AbstractDatumBaseType extends DefinitionType {
}
