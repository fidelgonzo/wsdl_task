
package com.wellnessstandard.stubs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Bill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountingType" type="{http://wellness.wellnessStandard.assol.sk}AccountingType" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="billItems" type="{http://wellness.wellnessStandard.assol.sk}ArrayOfBillItem" minOccurs="0"/>
 *         &lt;element name="billNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idBill" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idHotelGuest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numberOfCashDesk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bill", propOrder = {
    "accountingType",
    "amount",
    "billItems",
    "billNumber",
    "created",
    "currencyCode",
    "idBill",
    "idHotelGuest",
    "numberOfCashDesk"
})
public class Bill {

    protected AccountingType accountingType;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected ArrayOfBillItem billItems;
    protected int billNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected String currencyCode;
    protected long idBill;
    protected int idHotelGuest;
    protected int numberOfCashDesk;

    /**
     * Gets the value of the accountingType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingType }
     *     
     */
    public AccountingType getAccountingType() {
        return accountingType;
    }

    /**
     * Sets the value of the accountingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingType }
     *     
     */
    public void setAccountingType(AccountingType value) {
        this.accountingType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the billItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillItem }
     *     
     */
    public ArrayOfBillItem getBillItems() {
        return billItems;
    }

    /**
     * Sets the value of the billItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillItem }
     *     
     */
    public void setBillItems(ArrayOfBillItem value) {
        this.billItems = value;
    }

    /**
     * Gets the value of the billNumber property.
     * 
     */
    public int getBillNumber() {
        return billNumber;
    }

    /**
     * Sets the value of the billNumber property.
     * 
     */
    public void setBillNumber(int value) {
        this.billNumber = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the idBill property.
     * 
     */
    public long getIdBill() {
        return idBill;
    }

    /**
     * Sets the value of the idBill property.
     * 
     */
    public void setIdBill(long value) {
        this.idBill = value;
    }

    /**
     * Gets the value of the idHotelGuest property.
     * 
     */
    public int getIdHotelGuest() {
        return idHotelGuest;
    }

    /**
     * Sets the value of the idHotelGuest property.
     * 
     */
    public void setIdHotelGuest(int value) {
        this.idHotelGuest = value;
    }

    /**
     * Gets the value of the numberOfCashDesk property.
     * 
     */
    public int getNumberOfCashDesk() {
        return numberOfCashDesk;
    }

    /**
     * Sets the value of the numberOfCashDesk property.
     * 
     */
    public void setNumberOfCashDesk(int value) {
        this.numberOfCashDesk = value;
    }

	@Override
	public String toString() {
		return "Bill [accountingType=" + accountingType + ", amount=" + amount + ", billItems=" + billItems
				+ ", billNumber=" + billNumber + ", created=" + created + ", currencyCode=" + currencyCode + ", idBill="
				+ idBill + ", idHotelGuest=" + idHotelGuest + ", numberOfCashDesk=" + numberOfCashDesk + "]";
	}
}
