package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A textual description and/or a set of parameters identifying a particular
 * reference level surface used as a zero-height surface, including its position
 * with respect to the Earth for any of the height types recognized by this
 * standard. There are several types of Vertical Datums, and each may place
 * constraints on the Coordinate Axis with which it is combined to create a
 * Vertical CRS.
 * <p/>
 * <p>Java class for VerticalDatumType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="VerticalDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}verticalDatumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalDatumType", propOrder = {
  "verticalDatumType"
})
public class VerticalDatumType
  extends AbstractDatumType {

  protected VerticalDatumTypeType verticalDatumType;

  /**
   * Gets the value of the verticalDatumType property.
   * <p/>
   * @return possible object is {@link VerticalDatumTypeType }
   *
   */
  public VerticalDatumTypeType getVerticalDatumType() {
    return verticalDatumType;
  }

  /**
   * Sets the value of the verticalDatumType property.
   * <p/>
   * @param value allowed object is {@link VerticalDatumTypeType }
   *
   */
  public void setVerticalDatumType(VerticalDatumTypeType value) {
    this.verticalDatumType = value;
  }

  public boolean isSetVerticalDatumType() {
    return (this.verticalDatumType != null);
  }
}
