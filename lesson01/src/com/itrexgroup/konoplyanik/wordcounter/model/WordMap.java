package com.itrexgroup.konoplyanik.wordcounter.model;

import java.util.Map;

public class WordMap {
	private String text;
	private Map<String, Integer> map;
	
	public WordMap(String text) {
		this.text = text;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getText() {
		return text;
	}
	
}
