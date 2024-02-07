import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Performance {
    public static void main(String[] args) {
        SortingAlgorithms[] sortingAlgorithms = {
                new insertionSort(),
                new mergeSort(),
                new quickSort(),
                new selectionSort(),
                new shellSort(),
                new bubbleSort()
        };

        int[] size = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;

        try {
            FileWriter file = new FileWriter("C:/Users/sierr/Downloads/performanceReport.txt");
            PrintWriter print = new PrintWriter(file);
            print.println("Performance ");

            for (SortingAlgorithms sa : sortingAlgorithms) {
                Tester tester = new Tester(sa);
                print.println("Sorting Algorithm " + sa.getClass().getName());

                for (int sizes : size) {
                    print.println("Array Size " + sizes);
                    tester.test(iterations, sizes);

                }
                print.println();
            }
            print.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






