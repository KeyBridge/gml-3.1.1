package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * A placement takes a standard geometric construction and places it in
 * geographic space. It defines a transformation from a constructive parameter
 * space to the co-ordinate space of the co-ordinate reference system being
 * used. Parameter spaces in formulae in this International Standard are given
 * as (u, v) in 2D and(u, v, w) in 3D. Co-ordinate reference systems positions
 * are given in formulae, in this International Standard, by either (x, y) in
 * 2D, or (x, y, z) in 3D.
 * <p/>
 * Affine placements are defined by linear transformations from parameter space
 * to the target co-ordiante space. 2-dimensional Cartesian parameter
 * space,(u,v) transforms into 3-dimensional co- ordinate reference
 * systems,(x,y,z) by using an affine transformation,(u,v)->(x,y,z) which is
 * defined :
 * <p/>
 * x	ux vx x0 u y =	uy vy + y0 v x	uz vz	z0
 * <p/>
 * Then, given this equation, the location element of the AffinePlacement is the
 * direct position (x0, y0, z0), which is the target position of the origin in
 * (u, v). The two reference directions (ux, uy, uz) and (vx, vy, vz) are the
 * target directions of the unit vectors at the origin in (u, v).
 * <p/>
 * Java class for AffinePlacementType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AffinePlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.opengis.net/gml}DirectPositionType"/>
 *         &lt;element name="refDirection" type="{http://www.opengis.net/gml}VectorType" maxOccurs="unbounded"/>
 *         &lt;element name="inDimension" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="outDimension" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinePlacementType", propOrder = {
  "location",
  "refDirection",
  "inDimension",
  "outDimension"
})
public class AffinePlacementType {

  @XmlElement(required = true)
  protected DirectPositionType location;
  @XmlElement(required = true)
  protected List<VectorType> refDirection;
  @XmlElement(required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger inDimension;
  @XmlElement(required = true)
  @XmlSchemaType(name = "positiveInteger")
  protected BigInteger outDimension;

  /**
   * Gets the value of the location property.
   * <p/>
   * @return possible object is {@link DirectPositionType }
   *
   */
  public DirectPositionType getLocation() {
    return location;
  }

  /**
   * Sets the value of the location property.
   * <p/>
   * @param value allowed object is {@link DirectPositionType }
   *
   */
  public void setLocation(DirectPositionType value) {
    this.location = value;
  }

  public boolean isSetLocation() {
    return (this.location != null);
  }

  /**
   * Gets the value of the refDirection property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the refDirection property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRefDirection().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
   *
   *
   */
  public List<VectorType> getRefDirection() {
    if (refDirection == null) {
      refDirection = new ArrayList<VectorType>();
    }
    return this.refDirection;
  }

  public boolean isSetRefDirection() {
    return ((this.refDirection != null) && (!this.refDirection.isEmpty()));
  }

  public void unsetRefDirection() {
    this.refDirection = null;
  }

  /**
   * Gets the value of the inDimension property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getInDimension() {
    return inDimension;
  }

  /**
   * Sets the value of the inDimension property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setInDimension(BigInteger value) {
    this.inDimension = value;
  }

  public boolean isSetInDimension() {
    return (this.inDimension != null);
  }

  /**
   * Gets the value of the outDimension property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getOutDimension() {
    return outDimension;
  }

  /**
   * Sets the value of the outDimension property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setOutDimension(BigInteger value) {
    this.outDimension = value;
  }

  public boolean isSetOutDimension() {
    return (this.outDimension != null);
  }
}
