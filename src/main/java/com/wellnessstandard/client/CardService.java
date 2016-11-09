package com.wellnessstandard.client;

import com.wellnessstandard.stubs.Bill;
import com.wellnessstandard.stubs.VerifyCardReturn;

public interface CardService {
	/**
	 * Verify Card
	 * @param myId
	 * @param yourId
	 * @param cardNumber
	 * @return {@link VerifyCardReturn}
	 */
	public VerifyCardReturn verifyCard(long myId, long yourId,String cardNumber);
	
	/**
	 * Send Bill Card
	 * @param myId
	 * @param yourId
	 * @param cardNumber
	 * @param bill
	 * @return int
	 */
	public int sendBillCard(long myId, long yourId,String cardNumber, Bill bill);
}
