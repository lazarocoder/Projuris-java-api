package br.com.projuris;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyFindArray implements FindArray {
	public static void main(String[] args) {
		System.out.println("MyFindArray instanciada...");
	}

	public int findArray(int[] arrayA, int[] arrayB) {
		List<Integer> integersA = Arrays.stream(arrayA).boxed().collect(Collectors.<Integer>toList());
		List<Integer> integersB = Arrays.stream(arrayB).boxed().collect(Collectors.<Integer>toList());

		int keyFound = Collections.indexOfSubList(integersA, integersB);
		if (keyFound == -1) {
			return -1;
		}

		int listIntegerBLength = integersB.size();
		int keyAux = keyFound;
		int endKey = keyFound + listIntegerBLength;

		while (keyAux > -1) {
			for (int i = 0; i < endKey; i++) {
				integersA.set(i, null);
			}

			keyAux = Collections.indexOfSubList(integersA, integersB);
			if (keyAux > -1) {
				keyFound = keyAux;
				endKey = keyFound + listIntegerBLength;
			}
		}
		System.out.println(keyFound);
		return keyFound;
	}
}
