package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * A discrete coverage type whose domain is defined by a collection of surface
 * patches (includes polygons, triangles, rectangles, etc).
 * <p/>
 * Java class for MultiSurfaceCoverageType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="MultiSurfaceCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml}AbstractDiscreteCoverageType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml}StandardObjectProperties"/>
 *         &lt;element ref="{http://www.opengis.net/gml}boundedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml}multiSurfaceDomain"/>
 *         &lt;element ref="{http://www.opengis.net/gml}rangeSet"/>
 *         &lt;element ref="{http://www.opengis.net/gml}coverageFunction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSurfaceCoverageType")
public class MultiSurfaceCoverageType
  extends AbstractDiscreteCoverageType {
}
