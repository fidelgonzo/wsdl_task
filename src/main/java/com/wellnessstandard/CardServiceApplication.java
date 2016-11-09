package com.wellnessstandard;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;

import com.wellnessstandard.client.CardService;
import com.wellnessstandard.stubs.AccountingType;
import com.wellnessstandard.stubs.ArrayOfBillItem;
import com.wellnessstandard.stubs.Bill;
import com.wellnessstandard.stubs.BillItem;
import com.wellnessstandard.stubs.VerifyCardReturn;

public class CardServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		CardService cardService = (CardService) context.getBean("cardServiceClient");
		VerifyCardReturn verifyCardReturn = cardService.verifyCard(11, 22, "207438975");

		System.out.println(cardService.getVersion());

		Bill bill = new Bill();
		bill.setAccountingType(new AccountingType("code", 1, "name"));
		bill.setAmount(new BigDecimal(1));
		ArrayOfBillItem items = new ArrayOfBillItem();
		BillItem newItem = new BillItem(
				"nameOfBillItem",
				123,
				new BigDecimal(2),
				new BigDecimal(2),
				new BigDecimal(1.0),
				new BigDecimal(0.2),
				new BigDecimal(1)
				);
		items.getBillItem().add(newItem);
		bill.setBillItems(items);
		bill.setBillNumber(999);
		bill.setCurrencyCode("EUR");
		bill.setIdBill(555L);
//		bill.setIdHotelGuest(value);
		bill.setNumberOfCashDesk(6);
		int response = cardService.sendBillCard(11, 22, "207438975", bill);
		
		verifyCardReturn = cardService.verifyCard(11, 22, "207438975");
	}

}
