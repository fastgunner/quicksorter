
// Java implementation of QuickSort
import java.io.*;

public class Quicksorter{

	// A utility function to swap two elements
	static void swap(int[] arey, int i, int j)
	{
		int temp = arey[i];
		arey[i] = arey[j];
		arey[j] = temp;
	}

	/* This function takes last element as pivot, places
the pivot element at its correct position in sorted
arey, and places all smaller (smaller than pivot)
to left of pivot and all greater elements to right
of pivot */
	static int partition(int[] arey, int low, int high)
	{

		// pivot
		int pivot = arey[high];

		// Index of smaller element and
		// indicates the right position
		// of pivot found so far
		int i = (low - 1);

		for(int j = low; j <= high - 1; j++)
		{

			// If current element is smaller
			// than the pivot
			if (arey[j] < pivot)
			{

				// Increment index of
				// smaller element
				i++;
				swap(arey, i, j);
			}
		}
		swap(arey, i + 1, high);
		return (i + 1);
	}

	/* The main function that implements QuickSort
		arey[] --> arey to be sorted,
		low --> Starting index,
		high --> Ending index
	 */
	static void quickSort(int[] arey, int low, int high)
	{
		if (low < high)
		{

			// pi is partitioning index, arey[p]
			// is now at right place
			int pi = partition(arey, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arey, low, pi - 1);
			quickSort(arey, pi + 1, high);
		}
	}

	// Function to print an arey
	static void printArey(int[] arey, int size)
	{
		for(int i = 0; i < size; i++)
			System.out.print(arey[i] + " ");

		System.out.println();
	}
}
