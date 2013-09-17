package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A proxy entry in a dictionary of definitions. An element of this type
 * contains a reference to a remote definition object. This entry is expected to
 * be convenient in allowing multiple elements in one XML document to contain
 * short (abbreviated XPointer) references, which are resolved to an external
 * definition provided in a Dictionary element in the same XML document.
 * <p/>
 * Java class for DefinitionProxyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DefinitionProxyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}definitionRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionProxyType", propOrder = {
  "definitionRef"
})
public class DefinitionProxyType
  extends DefinitionType {

  @XmlElement(required = true)
  protected ReferenceType definitionRef;

  /**
   * A reference to a remote entry in this dictionary, used when this dictionary
   * entry is identified to allow external references to this specific entry.
   * The remote entry referenced can be in a dictionary in the same or different
   * XML document.
   * <p/>
   * @return possible object is {@link ReferenceType }
   *
   */
  public ReferenceType getDefinitionRef() {
    return definitionRef;
  }

  /**
   * Sets the value of the definitionRef property.
   * <p/>
   * @param value allowed object is {@link ReferenceType }
   *
   */
  public void setDefinitionRef(ReferenceType value) {
    this.definitionRef = value;
  }

  public boolean isSetDefinitionRef() {
    return (this.definitionRef != null);
  }
}
