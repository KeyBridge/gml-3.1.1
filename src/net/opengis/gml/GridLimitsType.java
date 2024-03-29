package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for GridLimitsType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="GridLimitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GridEnvelope" type="{http://www.opengis.net/gml}GridEnvelopeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridLimitsType", propOrder = {
  "gridEnvelope"
})
public class GridLimitsType {

  @XmlElement(name = "GridEnvelope", required = true)
  protected GridEnvelopeType gridEnvelope;

  /**
   * Gets the value of the gridEnvelope property.
   * <p/>
   * @return possible object is {@link GridEnvelopeType }
   *
   */
  public GridEnvelopeType getGridEnvelope() {
    return gridEnvelope;
  }

  /**
   * Sets the value of the gridEnvelope property.
   * <p/>
   * @param value allowed object is {@link GridEnvelopeType }
   *
   */
  public void setGridEnvelope(GridEnvelopeType value) {
    this.gridEnvelope = value;
  }

  public boolean isSetGridEnvelope() {
    return (this.gridEnvelope != null);
  }
}
