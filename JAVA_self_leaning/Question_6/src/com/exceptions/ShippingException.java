package com.exceptions;

public class ShippingException extends ECommerceException {

	public ShippingException() {
	}

	public ShippingException(String message) {
		super(message);
	}
}