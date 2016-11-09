
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
 *         &lt;element name="sendBillCard_1Result" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sendBillCard1Result"
})
@XmlRootElement(name = "sendBillCard_1Response")
public class SendBillCard1Response {

    @XmlElement(name = "sendBillCard_1Result")
    protected int sendBillCard1Result;

    /**
     * Gets the value of the sendBillCard1Result property.
     * 
     */
    public int getSendBillCard1Result() {
        return sendBillCard1Result;
    }

    /**
     * Sets the value of the sendBillCard1Result property.
     * 
     */
    public void setSendBillCard1Result(int value) {
        this.sendBillCard1Result = value;
    }

}
