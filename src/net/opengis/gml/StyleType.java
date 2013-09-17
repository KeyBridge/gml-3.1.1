package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * [complexType of] Predefined concrete value of the top-level property.
 * Encapsulates all other styling information.
 * <p/>
 * Java class for StyleType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="StyleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractStyleType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}featureStyle" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}graphStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StyleType", propOrder = {
  "featureStyle",
  "graphStyle"
})
public class StyleType
  extends AbstractStyleType {

  @XmlElement(required = true)
  protected List<FeatureStylePropertyType> featureStyle;
  protected GraphStylePropertyType graphStyle;

  /**
   * Gets the value of the featureStyle property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the featureStyle property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFeatureStyle().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link FeatureStylePropertyType }
   *
   *
   */
  public List<FeatureStylePropertyType> getFeatureStyle() {
    if (featureStyle == null) {
      featureStyle = new ArrayList<FeatureStylePropertyType>();
    }
    return this.featureStyle;
  }

  public boolean isSetFeatureStyle() {
    return ((this.featureStyle != null) && (!this.featureStyle.isEmpty()));
  }

  public void unsetFeatureStyle() {
    this.featureStyle = null;
  }

  /**
   * Gets the value of the graphStyle property.
   * <p/>
   * @return possible object is {@link GraphStylePropertyType }
   *
   */
  public GraphStylePropertyType getGraphStyle() {
    return graphStyle;
  }

  /**
   * Sets the value of the graphStyle property.
   * <p/>
   * @param value allowed object is {@link GraphStylePropertyType }
   *
   */
  public void setGraphStyle(GraphStylePropertyType value) {
    this.graphStyle = value;
  }

  public boolean isSetGraphStyle() {
    return (this.graphStyle != null);
  }
}
