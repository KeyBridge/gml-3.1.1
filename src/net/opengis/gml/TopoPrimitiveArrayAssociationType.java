package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * This type supports embedding an array of topological primitives in a
 * TopoComplex
 * <p/>
 * <p>Java class for TopoPrimitiveArrayAssociationType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TopoPrimitiveArrayAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/gml}_TopoPrimitive"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoPrimitiveArrayAssociationType", propOrder = {
  "topoPrimitive"
})
public class TopoPrimitiveArrayAssociationType {

  @XmlElementRef(name = "_TopoPrimitive", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  protected List<JAXBElement<? extends AbstractTopoPrimitiveType>> topoPrimitive;

  /**
   * Gets the value of the topoPrimitive property.
   * <p/>
   * <p> This accessor method returns a reference to the live list, not a
   * snapshot. Therefore any modification you make to the returned list will be
   * present inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the topoPrimitive property.
   * <p/>
   * <p> For example, to add a new item, do as follows:
   * <pre>
   *    getTopoPrimitive().add(newItem);
   * </pre>
   * <p/>
   *
   * <p> Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link NodeType }{@code >}
   * {@link JAXBElement }{@code <}{@link FaceType }{@code >}
   * {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}
   * {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<? extends AbstractTopoPrimitiveType>> getTopoPrimitive() {
    if (topoPrimitive == null) {
      topoPrimitive = new ArrayList<JAXBElement<? extends AbstractTopoPrimitiveType>>();
    }
    return this.topoPrimitive;
  }

  public boolean isSetTopoPrimitive() {
    return ((this.topoPrimitive != null) && (!this.topoPrimitive.isEmpty()));
  }

  public void unsetTopoPrimitive() {
    this.topoPrimitive = null;
  }
}
