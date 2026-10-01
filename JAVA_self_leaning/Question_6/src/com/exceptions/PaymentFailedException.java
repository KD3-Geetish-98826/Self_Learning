package com.exceptions;
public class PaymentFailedException extends PaymentException {

	public PaymentFailedException() {
	}

	public PaymentFailedException(String message) {
		super(message);
	}
}