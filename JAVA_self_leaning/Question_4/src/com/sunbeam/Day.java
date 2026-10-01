package com.sunbeam;

public enum Day {

	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;

	public boolean isWeekend() {
		return this == SATURDAY || this == SUNDAY;
	}

	public boolean isWeekday() {
		return this != SATURDAY && this != SUNDAY;
	}
}