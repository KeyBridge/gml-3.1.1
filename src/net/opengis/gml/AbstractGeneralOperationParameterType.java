package net.opengis.gml;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Abstract definition of a parameter or group of parameters used by an
 * operation method.
 * <p/>
 * Java class for AbstractGeneralOperationParameterType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractGeneralOperationParameterType">
 * &lt;complexContent> &lt;extension
 * base="{http://www.opengis.net/gml}DefinitionType"> &lt;sequence> &lt;element
 * ref="{http://www.opengis.net/gml}minimumOccurs" minOccurs="0"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralOperationParameterType", propOrder = {
  "minimumOccurs"
})
@XmlSeeAlso({
  OperationParameterGroupBaseType.class,
  OperationParameterBaseType.class
})
public abstract class AbstractGeneralOperationParameterType extends DefinitionType {

  @XmlSchemaType(name = "nonNegativeInteger")
  protected BigInteger minimumOccurs;

  /**
   * Gets the value of the minimumOccurs property.
   * <p/>
   * @return possible object is {@link BigInteger }
   *
   */
  public BigInteger getMinimumOccurs() {
    return minimumOccurs;
  }

  /**
   * Sets the value of the minimumOccurs property.
   * <p/>
   * @param value allowed object is {@link BigInteger }
   *
   */
  public void setMinimumOccurs(BigInteger value) {
    this.minimumOccurs = value;
  }

  public boolean isSetMinimumOccurs() {
    return (this.minimumOccurs != null);
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 89 * hash + Objects.hashCode(this.minimumOccurs);
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
    final AbstractGeneralOperationParameterType other = (AbstractGeneralOperationParameterType) obj;
    if (!Objects.equals(this.minimumOccurs, other.minimumOccurs)) {
      return false;
    }
    return true;
  }
}
