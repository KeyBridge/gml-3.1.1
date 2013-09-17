



package org.w3._2000._09.xmldsig;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TransformsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TransformsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transform" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 * <p/>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformsType", propOrder = {
  "transform"
})
public class TransformsType {

  @XmlElement(name = "Transform", required = true)
  protected List<TransformType> transform;

  /**
   * Gets the value of the transform property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the transform property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getTransform().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p> Objects of the following type(s) are allowed in the list
     * {@link TransformType }
   * <p/>
   * <p/>
   */
  public List<TransformType> getTransform() {
    if (transform == null) {
      transform = new ArrayList<TransformType>();
    }
    return this.transform;
  }

  public boolean isSetTransform() {
    return ((this.transform != null) && (!this.transform.isEmpty()));
  }

  public void unsetTransform() {
    this.transform = null;
  }
}
