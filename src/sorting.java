import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {

		int arr[] = { -10,9, 2, 1, 5, 8, 12, 41, 0, -5, 11, 1, 2, 3, 4, 5 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	public static void selectionSort(int a[]) {
		int totalComparisons = 0;
		for ( int i = 0; i < a.length; i++) {
			
			int smallestIndex = i;
			
			for (int j = i; j < a.length; j++) {
				totalComparisons++;
				if (a[j] < a[smallestIndex]) {
					smallestIndex = j;
				}
			}
			
			swap(a, i, smallestIndex);
		}
		System.out.println(totalComparisons);
	}
	
	public static void bubbleSort(int a[]) {
		int totalComparisons = 0;

		for (int i = 0; i < a.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				totalComparisons++;
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		System.out.println(totalComparisons);
	}
}
