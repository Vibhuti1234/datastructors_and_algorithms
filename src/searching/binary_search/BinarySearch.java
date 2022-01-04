package searching.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Provide the size of the array: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Provide the elements of the array: ");

		for (int i = 0; i < n; i++) {

			arr[i] = in.nextInt();

		}
		System.out.println("Array before sorting " + Arrays.toString(arr));
		int sortedArray[] = insertionSort(arr);
		System.out.println("Array after sorting " + Arrays.toString(sortedArray));
		System.out.println("Give the element to search \n");
		int element = in.nextInt();
		in.close();
		FoundResponse foundResponse = binarySearch(0, arr.length - 1, element, sortedArray);
		if (foundResponse.isFound()) {
			System.out.println("Element found at index " + foundResponse.getIndex() + " of the sorted array");
		} else {
			System.out.println("Element not found");
		}
	}

	private static FoundResponse binarySearch(int startIndex, int endIndex, int element, int[] arr) {

		if (startIndex > endIndex) {
			FoundResponse foundResponse = new FoundResponse();
			foundResponse.setFound(false);
			foundResponse.setIndex(-1);
			return foundResponse;
		} else {
			int mid = (int) Math.floor(((startIndex + endIndex) / 2));

			if (arr[mid] == element) {
				FoundResponse foundResponse = new FoundResponse();
				foundResponse.setFound(true);
				foundResponse.setIndex(mid);
				return foundResponse;
			} else if (arr[mid] < element) {
				return binarySearch(mid + 1, endIndex, element, arr);
			} else if (arr[mid] > element) {
				return binarySearch(startIndex, mid - 1, element, arr);
			}

		}
		FoundResponse foundResponse = new FoundResponse();
		foundResponse.setFound(false);
		foundResponse.setIndex(-1);
		return foundResponse;

	}

	private static int[] insertionSort(int[] arr) {
		int minElement, temp;
		for (int i = 1; i <= arr.length - 1; i++) {
			minElement = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > minElement) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}

		return arr;
	}

}
