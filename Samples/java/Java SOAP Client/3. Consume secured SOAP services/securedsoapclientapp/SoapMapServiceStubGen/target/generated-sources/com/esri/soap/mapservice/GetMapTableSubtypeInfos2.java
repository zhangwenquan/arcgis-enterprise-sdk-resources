
package com.esri.soap.mapservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MapName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="LayerDescriptions" type="{http://www.esri.com/schemas/ArcGIS/2.6.0}ArrayOfLayerDescription" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mapName",
    "layerDescriptions"
})
@XmlRootElement(name = "GetMapTableSubtypeInfos2")
public class GetMapTableSubtypeInfos2 {

    @XmlElement(name = "MapName", required = true)
    protected String mapName;
    @XmlElement(name = "LayerDescriptions")
    protected ArrayOfLayerDescription layerDescriptions;

    /**
     * Gets the value of the mapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * Sets the value of the mapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapName(String value) {
        this.mapName = value;
    }

    /**
     * Gets the value of the layerDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLayerDescription }
     *     
     */
    public ArrayOfLayerDescription getLayerDescriptions() {
        return layerDescriptions;
    }

    /**
     * Sets the value of the layerDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLayerDescription }
     *     
     */
    public void setLayerDescriptions(ArrayOfLayerDescription value) {
        this.layerDescriptions = value;
    }

}
