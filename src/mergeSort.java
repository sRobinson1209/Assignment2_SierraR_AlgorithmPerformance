import java.util.Scanner;
public class mergeSort implements SortingAlgorithms{
    public int[] sorty(int[] input) {
        //base case for if the array is only one element
        if (input.length <= 1) {
            return input;
        }
        int middle = input.length / 2;
        int[] left = new int[middle];
        int[] right = new int[input.length - middle];

        //copy the left half of the input to the left sub array
        System.arraycopy(input, 0, left, 0, middle);

        //copy the right into the right sub array
        if (input.length - middle >= 0) System.arraycopy(input, middle, right, 0, input.length - middle);

        // apply mergeSort to both sub arrays
        sorty(left);
        sorty(right);

        //merge the sub arrays back into the original
        int i =0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            //compare from left and right and merge
            if(left[i]<= right[j]){
                input[k++] = left[i++];
            }else {
                input[k++] = right[j++];
            }
        }
        //copy the remaining elements from left to the original array
        while(i < left.length){
            input[k++]= left[i++];
        }
        //do the same for the right
        while(j < right.length){
            input[k++] = right[j++];
        }
        return input;
    }
    public String getName(){
        return "Merge Sort";
    }
}
