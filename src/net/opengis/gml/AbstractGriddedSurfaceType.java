package net.opengis.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A gridded surface is a parametric curve surface derived from a rectangular
 * grid in the parameter space. The rows from this grid are control points for
 * horizontal surface curves; the columns are control points for vertical
 * surface curves. The working assumption is that for a pair of parametric
 * co-ordinates (s, t) that the horizontal curves for each integer offset are
 * calculated and evaluated at "s". The defines a sequence of control points:
 * <p/>
 * cn(s) : s 1 .....columns
 * <p/>
 * From this sequence a vertical curve is calculated for "s", and evaluated at
 * "t". In most cases, the order of calculation (horizontal-vertical vs.
 * vertical-horizontal) does not make a difference. Where it does, the
 * horizontal- vertical order shall be the one used.
 * <p/>
 * Logically, any pair of curve interpolation types can lead to a subtype of
 * GriddedSurface. The following clauses define some most commonly encountered
 * surfaces that can be represented in this manner.
 * <p/>
 * Java class for AbstractGriddedSurfaceType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="AbstractGriddedSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractParametricCurveSurfaceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml}PointGrid"/>
 *         &lt;element name="rows" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="columns" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGriddedSurfaceType", propOrder = {
  "row",
  "rows",
  "columns"
})
@XmlSeeAlso({
  CylinderType.class,
  ConeType.class,
  SphereType.class
})
public class AbstractGriddedSurfaceType
  extends AbstractParametricCurveSurfaceType {

  @XmlElement(required = true)
  protected List<AbstractGriddedSurfaceType.Row> row;
  protected BigInteger rows;
  protected BigInteger columns;

  /**
   * Gets the value of the row property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the row property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRow().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link AbstractGriddedSurfaceType.Row }
   *
   *
   */
  public List<AbstractGriddedSurfaceType.Row> getRow() {
    if (row == null) {
      row = new ArrayList<AbstractGriddedSurfaceType.Row>();
    }
    return this.row;
  }

  public boolean isSetRow() {
    return ((this.row != null) && (!this.row.isEmpty()));
  }

  public void unsetRow() {
    this.row = null;
  }

  /**
   * Gets the value of the rows property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getRows() {
    return rows;
  }

  /**
   * Sets the value of the rows property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setRows(BigInteger value) {
    this.rows = value;
  }

  public boolean isSetRows() {
    return (this.rows != null);
  }

  /**
   * Gets the value of the columns property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getColumns() {
    return columns;
  }

  /**
   * Sets the value of the columns property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setColumns(BigInteger value) {
    this.columns = value;
  }

  public boolean isSetColumns() {
    return (this.columns != null);
  }

  /**
   * Java class for anonymous complex type.
   * <p/>
   * The following schema fragment specifies the expected content contained
   * within this class.
   * <p/>
   * <
   * pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;group ref="{http://www.opengis.net/gml}geometricPositionListGroup"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   * <p/>
   *
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
    "posList",
    "geometricPositionGroup"
  })
  public static class Row {

    protected DirectPositionListType posList;
    @XmlElements({
      @XmlElement(name = "pos", type = DirectPositionType.class),
      @XmlElement(name = "pointProperty", type = PointPropertyType.class)
    })
    protected List<Object> geometricPositionGroup;

    /**
     * Gets the value of the posList property.
     * <p/>
     * @return possible object is {@link DirectPositionListType }
     *
     */
    public DirectPositionListType getPosList() {
      return posList;
    }

    /**
     * Sets the value of the posList property.
     * <p/>
     * @param value allowed object is {@link DirectPositionListType }
     *
     */
    public void setPosList(DirectPositionListType value) {
      this.posList = value;
    }

    public boolean isSetPosList() {
      return (this.posList != null);
    }

    /**
     * Gets the value of the geometricPositionGroup property.
     * <p/>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the geometricPositionGroup property.
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometricPositionGroup().add(newItem);
     * </pre>
     * <p/>
     *
     * Objects of the following type(s) are allowed in the list null     {@link DirectPositionType }
         * {@link PointPropertyType }
     *
     *
     */
    public List<Object> getGeometricPositionGroup() {
      if (geometricPositionGroup == null) {
        geometricPositionGroup = new ArrayList<Object>();
      }
      return this.geometricPositionGroup;
    }

    public boolean isSetGeometricPositionGroup() {
      return ((this.geometricPositionGroup != null) && (!this.geometricPositionGroup.isEmpty()));
    }

    public void unsetGeometricPositionGroup() {
      this.geometricPositionGroup = null;
    }
  }
}
