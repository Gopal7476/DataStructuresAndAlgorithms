/* Minimum and Maximum Elements in an Array */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException; 

public class MaxMin {
    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int array[], int No_Of_Elements) {
        Pair minmax = new Pair();
        
        // If there is only one element
        if(No_Of_Elements == 1) {
            minmax.min = array[0];
            minmax.max = array[0];
            return minmax;
        }

        // If there is more than one element
        if(array[0] < array[1]) {
            minmax.min = array[0];
            minmax.max = array[1];
        }
        else {
            minmax.min = array[1];
            minmax.max = array[0];
        } 

        for(int i=2; i<No_Of_Elements; i++) {
            if(array[i] > minmax.max) {
                minmax.max = array[i];
            }
            else if(array[i] < minmax.min) {
                minmax.min = array[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // INPUT TAKEN FOR THE USER
        int No_Of_Elements = Integer.parseInt(br.readLine());
        int[] array = new int[No_Of_Elements];

        // INITIALIZATION THE ARRAY
        for(int i=0; i<No_Of_Elements; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        //System.out.println(Arrays.toString(array));

        /* Method 1: Using the InBuild Method(sort) */
        Arrays.sort(array);
        System.out.println("Minimum Element in the array: " + array[0]);
        System.out.println("Maximum Element in the array: " + array[array.length-1]);

        /* Method 2: Using the Manually */
        Pair minmax = getMinMax(array, No_Of_Elements);
        System.out.println("Minimum Element in the array: " + minmax.min);
        System.out.println("Maximum Element in the array: " + minmax.max);

    }
}
