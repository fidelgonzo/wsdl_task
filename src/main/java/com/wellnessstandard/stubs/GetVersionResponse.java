
package com.wellnessstandard.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getVersionResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getVersionResult"
})
@XmlRootElement(name = "getVersionResponse")
public class GetVersionResponse {

    protected int getVersionResult;

    /**
     * Gets the value of the getVersionResult property.
     * 
     */
    public int getGetVersionResult() {
        return getVersionResult;
    }

    /**
     * Sets the value of the getVersionResult property.
     * 
     */
    public void setGetVersionResult(int value) {
        this.getVersionResult = value;
    }

}
