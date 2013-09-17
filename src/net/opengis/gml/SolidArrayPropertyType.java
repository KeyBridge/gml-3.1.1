package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * A container for an array of solids. The elements are always contained in the
 * array property, referencing geometry elements or arrays of geometry elements
 * is not supported.
 * <p/>
 * Java class for SolidArrayPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="SolidArrayPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml}_Solid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidArrayPropertyType", propOrder = {
  "solid"
})
public class SolidArrayPropertyType {

  @XmlElementRef(name = "_Solid", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<? extends AbstractSolidType>> solid;

  /**
   * Gets the value of the solid property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the solid property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getSolid().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
   * {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<? extends AbstractSolidType>> getSolid() {
    if (solid == null) {
      solid = new ArrayList<JAXBElement<? extends AbstractSolidType>>();
    }
    return this.solid;
  }

  public boolean isSetSolid() {
    return ((this.solid != null) && (!this.solid.isEmpty()));
  }

  public void unsetSolid() {
    this.solid = null;
  }
}
