package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for RangeSetType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="RangeSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml}ValueArray" maxOccurs="unbounded"/>
 *         &lt;group ref="{http://www.opengis.net/gml}ScalarValueList" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml}DataBlock"/>
 *         &lt;element ref="{http://www.opengis.net/gml}File"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeSetType", propOrder = {
  "valueArray",
  "scalarValueList",
  "dataBlock",
  "file"
})
public class RangeSetType {

  @XmlElement(name = "ValueArray")
  protected List<ValueArrayType> valueArray;
  @XmlElementRefs({
    @XmlElementRef(name = "QuantityList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "CountList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "CategoryList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false),
    @XmlElementRef(name = "BooleanList", namespace = "http://www.opengis.net/gml", type = JAXBElement.class, required = false)
  })
  protected List<JAXBElement<?>> scalarValueList;
  @XmlElement(name = "DataBlock")
  protected DataBlockType dataBlock;
  @XmlElement(name = "File")
  protected FileType file;

  /**
   * each member _Value holds a tuple or "row" from the equivalent table Gets
   * the value of the valueArray property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the valueArray property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValueArray().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link ValueArrayType }
   *
   *
   */
  public List<ValueArrayType> getValueArray() {
    if (valueArray == null) {
      valueArray = new ArrayList<ValueArrayType>();
    }
    return this.valueArray;
  }

  public boolean isSetValueArray() {
    return ((this.valueArray != null) && (!this.valueArray.isEmpty()));
  }

  public void unsetValueArray() {
    this.valueArray = null;
  }

  /**
   * each list holds the complete set of one scalar component from the values -
   * i.e. a "column" from the equivalent table Gets the value of the
   * scalarValueList property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the scalarValueList property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getScalarValueList().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list null   {@link JAXBElement }{@code <}{@link MeasureOrNullListType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
   * {@link JAXBElement }{@code <}{@link CodeOrNullListType }{@code >}
   * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
   * <p/>
   *
   */
  public List<JAXBElement<?>> getScalarValueList() {
    if (scalarValueList == null) {
      scalarValueList = new ArrayList<JAXBElement<?>>();
    }
    return this.scalarValueList;
  }

  public boolean isSetScalarValueList() {
    return ((this.scalarValueList != null) && (!this.scalarValueList.isEmpty()));
  }

  public void unsetScalarValueList() {
    this.scalarValueList = null;
  }

  /**
   * Its tuple list holds the values as space-separated tuples each of which
   * contains comma-separated components, and the tuple structure is specified
   * using the rangeParameters property.
   * <p/>
   * @return possible object is {@link DataBlockType }
   *
   */
  public DataBlockType getDataBlock() {
    return dataBlock;
  }

  /**
   * Sets the value of the dataBlock property.
   * <p/>
   * @param value allowed object is {@link DataBlockType }
   *
   */
  public void setDataBlock(DataBlockType value) {
    this.dataBlock = value;
  }

  public boolean isSetDataBlock() {
    return (this.dataBlock != null);
  }

  /**
   * a reference to an external source for the data, together with a description
   * of how that external source is structured
   * <p/>
   * @return possible object is {@link FileType }
   *
   */
  public FileType getFile() {
    return file;
  }

  /**
   * Sets the value of the file property.
   * <p/>
   * @param value allowed object is {@link FileType }
   *
   */
  public void setFile(FileType value) {
    this.file = value;
  }

  public boolean isSetFile() {
    return (this.file != null);
  }
}
