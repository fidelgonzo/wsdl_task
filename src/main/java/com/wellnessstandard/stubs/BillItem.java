
package com.wellnessstandard.stubs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="idPlu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nameOfBillItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="vat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="accountingType" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillItem", propOrder = {
    "amount",
    "idPlu",
    "nameOfBillItem",
    "quantity",
    "unitPrice",
    "vat",
    "accountingType"
})
public class BillItem {

    @XmlElement(required = true)
    protected BigDecimal amount;
    protected int idPlu;
    protected String nameOfBillItem;
    @XmlElement(required = true)
    protected BigDecimal quantity;
    @XmlElement(required = true)
    protected BigDecimal unitPrice;
    @XmlElement(required = true)
    protected BigDecimal vat;
    @XmlElement(required = true)
    protected BigDecimal accountingType;

	public BillItem(String name, int PLU, BigDecimal amount, BigDecimal quantity, BigDecimal unitPrice, BigDecimal vat, BigDecimal accountingType) {
		nameOfBillItem = name;
		idPlu = PLU;
		this.amount = amount;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.vat = vat;
		this.accountingType = accountingType;
	}

	public BillItem() {
		// TODO Auto-generated constructor stub
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
     * Gets the value of the idPlu property.
     * 
     */
    public int getIdPlu() {
        return idPlu;
    }

    /**
     * Sets the value of the idPlu property.
     * 
     */
    public void setIdPlu(int value) {
        this.idPlu = value;
    }

    /**
     * Gets the value of the nameOfBillItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfBillItem() {
        return nameOfBillItem;
    }

    /**
     * Sets the value of the nameOfBillItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfBillItem(String value) {
        this.nameOfBillItem = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVat(BigDecimal value) {
        this.vat = value;
    }

    /**
     * Gets the value of the accountingType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountingType() {
        return accountingType;
    }

    /**
     * Sets the value of the accountingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountingType(BigDecimal value) {
        this.accountingType = value;
    }

	@Override
	public String toString() {
		return "BillItem [amount=" + amount + ", idPlu=" + idPlu + ", nameOfBillItem=" + nameOfBillItem + ", quantity="
				+ quantity + ", unitPrice=" + unitPrice + ", vat=" + vat + ", accountingType=" + accountingType + "]";
	}
}
