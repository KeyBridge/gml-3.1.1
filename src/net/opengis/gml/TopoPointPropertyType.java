package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TopoPointPropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoPointPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}TopoPoint"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPointPropertyType", propOrder = {
  "topoPoint"
})
public class TopoPointPropertyType {

  @XmlElement(name = "TopoPoint", required = true)
  protected TopoPointType topoPoint;

  /**
   * Gets the value of the topoPoint property.
   * <p/>
   * @return possible object is {@link TopoPointType }
   *
   */
  public TopoPointType getTopoPoint() {
    return topoPoint;
  }

  /**
   * Sets the value of the topoPoint property.
   * <p/>
   * @param value allowed object is {@link TopoPointType }
   *
   */
  public void setTopoPoint(TopoPointType value) {
    this.topoPoint = value;
  }

  public boolean isSetTopoPoint() {
    return (this.topoPoint != null);
  }
}
