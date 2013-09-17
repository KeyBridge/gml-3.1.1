package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Direction expressed as a vector, either using components, or using angles.
 * <p/>
 * Java class for DirectionVectorType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DirectionVectorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}vector"/>
 *         &lt;sequence>
 *           &lt;element name="horizontalAngle" type="{http://www.opengis.net/gml}AngleType"/>
 *           &lt;element name="verticalAngle" type="{http://www.opengis.net/gml}AngleType"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionVectorType", propOrder = {
  "vector",
  "horizontalAngle",
  "verticalAngle"
})
public class DirectionVectorType {

  protected VectorType vector;
  protected AngleType horizontalAngle;
  protected AngleType verticalAngle;

  /**
   * Gets the value of the vector property.
   * <p/>
   * @return possible object is {@link VectorType }
   *
   */
  public VectorType getVector() {
    return vector;
  }

  /**
   * Sets the value of the vector property.
   * <p/>
   * @param value allowed object is {@link VectorType }
   *
   */
  public void setVector(VectorType value) {
    this.vector = value;
  }

  public boolean isSetVector() {
    return (this.vector != null);
  }

  /**
   * Gets the value of the horizontalAngle property.
   * <p/>
   * @return possible object is {@link AngleType }
   *
   */
  public AngleType getHorizontalAngle() {
    return horizontalAngle;
  }

  /**
   * Sets the value of the horizontalAngle property.
   * <p/>
   * @param value allowed object is {@link AngleType }
   *
   */
  public void setHorizontalAngle(AngleType value) {
    this.horizontalAngle = value;
  }

  public boolean isSetHorizontalAngle() {
    return (this.horizontalAngle != null);
  }

  /**
   * Gets the value of the verticalAngle property.
   * <p/>
   * @return possible object is {@link AngleType }
   *
   */
  public AngleType getVerticalAngle() {
    return verticalAngle;
  }

  /**
   * Sets the value of the verticalAngle property.
   * <p/>
   * @param value allowed object is {@link AngleType }
   *
   */
  public void setVerticalAngle(AngleType value) {
    this.verticalAngle = value;
  }

  public boolean isSetVerticalAngle() {
    return (this.verticalAngle != null);
  }
}
