import java.util.Arrays;
import java.util.Random;

public class Tester /*extends SortingAlgorithms*/ {
    private SortingAlgorithms sortingAlgorithms;


    public Tester(SortingAlgorithms sa) {
        this.sortingAlgorithms = sa;//Constructor
    }

    public double singleTest( int size){
        int[] input = generateKSorted(size);
        long startTime = System.nanoTime();
        sortingAlgorithms.sorty(input);
        long endTime = System.nanoTime();
        return (endTime - startTime)/ 1e6;
    }
   public void test(int iterations, int size){
         double totalTime = 0;

         for(int i = 0; i < iterations; i++){
             //double time = singleTest(size);
             totalTime+= singleTest(size);

             //System.out.println("Iteration "+ (i +1) + ": "+ time + " seconds");
         }
         double average = totalTime / iterations;
         System.out.println("Sorted " + size + ": in " + average + " milliseconds");

    }
    public int[] generateKSorted(int size){
        int[] input = new int[size];

        Random random = new Random();
        for(int i = 0; i < size; i++){
            input[i]= random.nextInt();
        }
        for(int gap = size/10; gap > 0; gap/=2){
            for(int i = gap; i < size; i++){
                int a = input[i]; int j;
                for(j = i; j >= gap && a < input[j - gap]; j-=gap){
                    input[j]= input[j-gap];
                }
                input[j]= a;
            }
        }
        return input;
    }

    }

