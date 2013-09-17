package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * A triangulated surface is a polyhedral surface that is composed only of
 * triangles. There is no restriction on how the triangulation is derived.
 * <p/>
 * <p>Java class for TriangulatedSurfaceType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TriangulatedSurfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml}SurfaceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml}StandardObjectProperties"/>
 *         &lt;element ref="{http://www.opengis.net/gml}trianglePatches"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriangulatedSurfaceType")
@XmlSeeAlso({
  TinType.class
})
public class TriangulatedSurfaceType
  extends SurfaceType {
}
