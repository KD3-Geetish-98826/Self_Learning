package com.exceptions;

public class ShippingUnavailableException extends ShippingException {

	public ShippingUnavailableException() {
	}

	public ShippingUnavailableException(String message) {
		super(message);
	}
}