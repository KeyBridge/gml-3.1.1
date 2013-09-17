package net.opengis.gml;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A discrete coverage consists of a domain set, range set and optionally a
 * coverage function. The domain set consists of either geometry or temporal
 * objects, finite in number. The range set is comprised of a finite number of
 * attribute values each of which is associated to every direct position within
 * any single spatiotemporal object in the domain. In other words, the range
 * values are constant on each spatiotemporal object in the domain. This
 * coverage function maps each element from the coverage domain to an element in
 * its range. This definition conforms to ISO 19123.
 * <p/>
 * Java class for AbstractDiscreteCoverageType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="AbstractDiscreteCoverageType"> &lt;complexContent>
 * &lt;extension base="{http://www.opengis.net/gml}AbstractCoverageType">
 * &lt;sequence> &lt;element ref="{http://www.opengis.net/gml}coverageFunction"
 * minOccurs="0"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDiscreteCoverageType", propOrder = {
  "coverageFunction"
})
@XmlSeeAlso({
  MultiSolidCoverageType.class,
  GridCoverageType.class,
  RectifiedGridCoverageType.class,
  MultiCurveCoverageType.class,
  MultiPointCoverageType.class,
  MultiSurfaceCoverageType.class
})
public abstract class AbstractDiscreteCoverageType extends AbstractCoverageType {

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
    int hash = 7;
    hash = 43 * hash + Objects.hashCode(this.coverageFunction);
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
    final AbstractDiscreteCoverageType other = (AbstractDiscreteCoverageType) obj;
    if (!Objects.equals(this.coverageFunction, other.coverageFunction)) {
      return false;
    }
    return true;
  }
}
