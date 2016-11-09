
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
 *         &lt;element name="myId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="yoursId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "myId",
    "yoursId",
    "cardNumber"
})
@XmlRootElement(name = "verifyCard_2")
public class VerifyCard2 {

    protected long myId;
    protected long yoursId;
    protected String cardNumber;

    /**
     * Gets the value of the myId property.
     * 
     */
    public long getMyId() {
        return myId;
    }

    /**
     * Sets the value of the myId property.
     * 
     */
    public void setMyId(long value) {
        this.myId = value;
    }

    /**
     * Gets the value of the yoursId property.
     * 
     */
    public long getYoursId() {
        return yoursId;
    }

    /**
     * Sets the value of the yoursId property.
     * 
     */
    public void setYoursId(long value) {
        this.yoursId = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

}
