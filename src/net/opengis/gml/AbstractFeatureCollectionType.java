package net.opengis.gml;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A feature collection contains zero or more features.
 * <p/>
 * Java class for AbstractFeatureCollectionType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractFeatureCollectionType">
 * &lt;complexContent> &lt;extension
 * base="{http://www.opengis.net/gml}AbstractFeatureType"> &lt;sequence>
 * &lt;element ref="{http://www.opengis.net/gml}featureMember"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;element
 * ref="{http://www.opengis.net/gml}featureMembers" minOccurs="0"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureCollectionType", propOrder = {
  "featureMember",
  "featureMembers"
})
@XmlSeeAlso({
  FeatureCollectionType.class
})
public abstract class AbstractFeatureCollectionType extends AbstractFeatureType {

  protected List<FeaturePropertyType> featureMember;
  protected FeatureArrayPropertyType featureMembers;

  /**
   * Gets the value of the featureMember property.
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the featureMember property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFeatureMember().add(newItem);
   * </pre>
   * <p/>
   *
   * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
   *
   *
   */
  public List<FeaturePropertyType> getFeatureMember() {
    if (featureMember == null) {
      featureMember = new ArrayList<FeaturePropertyType>();
    }
    return this.featureMember;
  }

  public boolean isSetFeatureMember() {
    return ((this.featureMember != null) && (!this.featureMember.isEmpty()));
  }

  public void unsetFeatureMember() {
    this.featureMember = null;
  }

  /**
   * Gets the value of the featureMembers property.
   * <p/>
   * @return possible object is {@link FeatureArrayPropertyType }
   *
   */
  public FeatureArrayPropertyType getFeatureMembers() {
    return featureMembers;
  }

  /**
   * Sets the value of the featureMembers property.
   * <p/>
   * @param value allowed object is {@link FeatureArrayPropertyType }
   *
   */
  public void setFeatureMembers(FeatureArrayPropertyType value) {
    this.featureMembers = value;
  }

  public boolean isSetFeatureMembers() {
    return (this.featureMembers != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 37 * hash + Objects.hashCode(this.featureMember);
    hash = 37 * hash + Objects.hashCode(this.featureMembers);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final AbstractFeatureCollectionType other = (AbstractFeatureCollectionType) obj;
    if (!Objects.equals(this.featureMember, other.featureMember)) {
      return false;
    }
    if (!Objects.equals(this.featureMembers, other.featureMembers)) {
      return false;
    }
    return true;
  }
}
