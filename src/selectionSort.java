import java.util.Scanner;

public class selectionSort implements SortingAlgorithms {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sorty(int[] input) {
        //outer loop iterates over each element in the array
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;// the current index is the minimum element
            for (int j = i; j < input.length; j++) {// inner loop find the actual minimum element
                if (input[j] < input[minIndex]) {//if the current element is smaller than the minIndex, update the minIndec with new element
                    minIndex = j;
                }
                swap(input, i, minIndex);
            }
        }
        return input;
        }
    public String getName(){
        return "Selection Sort";
    }
}
