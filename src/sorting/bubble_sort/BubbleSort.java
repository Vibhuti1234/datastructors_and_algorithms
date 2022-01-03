package sorting.bubble_sort;

import java.util.Scanner;

public class BubbleSort {

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
		int sortedArr[] = bubbleSort(arr);
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.println("\n");
			System.out.println(sortedArr[i]);

		}

	}

	private static int[] bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - 2 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

		return arr;
	}

}
