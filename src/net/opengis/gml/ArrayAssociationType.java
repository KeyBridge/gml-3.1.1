package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * A base for derived types used to specify complex types containing an array of
 * objects, by unspecified UML association - either composition or aggregation.
 * An instance of this type contains elements representing Objects.
 * <p/>
 * Ideally this type would be derived by extension of AssociationType. However,
 * this leads to a non-deterministic content model, since both the base and the
 * extension have minOccurs="0", and is thus prohibited in XML Schema.
 * <p/>
 * Java class for ArrayAssociationType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="ArrayAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}_Object" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayAssociationType", propOrder = {
  "object"
})
public class ArrayAssociationType {

  @XmlAnyElement
  protected List<Element> object;

  /**
   * Gets the value of the object property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the object property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getObject().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list {@link Element }
   *
   *
   */
  public List<Element> getObject() {
    if (object == null) {
      object = new ArrayList<Element>();
    }
    return this.object;
  }

  public boolean isSetObject() {
    return ((this.object != null) && (!this.object.isEmpty()));
  }

  public void unsetObject() {
    this.object = null;
  }
}
