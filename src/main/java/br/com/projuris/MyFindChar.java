package br.com.projuris;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyFindChar implements FindCharachter {

	public char findChar(String word) {
		Map<Character, Integer> mapRepeatedChar = new LinkedHashMap<Character, Integer>();
		char[] wordChars = word.toCharArray();

		for (char ch : wordChars) {
			if (mapRepeatedChar.containsKey(ch)) {
				int countRepeatedChar = mapRepeatedChar.get(ch);
				mapRepeatedChar.put(ch, ++countRepeatedChar);
			} else {
				mapRepeatedChar.put(ch, 1);
			}
		}

		return this.getFirstUniqueChar(mapRepeatedChar);
	}

	public char getFirstUniqueChar(Map<Character, Integer> mapRepeatedChar) {
		char resultChar = ' ';

		Entry<Character, Integer> resultSearch = mapRepeatedChar.entrySet().stream().filter(x -> x.getValue().equals(1))
				.findFirst().orElse(null);

		if (resultSearch != null) {
			resultChar = resultSearch.getKey();
		}

		return resultChar;
	}

}
