package com.exceptions;

public class InventoryException extends ECommerceException {

	public InventoryException() {
	}

	public InventoryException(String message) {
		super(message);
	}
}