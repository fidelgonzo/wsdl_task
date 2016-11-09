package com.wellnessstandard.client.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wellnessstandard.client.CardService;
import com.wellnessstandard.stubs.Bill;
import com.wellnessstandard.stubs.VerifyCardReturn;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/resources/spring-beans.xml"})
public class CardServiceTest {

	@Autowired
	@Qualifier("cardServiceClient")
	CardService cardService;
	
	@Test
	public void verifyCardTest(){
		VerifyCardReturn verifyCardReturn = cardService.verifyCard(11, 22, "207438975");
		Assert.assertEquals(true,verifyCardReturn.isValidCard());
	}
	
	@Test
	public void verifyCardFailedTest(){
		VerifyCardReturn verifyCardReturn = cardService.verifyCard(11, 22, "2074389744");
		Assert.assertEquals(false,verifyCardReturn.isValidCard());
	}
	
	@Test
	public void sendBillCardTest(){
		int response = cardService.sendBillCard(11, 22, "207438975",new Bill());
		Assert.assertEquals(0,response);
	}
}
