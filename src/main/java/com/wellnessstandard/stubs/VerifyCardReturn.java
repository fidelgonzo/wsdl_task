
package com.wellnessstandard.stubs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifyCardReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifyCardReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="blockedAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="uncontrolledAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fullCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="exhaustedCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="freeCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="accommodateGuest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifyCardReturn", propOrder = {
    "validCard",
    "blockedAccount",
    "uncontrolledAccount",
    "fullCredit",
    "exhaustedCredit",
    "freeCredit",
    "accommodateGuest"
})
public class VerifyCardReturn {

    protected boolean validCard;
    protected boolean blockedAccount;
    protected boolean uncontrolledAccount;
    @XmlElement(required = true)
    protected BigDecimal fullCredit;
    @XmlElement(required = true)
    protected BigDecimal exhaustedCredit;
    @XmlElement(required = true)
    protected BigDecimal freeCredit;
    protected boolean accommodateGuest;

    /**
     * Gets the value of the validCard property.
     * 
     */
    public boolean isValidCard() {
        return validCard;
    }

    /**
     * Sets the value of the validCard property.
     * 
     */
    public void setValidCard(boolean value) {
        this.validCard = value;
    }

    /**
     * Gets the value of the blockedAccount property.
     * 
     */
    public boolean isBlockedAccount() {
        return blockedAccount;
    }

    /**
     * Sets the value of the blockedAccount property.
     * 
     */
    public void setBlockedAccount(boolean value) {
        this.blockedAccount = value;
    }

    /**
     * Gets the value of the uncontrolledAccount property.
     * 
     */
    public boolean isUncontrolledAccount() {
        return uncontrolledAccount;
    }

    /**
     * Sets the value of the uncontrolledAccount property.
     * 
     */
    public void setUncontrolledAccount(boolean value) {
        this.uncontrolledAccount = value;
    }

    /**
     * Gets the value of the fullCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullCredit() {
        return fullCredit;
    }

    /**
     * Sets the value of the fullCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullCredit(BigDecimal value) {
        this.fullCredit = value;
    }

    /**
     * Gets the value of the exhaustedCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExhaustedCredit() {
        return exhaustedCredit;
    }

    /**
     * Sets the value of the exhaustedCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExhaustedCredit(BigDecimal value) {
        this.exhaustedCredit = value;
    }

    /**
     * Gets the value of the freeCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreeCredit() {
        return freeCredit;
    }

    /**
     * Sets the value of the freeCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreeCredit(BigDecimal value) {
        this.freeCredit = value;
    }

    /**
     * Gets the value of the accommodateGuest property.
     * 
     */
    public boolean isAccommodateGuest() {
        return accommodateGuest;
    }

    /**
     * Sets the value of the accommodateGuest property.
     * 
     */
    public void setAccommodateGuest(boolean value) {
        this.accommodateGuest = value;
    }

	@Override
	public String toString() {
		return "VerifyCardReturn [validCard=" + validCard + ", blockedAccount=" + blockedAccount
				+ ", uncontrolledAccount=" + uncontrolledAccount + ", fullCredit=" + fullCredit + ", exhaustedCredit="
				+ exhaustedCredit + ", freeCredit=" + freeCredit + ", accommodateGuest=" + accommodateGuest + "]";
	}
}
