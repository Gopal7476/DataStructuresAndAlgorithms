/* Maximum and Minimum Element in an Array */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MinMax {

    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();

        // If array contain single value
        if(n == 1) { 
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        // If array contains two are more values
        if(arr[0] > arr[1]) {
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        else {
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for(int i=2; i<n; i++){
            if(arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
            else if(arr[i] > minmax.max) {
                minmax.max = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Taking inputs from the user
        int SizeOfArray = Integer.parseInt(br.readLine());
        int[] Array = new int[SizeOfArray];
        for(int i=0; i<SizeOfArray; i++) {
            Array[i] = Integer.parseInt(br.readLine());
        }

        /* Method 1: Using InBuild sort method */
        Arrays.sort(Array);
        System.out.println("Minimum Element in the array: " + Array[0]);
        System.out.println("Maximum Element in the array: " + Array[Array.length-1]);

        /* Method 2: By the manually */
        Pair minmax = getMinMax(Array, SizeOfArray);
        System.out.println("Minimum Element in the array: " + minmax.min);
        System.out.println("Minimum Element in the array: " + minmax.max);


    }
}