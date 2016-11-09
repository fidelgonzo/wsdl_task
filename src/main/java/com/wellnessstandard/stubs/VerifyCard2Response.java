
package com.wellnessstandard.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="verifyCard_2Result" type="{http://wellness.wellnessStandard.assol.sk}VerifyCardReturn" minOccurs="0"/>
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
    "verifyCard2Result"
})
@XmlRootElement(name = "verifyCard_2Response")
public class VerifyCard2Response {

    @XmlElement(name = "verifyCard_2Result")
    protected VerifyCardReturn verifyCard2Result;

    /**
     * Gets the value of the verifyCard2Result property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyCardReturn }
     *     
     */
    public VerifyCardReturn getVerifyCard2Result() {
        return verifyCard2Result;
    }

    /**
     * Sets the value of the verifyCard2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyCardReturn }
     *     
     */
    public void setVerifyCard2Result(VerifyCardReturn value) {
        this.verifyCard2Result = value;
    }

}
