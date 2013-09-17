package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * OrientableSurface consists of a surface and an orientation. If the
 * orientation is "+", then the OrientableSurface is identical to the
 * baseSurface. If the orientation is "-", then the OrientableSurface is a
 * reference to a Surface with an up-normal that reverses the direction for this
 * OrientableSurface, the sense of "the top of the surface".
 * <p/>
 * Java class for OrientableSurfaceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="OrientableSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}baseSurface"/>
 *       &lt;/sequence>
 *       &lt;attribute name="orientation" type="{http://www.opengis.net/gml}SignType" default="+" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrientableSurfaceType", propOrder = {
  "baseSurface"
})
public class OrientableSurfaceType
  extends AbstractSurfaceType {

  @XmlElement(required = true)
  protected SurfacePropertyType baseSurface;
  @XmlAttribute(name = "orientation")
  protected SignType orientation;

  /**
   * References or contains the base surface (positive orientation).
   * <p/>
   * @return possible object is {@link SurfacePropertyType }
   *
   */
  public SurfacePropertyType getBaseSurface() {
    return baseSurface;
  }

  /**
   * Sets the value of the baseSurface property.
   * <p/>
   * @param value allowed object is {@link SurfacePropertyType }
   *
   */
  public void setBaseSurface(SurfacePropertyType value) {
    this.baseSurface = value;
  }

  public boolean isSetBaseSurface() {
    return (this.baseSurface != null);
  }

  /**
   * Gets the value of the orientation property.
   * <p/>
   * @return possible object is {@link SignType }
   *
   */
  public SignType getOrientation() {
    if (orientation == null) {
      return SignType.VALUE_2;
    } else {
      return orientation;
    }
  }

  /**
   * Sets the value of the orientation property.
   * <p/>
   * @param value allowed object is {@link SignType }
   *
   */
  public void setOrientation(SignType value) {
    this.orientation = value;
  }

  public boolean isSetOrientation() {
    return (this.orientation != null);
  }
}
