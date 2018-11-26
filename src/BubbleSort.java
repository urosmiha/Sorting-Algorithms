import java.util.ArrayList;

public class BubbleSort extends Sort {

	int[] array;

	public BubbleSort(int[] array){
		this.array = array;
	}

	public int[] sort(int[] unsorted_array, int arraySize) {

		for(int i = arraySize - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(unsorted_array[j] > unsorted_array[j+1]) {
					swapValues(j, j+1);
				}
			}
		}
		return array;
	}

	private void swapValues(int indexOne, int indexTwo) {
		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
	}
}
