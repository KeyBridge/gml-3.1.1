package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TopoSurfacePropertyType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoSurfacePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}TopoSurface"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoSurfacePropertyType", propOrder = {
  "topoSurface"
})
public class TopoSurfacePropertyType {

  @XmlElement(name = "TopoSurface", required = true)
  protected TopoSurfaceType topoSurface;

  /**
   * Gets the value of the topoSurface property.
   * <p/>
   * @return possible object is {@link TopoSurfaceType }
   *
   */
  public TopoSurfaceType getTopoSurface() {
    return topoSurface;
  }

  /**
   * Sets the value of the topoSurface property.
   * <p/>
   * @param value allowed object is {@link TopoSurfaceType }
   *
   */
  public void setTopoSurface(TopoSurfaceType value) {
    this.topoSurface = value;
  }

  public boolean isSetTopoSurface() {
    return (this.topoSurface != null);
  }
}
