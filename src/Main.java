import javax.sound.sampled.Line;
import java.util.ArrayList;

public class Main {

    static int arraySize = 10;
    static int[] array = new int[arraySize];

    public static void main(String[] args) {
        System.out.println("Hello World!");
        generateRandomArray();

//        Print array
        System.out.print("Array List:    ");
        for(int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");

        BubbleSort bubbleList = new BubbleSort(array);
        bubbleList.sort(array, arraySize);
        bubbleList.displayArray(array, arraySize, "Bubble:        ");

        SelectionSort selectList = new SelectionSort(array);
        selectList.sort(array, arraySize);
        selectList.displayArray(array, arraySize, "Selection:     ");


    }

    public static void generateRandomArray(){
        for(int i = 0; i < arraySize; i++){
            array[i] = (int) (Math.random() * 10) + 10;
        }
    }
}
