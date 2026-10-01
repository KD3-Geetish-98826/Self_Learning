package com.subeam.domain;

public class TextAnalyzer {

	private String text;
	private int vowels;
	private int consonants;
	private int digits;
	private int spaces;
	private int specialCharacters;

	public TextAnalyzer() {
	}

	public TextAnalyzer(String text) {
		this.text = text;
		analyze();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		analyze();
	}

	public int getVowels() {
		return vowels;
	}

	public int getConsonants() {
		return consonants;
	}

	public int getDigits() {
		return digits;
	}

	public int getSpaces() {
		return spaces;
	}

	public int getSpecialCharacters() {
		return specialCharacters;
	}

	public void analyze() {

		vowels = 0;
		consonants = 0;
		digits = 0;
		spaces = 0;
		specialCharacters = 0;

		for (int i = 0; i < text.length(); i++) {

			char ch = text.charAt(i);

			if (Character.isLetter(ch)) {

				if (ch == 'a' || ch == 'e' || ch == 'i' ||
					ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' ||
					ch == 'O' || ch == 'U') {

					vowels++;
				} else {
					consonants++;
				}

			} else if (Character.isDigit(ch)) {

				digits++;

			} else if (Character.isWhitespace(ch)) {

				spaces++;

			} else {

				specialCharacters++;
			}
		}
	}

	public int getTotalCharacters() {
		return text.length();
	}

	public void printStatistics() {

		System.out.println("\n TEXT STATISTICS");
		System.out.println("Text              : " + text);
		System.out.println("Total Characters  : " + getTotalCharacters());
		System.out.println("Vowels            : " + vowels);
		System.out.println("Consonants        : " + consonants);
		System.out.println("Digits            : " + digits);
		System.out.println("Spaces            : " + spaces);
		System.out.println("Special Characters: " + specialCharacters);
		System.out.println();
	}
}
