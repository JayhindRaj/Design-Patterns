package com.jay.behavioural.strategy;

import java.util.Date;

class DebitCreditPayment implements PaymentStrategy {
	private String cardNumber;
	private String cvvNumber;
	private Date expiryDate;
	private String chName;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public DebitCreditPayment(String cardNumber, String cvvNumber,
			Date expiryDate, String chName) {
		super();
		this.cardNumber = cardNumber;
		this.cvvNumber = cvvNumber;
		this.expiryDate = expiryDate;
		this.chName = chName;
	}

	@Override
	public void payment(double amount) {
		System.out.println(amount + " paid by " + chName
				+ " using credit/debit card");

	}

}
