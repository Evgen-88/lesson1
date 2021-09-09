package com.itrexgroup.konoplyanik.wordcounter.service;

import java.io.*;
import java.util.*;
import com.itrexgroup.konoplyanik.wordcounter.model.WordMap;


public class TextService {
	private static WordMap words = new WordMap(inputFromConsole());
	private static Map<String, Integer> map = parseText();
	
	private static String inputFromConsole() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type text (to input text type \">\"-key in new line and press Enter): ");
		String text = "";
		try {
			while(true) {
				String line = reader.readLine();
				if(line.equals(">"))
					break;
				text += (line + " ");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		return text;
	}
	
	private static Map<String, Integer> parseText() {
		Map<String, Integer> map = new HashMap<>();
		for(String s : words.getText().split("\\W*\\s+")) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			}else {
				map.put(s, 1);
			}
		}
		return map;
	}
	
	public static void outputWordMap() {
		System.out.println("The list of unique words and their quantity: ");
		System.out.println();
		for(Map.Entry<String, Integer> pair : map.entrySet()) {
			System.out.printf("%s - %d\n", pair.getKey(), pair.getValue());
		}
	}
}
