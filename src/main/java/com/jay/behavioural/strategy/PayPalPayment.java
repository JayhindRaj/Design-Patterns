package com.jay.behavioural.strategy;

class PayPalPayment implements PaymentStrategy {

	private String emailId;
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	private String pswd;

	public PayPalPayment(String email, String pswd) {
		this.emailId = email;
		this.pswd = pswd;
	}

	@Override
	public void payment(double amount) {
		System.out.println(amount + " paid by Paypal..");
	}
}
