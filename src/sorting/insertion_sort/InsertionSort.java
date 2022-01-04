package sorting.insertion_sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Provide the size of the array: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Provide the elements of the array: ");

		for (int i = 0; i < n; i++) {

			arr[i] = in.nextInt();

		}
		in.close();
		int sortedArray[] = insertionSort(arr);
		System.out.println("Sorted array is :" + Arrays.toString(sortedArray));
	}

	private static int[] insertionSort(int[] arr) {
		int minElement, temp;
		for (int i = 1; i <= arr.length - 1; i++) {
			minElement = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > minElement) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}

			}

		}

		return arr;
	}

}
 