package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An image datum defines the origin of an image coordinate reference system,
 * and is used in a local context only. For more information, see OGC Abstract
 * Specification Topic 2.
 * <p/>
 * Java class for ImageDatumType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ImageDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}pixelInCell"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDatumType", propOrder = {
  "pixelInCell"
})
public class ImageDatumType
  extends AbstractDatumType {

  @XmlElement(required = true)
  protected PixelInCellType pixelInCell;

  /**
   * Gets the value of the pixelInCell property.
   * <p/>
   * @return possible object is {@link PixelInCellType }
   *
   */
  public PixelInCellType getPixelInCell() {
    return pixelInCell;
  }

  /**
   * Sets the value of the pixelInCell property.
   * <p/>
   * @param value allowed object is {@link PixelInCellType }
   *
   */
  public void setPixelInCell(PixelInCellType value) {
    this.pixelInCell = value;
  }

  public boolean isSetPixelInCell() {
    return (this.pixelInCell != null);
  }
}
