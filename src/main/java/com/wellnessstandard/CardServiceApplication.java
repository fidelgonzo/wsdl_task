package com.wellnessstandard;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import com.wellnessstandard.client.CardService;
import com.wellnessstandard.stubs.Bill;

public class CardServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		CardService cardService = (CardService) context.getBean("cardServiceClient");
		cardService.verifyCard(11, 22, "207438975");
		cardService.sendBillCard(11, 22, "207438975", new Bill());
		cardService.getVersion();
	}

}
