
package com.esri.soap;

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
 *         &amp;lt;element name="MapTableDescription" type="{http://www.esri.com/schemas/ArcGIS/10.7}MapTableDescription"/&amp;gt;
 *         &amp;lt;element name="RowIDs" type="{http://www.esri.com/schemas/ArcGIS/10.7}ArrayOfInt"/&amp;gt;
 *         &amp;lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ImageType" type="{http://www.esri.com/schemas/ArcGIS/10.7}ImageType" minOccurs="0"/&amp;gt;
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
    "mapTableDescription",
    "rowIDs",
    "fieldName",
    "imageType"
})
@XmlRootElement(name = "QueryRasterValue2")
public class QueryRasterValue2_FeatureServer {

    @XmlElement(name = "MapName", required = true)
    protected String mapName;
    @XmlElement(name = "MapTableDescription", required = true)
    protected MapTableDescription mapTableDescription;
    @XmlElement(name = "RowIDs", required = true)
    protected ArrayOfInt rowIDs;
    @XmlElement(name = "FieldName")
    protected String fieldName;
    @XmlElement(name = "ImageType")
    protected ImageType imageType;

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
     * Gets the value of the mapTableDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MapTableDescription }
     *     
     */
    public MapTableDescription getMapTableDescription() {
        return mapTableDescription;
    }

    /**
     * Sets the value of the mapTableDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapTableDescription }
     *     
     */
    public void setMapTableDescription(MapTableDescription value) {
        this.mapTableDescription = value;
    }

    /**
     * Gets the value of the rowIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getRowIDs() {
        return rowIDs;
    }

    /**
     * Sets the value of the rowIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setRowIDs(ArrayOfInt value) {
        this.rowIDs = value;
    }

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the imageType property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImageType() {
        return imageType;
    }

    /**
     * Sets the value of the imageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImageType(ImageType value) {
        this.imageType = value;
    }

}
