package com.itrexgroup.konoplyanik.wordcounter.service;

import java.io.*;
import java.util.*;
import com.itrexgroup.konoplyanik.wordcounter.model.WordMap;


public class TextService {
	private WordMap words;
	//private Map<String, Integer> map;
	
	public void inputFromConsole() {
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
		words = new WordMap(text);
	}
	
	public void parseText() {
		Map<String, Integer> map = new HashMap<>();
		for(String s : words.getText().split("\\W*\\s+")) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			}else {
				map.put(s, 1);
			}
		}
		words.setMap(map);
	}
	
	public void outputWordMap() {
		System.out.println("The list of unique words and their quantity: ");
		System.out.println();
		for(Map.Entry<String, Integer> pair : words.getMap().entrySet()) {
			System.out.printf("%s - %d\n", pair.getKey(), pair.getValue());
		}
	}
}
