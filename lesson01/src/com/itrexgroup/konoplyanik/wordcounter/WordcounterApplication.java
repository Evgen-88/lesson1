package com.itrexgroup.konoplyanik.wordcounter;

import com.itrexgroup.konoplyanik.wordcounter.service.TextService;

/*
 * Задан текст на английском языке. Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 */

public class WordcounterApplication {
	
	public static void main(String[] args) {
		TextService.outputWordMap();
	}
	
}
