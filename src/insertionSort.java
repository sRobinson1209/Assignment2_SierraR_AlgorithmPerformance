import java.util.Scanner;
public class insertionSort implements SortingAlgorithms{
    public int[] sorty(int[] input){
        //outer loop iterates over the elements starting from index 1
        for (int p = 1; p < input.length; ++p){
           int tmp = input[p];//store the current element to be inserted at the correct position
            int j;// this variable tracks the position for inserting the current element
            for( j = p; j > 0 && tmp < input [j-1]; j--){// inner loop finds the correct position for the current element in the sorted part
                input[j] = input[j-1];// shift elements to make room for the current element
            }
            input[j] = tmp;
        }
        return input;
    }
    public String getName(){
        return "Insertion Sort";
    }
}
