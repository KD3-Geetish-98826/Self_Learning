package com.exceptions;

public class PaymentException extends ECommerceException {

	public PaymentException() {
	}

	public PaymentException(String message) {
		super(message);
	}
}