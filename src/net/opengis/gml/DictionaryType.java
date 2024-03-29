package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * A non-abstract bag that is specialized for use as a dictionary which contains
 * a set of definitions. These definitions are referenced from other places, in
 * the same and different XML documents. In this restricted type, the inherited
 * optional "description" element can be used for a description of this
 * dictionary. The inherited optional "name" element can be used for the name(s)
 * of this dictionary. The inherited "metaDataProperty" elements can be used to
 * reference or contain more information about this dictionary. The inherited
 * required gml:id attribute allows the dictionary to be referenced using this
 * handle.
 * <p/>
 * Java class for DictionaryType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="DictionaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}DefinitionType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml}dictionaryEntry"/>
 *           &lt;element ref="{http://www.opengis.net/gml}indirectEntry"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DictionaryType", propOrder = {
  "dictionaryEntryOrIndirectEntry"
})
public class DictionaryType
  extends DefinitionType {

  @XmlElementRefs({
    @XmlElementRef(name = "dictionaryEntry", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "indirectEntry", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  })
  protected List<JAXBElement<?>> dictionaryEntryOrIndirectEntry;

  /**
   * Gets the value of the dictionaryEntryOrIndirectEntry property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the dictionaryEntryOrIndirectEntry property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDictionaryEntryOrIndirectEntry().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link DictionaryEntryType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryEntryType }{@code >}
   * {@link JAXBElement }{@code <}{@link IndirectEntryType }{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<?>> getDictionaryEntryOrIndirectEntry() {
    if (dictionaryEntryOrIndirectEntry == null) {
      dictionaryEntryOrIndirectEntry = new ArrayList<JAXBElement<?>>();
    }
    return this.dictionaryEntryOrIndirectEntry;
  }

  public boolean isSetDictionaryEntryOrIndirectEntry() {
    return ((this.dictionaryEntryOrIndirectEntry != null) && (!this.dictionaryEntryOrIndirectEntry.isEmpty()));
  }

  public void unsetDictionaryEntryOrIndirectEntry() {
    this.dictionaryEntryOrIndirectEntry = null;
  }
}
