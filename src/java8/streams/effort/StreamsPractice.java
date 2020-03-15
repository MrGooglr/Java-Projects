package java8.streams.effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractice {

	public static void main(String[] args) {

		/*
		 * BUBBLE SORT Simplest of the Sorting algo. NORMAL WAY
		 */

		int[] arr = { 2, 5, 6, 8, 1, 2, 3, 45, 56, 4, 1, 2, 3, 9, 8, 4 };

		boolean swapped;

		do {
			swapped = false;
			for (int i = 0; i < arr.length - 1; i++) {
				// putting smaller number in LHS
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					// Indicate Swapping occurs
					swapped = true;
				}
			}
		} while (swapped);// till swapping

		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println("\nUSING STREAMS (Sort of)");

		for (int x : bubbleSortUS(arr)) {
			System.out.print(x + " ");
		}

	}

	// Streams Way
	public static int[] bubbleSortUS(int[] arr) {
		IntStream.range(0, arr.length - 1).forEach(i -> {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		});
		return arr;
	}
}