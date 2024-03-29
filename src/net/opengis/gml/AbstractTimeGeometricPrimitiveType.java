package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * The abstract supertype for temporal geometric primitives. A temporal geometry
 * must be associated with a temporal reference system via URI. The Gregorian
 * calendar with UTC is the default reference system, following ISO 8601. Other
 * reference systems in common use include the GPS calendar and the Julian
 * calendar.
 * <p/>
 * Java class for AbstractTimeGeometricPrimitiveType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractTimeGeometricPrimitiveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimePrimitiveType">
 *       &lt;attribute name="frame" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="#ISO-8601" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeGeometricPrimitiveType")
@XmlSeeAlso({
  TimePeriodType.class,
  TimeInstantType.class
})
public abstract class AbstractTimeGeometricPrimitiveType
  extends AbstractTimePrimitiveType {

  @XmlAttribute(name = "frame")
  @XmlSchemaType(name = "anyURI")
  protected String frame;

  /**
   * Gets the value of the frame property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getFrame() {
    if (frame == null) {
      return "#ISO-8601";
    } else {
      return frame;
    }
  }

  /**
   * Sets the value of the frame property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setFrame(String value) {
    this.frame = value;
  }

  public boolean isSetFrame() {
    return (this.frame != null);
  }
}
