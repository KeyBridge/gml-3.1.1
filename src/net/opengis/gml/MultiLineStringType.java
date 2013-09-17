package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A MultiLineString is defined by one or more LineStrings, referenced through
 * lineStringMember elements. Deprecated with GML version 3.0. Use
 * MultiCurveType instead.
 * <p/>
 * Java class for MultiLineStringType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="MultiLineStringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractGeometricAggregateType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}lineStringMember" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLineStringType", propOrder = {
  "lineStringMember"
})
public class MultiLineStringType
  extends AbstractGeometricAggregateType {

  protected List<LineStringPropertyType> lineStringMember;

  /**
   * Gets the value of the lineStringMember property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the lineStringMember property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLineStringMember().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link LineStringPropertyType }
   *
   *
   */
  public List<LineStringPropertyType> getLineStringMember() {
    if (lineStringMember == null) {
      lineStringMember = new ArrayList<LineStringPropertyType>();
    }
    return this.lineStringMember;
  }

  public boolean isSetLineStringMember() {
    return ((this.lineStringMember != null) && (!this.lineStringMember.isEmpty()));
  }

  public void unsetLineStringMember() {
    this.lineStringMember = null;
  }
}
