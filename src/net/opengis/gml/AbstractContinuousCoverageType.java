package net.opengis.gml;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A continuous coverage as defined in ISO 19123 is a coverage that can return
 * different values for the same feature attribute at different direct positions
 * within a single spatiotemporal object in its spatiotemporal domain
 * <p/>
 * Java class for AbstractContinuousCoverageType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractContinuousCoverageType">
 * &lt;complexContent> &lt;extension
 * base="{http://www.opengis.net/gml}AbstractCoverageType"> &lt;sequence>
 * &lt;element ref="{http://www.opengis.net/gml}coverageFunction"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractContinuousCoverageType", propOrder = {
  "coverageFunction"
})
public abstract class AbstractContinuousCoverageType extends AbstractCoverageType {

  protected CoverageFunctionType coverageFunction;

  /**
   * Gets the value of the coverageFunction property.
   * <p/>
   * @return possible object is {@link CoverageFunctionType }
   *
   */
  public CoverageFunctionType getCoverageFunction() {
    return coverageFunction;
  }

  /**
   * Sets the value of the coverageFunction property.
   * <p/>
   * @param value allowed object is {@link CoverageFunctionType }
   *
   */
  public void setCoverageFunction(CoverageFunctionType value) {
    this.coverageFunction = value;
  }

  public boolean isSetCoverageFunction() {
    return (this.coverageFunction != null);
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 79 * hash + Objects.hashCode(this.coverageFunction);
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
    final AbstractContinuousCoverageType other = (AbstractContinuousCoverageType) obj;
    if (!Objects.equals(this.coverageFunction, other.coverageFunction)) {
      return false;
    }
    return true;
  }
}
