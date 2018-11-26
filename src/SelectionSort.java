import java.util.ArrayList;

public class SelectionSort extends Sort {

	int[] array;

	public SelectionSort(int[] array){
		this.array = array;
	}

	@Override
	public int[] sort(int[] unsorted_array, int arraySize) {

		for(int i = 0; i < arraySize; i++) {
			for(int j = i; j < arraySize; j++) {
				if(unsorted_array[j] < unsorted_array[j]) {
					swapValues(j,i);
				}
			}
		}

		return unsorted_array;
	}

	private void swapValues(int indexOne, int indexTwo) {
		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
	}
}
