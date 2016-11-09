package com.wellnessstandard.client;

import java.util.logging.Logger;

import com.wellnessstandard.stubs.Bill;
import com.wellnessstandard.stubs.VerifyCardReturn;
import com.wellnessstandard.stubs.WellnessStandardWellnessServiceSoap;

public class CardServiceClient implements CardService {

	private static final Logger logger = Logger.getLogger(CardServiceClient.class.getName());
	
	private WellnessStandardWellnessServiceSoap wellnessStandardWellnessServiceSoap;
   	
	public VerifyCardReturn verifyCard(long myId, long yourId, String cardNumber) {
		logger.info(String.format("Invoke verifyCard method with parameters myId: %s & yourId: %s & cardNumber: %s",myId,yourId,cardNumber));
        logger.info("Invoking Web service Operation[verifyCard2]....");
        VerifyCardReturn verifyCardReturn = wellnessStandardWellnessServiceSoap.verifyCard2(myId, yourId, cardNumber);
        logger.info("Web service Operation [verifyCard2] returned: " + verifyCardReturn.toString() );
		return verifyCardReturn;
	}

	public int sendBillCard(long myId, long yourId, String cardNumber, Bill bill) {
		logger.info(String.format("Invoke sendBillCard method with parameters myId: %s & yourId: %s & cardNumber: %s & bill: %s",myId,yourId,cardNumber,bill));
        logger.info("Invoking Web service Operation[sendBillCard1]....");
        int sendBillCardResponse = wellnessStandardWellnessServiceSoap.sendBillCard1(myId, yourId, cardNumber, bill);
        logger.info("Web service Operation [sendBillCard1] returned: " + sendBillCardResponse);
		return sendBillCardResponse;
	}
	
	public int getVersion() {
		logger.info("Invoke getVersion method");
        logger.info("Invoking Web service Operation[getVersion]....");
        int version = wellnessStandardWellnessServiceSoap.getVersion();
        logger.info("Web service Operation [getVersion] returned: " + version);
		return version;
	}

	public WellnessStandardWellnessServiceSoap getWellnessStandardWellnessServiceSoap() {
		return wellnessStandardWellnessServiceSoap;
	}

	public void setWellnessStandardWellnessServiceSoap(WellnessStandardWellnessServiceSoap wellnessStandardWellnessServiceSoap) {
		this.wellnessStandardWellnessServiceSoap = wellnessStandardWellnessServiceSoap;
	}

}
