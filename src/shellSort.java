import java.util.Scanner;

public class shellSort implements SortingAlgorithms {
    public int[] sorty(int[] input) {
        int n = input.length;
        //iterate over each element starting from the current gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; ++i) {
                int tmp = input[i];//store the current element to be inserted at the correct position
                int j;

                //iterate over the elements with a specific gap and sort with the current gap
                for (j = i; j >= gap && tmp < input[j - gap]; j -= gap) {
                    input[j] = input[j - gap];//shift elements to the right within th ecurrent gap
                }
                input[j] = tmp;
            }
        }
        return input;
    }
    public String getName(){
        return "Shell Sort";
    }
}

