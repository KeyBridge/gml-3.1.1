package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * The abstract supertype for temporal objects.
 * <p/>
 * Java class for AbstractTimeObjectType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractTimeObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGMLType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeObjectType")
@XmlSeeAlso({
  AbstractTimeComplexType.class,
  AbstractTimePrimitiveType.class
})
public abstract class AbstractTimeObjectType
  extends AbstractGMLType {
}
