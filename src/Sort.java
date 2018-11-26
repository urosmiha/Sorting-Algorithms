import java.lang.reflect.Array;
import java.util.ArrayList;

abstract public class Sort {

	abstract public int[] sort(int[] array, int arraySize);

	public void displayArray(int[] array, int arraySize, String type) {

		System.out.print(type);
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
	}
}
