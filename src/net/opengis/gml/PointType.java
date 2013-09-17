package net.opengis.gml;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A Point is defined by a single coordinate tuple.
 * <p/>
 * Java class for PointType complex type.
 * <p/>
 * A constructor plus getter and setter methods have been added to simplify
 * access to the DirectPositionType 'pos' field.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointType", propOrder = {
  "pos",
  "coordinates",
  "coord"
})
public class PointType extends AbstractGeometricPrimitiveType {

  protected DirectPositionType pos;
  protected CoordinatesType coordinates;
  protected CoordType coord;

  public PointType() {
  }

  /**
   * Constructor that automatically creates a new 'pos' DirectPositionType
   * entry.
   * <p/>
   * @param latitude
   * @param longitude
   */
  public PointType(Double latitude, Double longitude) {
    this.pos = new DirectPositionType(latitude, longitude);
  }

  /**
   * @return The 'pos' latitude
   */
  public Double getLatitude() {
    return isSetPos() ? pos.getLatitude() : null;
  }

  /**
   * @param latitude The 'pos' latitude
   */
  public final void setLatitude(Double latitude) {
    if (isSetPos()) {
      pos.setLatitude(latitude);
    }
  }

  /**
   * @return the 'pos' longitude
   */
  public Double getLongitude() {
    return isSetPos() ? pos.getLongitude() : null;
  }

  /**
   * @param longitude the 'pos' longitude
   */
  public final void setLongitude(Double longitude) {
    if (isSetPos()) {
      pos.setLongitude(longitude);
    }
  }

  /**
   * Gets the value of the pos property.
   * <p/>
   * @return possible object is {@link DirectPositionType }
   *
   */
  public DirectPositionType getPos() {
    return pos;
  }

  /**
   * Sets the value of the pos property.
   * <p/>
   * @param value allowed object is {@link DirectPositionType }
   *
   */
  public void setPos(DirectPositionType value) {
    this.pos = value;
  }

  public boolean isSetPos() {
    return (this.pos != null);
  }

  /**
   * Deprecated with GML version 3.1.0 for coordinates with ordinate values that
   * are numbers. Use "pos" instead. The "coordinates" element shall only be
   * used for coordinates with ordinates that require a string representation,
   * e.g. DMS representations.
   * <p/>
   * @return possible object is {@link CoordinatesType }
   *
   */
  public CoordinatesType getCoordinates() {
    return coordinates;
  }

  /**
   * Sets the value of the coordinates property.
   * <p/>
   * @param value allowed object is {@link CoordinatesType }
   *
   */
  public void setCoordinates(CoordinatesType value) {
    this.coordinates = value;
  }

  public boolean isSetCoordinates() {
    return (this.coordinates != null);
  }

  /**
   * Deprecated with GML version 3.0. Use "pos" instead. The "coord" element is
   * included for backwards compatibility with GML 2.
   * <p/>
   * @return possible object is {@link CoordType }
   *
   */
  public CoordType getCoord() {
    return coord;
  }

  /**
   * Sets the value of the coord property.
   * <p/>
   * @param value allowed object is {@link CoordType }
   *
   */
  public void setCoord(CoordType value) {
    this.coord = value;
  }

  public boolean isSetCoord() {
    return (this.coord != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 47 * hash + Objects.hashCode(this.pos);
    hash = 47 * hash + Objects.hashCode(this.coordinates);
    hash = 47 * hash + Objects.hashCode(this.coord);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final PointType other = (PointType) obj;
    if (!Objects.equals(this.pos, other.pos)) {
      return false;
    }
    if (!Objects.equals(this.coordinates, other.coordinates)) {
      return false;
    }
    if (!Objects.equals(this.coord, other.coord)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return (pos != null ? pos.toString() : "")
      + (coordinates != null ? coordinates.toString() : "")
      + (coord != null ? coord.toString() : "");
  }
}
