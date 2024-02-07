import java.util.Scanner;
public class bubbleSort implements SortingAlgorithms {
    public int[] sorty(int[] input) {
        int n = input.length;//number of elements in the array
        int temp;//temporary variable for swap
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {//outer loop iterates over each element in the array, excluding the last one
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (input[j + 1] < input[j]) {//swap elements if the next element is smaller than the current
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;// set swapped to true to show the swap occurred
                }
            }
        }
        return input;
    }
    public String getName(){
        return "Bubble Sort";
    }
}
