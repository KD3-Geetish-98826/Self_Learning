package com.exceptions;

public class InsufficientStockException extends InventoryException {

	public InsufficientStockException() {
	}

	public InsufficientStockException(String message) {
		super(message);
	}
}