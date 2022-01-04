package sorting.selection_sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
		int sortedArr[] = selectionSort(arr);
		System.out.println(Arrays.toString(sortedArr));

	}

	private static int[] selectionSort(int[] arr) {
		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			int minIndex = i;
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}

			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
