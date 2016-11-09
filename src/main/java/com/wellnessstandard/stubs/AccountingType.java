
package com.wellnessstandard.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nameOfAccountingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingType", propOrder = {
    "accountingTypeCode",
    "id",
    "nameOfAccountingType"
})
public class AccountingType {

    protected String accountingTypeCode;
    protected int id;
    protected String nameOfAccountingType;

    public AccountingType(String string, int i, String string2) {
		accountingTypeCode = string;
		// TODO Auto-generated constructor stub
		id = i;
		nameOfAccountingType = string2;
	}

	public AccountingType() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Gets the value of the accountingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingTypeCode() {
        return accountingTypeCode;
    }

    /**
     * Sets the value of the accountingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingTypeCode(String value) {
        this.accountingTypeCode = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the nameOfAccountingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfAccountingType() {
        return nameOfAccountingType;
    }

    /**
     * Sets the value of the nameOfAccountingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfAccountingType(String value) {
        this.nameOfAccountingType = value;
    }

	@Override
	public String toString() {
		return "AccountingType [accountingTypeCode=" + accountingTypeCode + ", id=" + id + ", nameOfAccountingType="
				+ nameOfAccountingType + "]";
	}
}
