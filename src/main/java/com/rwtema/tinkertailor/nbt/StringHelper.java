package com.rwtema.tinkertailor.nbt;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringHelper {
	public static String capFirst(String s) {
		if (s == null) return null;
		int n = s.length();
		if (n == 0) return s;
		if (n == 1) return s.toUpperCase();

		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	private final static LinkedHashMap<String, Integer> roman_numerals;

	static {
		roman_numerals = new LinkedHashMap<String, Integer>();

		roman_numerals.put("M", 1000);
		roman_numerals.put("CM", 900);
		roman_numerals.put("D", 500);
		roman_numerals.put("CD", 400);
		roman_numerals.put("C", 100);
		roman_numerals.put("XC", 90);
		roman_numerals.put("L", 50);
		roman_numerals.put("XL", 40);
		roman_numerals.put("X", 10);
		roman_numerals.put("IX", 9);
		roman_numerals.put("V", 5);
		roman_numerals.put("IV", 4);
		roman_numerals.put("I", 1);
	}

	public static String toRomanNumeral(int num) {
		int i = num;
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
			int value = entry.getValue();
			int mathes = i / value;
			for (int j = 0; j < mathes; j++) {
				builder.append(entry.getKey());
			}
			i = i % value;
		}
		return builder.toString();
	}
}
