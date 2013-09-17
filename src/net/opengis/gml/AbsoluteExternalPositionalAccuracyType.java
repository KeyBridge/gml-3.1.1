package net.opengis.gml;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Closeness of reported coordinate values to values accepted as or being true.
 * <p/>
 * Java class for AbsoluteExternalPositionalAccuracyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbsoluteExternalPositionalAccuracyType">
 * &lt;complexContent> &lt;extension
 * base="{http://www.opengis.net/gml}AbstractPositionalAccuracyType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}result"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbsoluteExternalPositionalAccuracyType", propOrder = {
  "result"
})
public class AbsoluteExternalPositionalAccuracyType
  extends AbstractPositionalAccuracyType {

  @XmlElement(required = true)
  protected MeasureType result;

  /**
   * Gets the value of the result property.
   * <p/>
   * @return possible object is {@link MeasureType }
   *
   */
  public MeasureType getResult() {
    return result;
  }

  /**
   * Sets the value of the result property.
   * <p/>
   * @param value allowed object is {@link MeasureType }
   *
   */
  public void setResult(MeasureType value) {
    this.result = value;
  }

  public boolean isSetResult() {
    return (this.result != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + Objects.hashCode(this.result);
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
    final AbsoluteExternalPositionalAccuracyType other = (AbsoluteExternalPositionalAccuracyType) obj;
    if (!Objects.equals(this.result, other.result)) {
      return false;
    }
    return true;
  }
}
