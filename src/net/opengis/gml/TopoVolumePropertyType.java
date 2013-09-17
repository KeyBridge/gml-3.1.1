package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TopoVolumePropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoVolumePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}TopoVolume"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoVolumePropertyType", propOrder = {
  "topoVolume"
})
public class TopoVolumePropertyType {

  @XmlElement(name = "TopoVolume", required = true)
  protected TopoVolumeType topoVolume;

  /**
   * Gets the value of the topoVolume property.
   * <p/>
   * @return possible object is {@link TopoVolumeType }
   *
   */
  public TopoVolumeType getTopoVolume() {
    return topoVolume;
  }

  /**
   * Sets the value of the topoVolume property.
   * <p/>
   * @param value allowed object is {@link TopoVolumeType }
   *
   */
  public void setTopoVolume(TopoVolumeType value) {
    this.topoVolume = value;
  }

  public boolean isSetTopoVolume() {
    return (this.topoVolume != null);
  }
}
