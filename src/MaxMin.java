// Finding the Maximum and Minimum Element In An Array.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Taking input from the user
        int NoOfElements = Integer.parseInt(br.readLine());
        int[] array = new int[NoOfElements];
        for (int i=0; i<NoOfElements; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        //System.out.println(Arrays.toString(array));

        /* ********************* Using InBuild sort method ********************* */
        //Sorting the array
        Arrays.sort(array);

        System.out.println("Minimum Element in the array: " + array[0]);
        System.out.println("Maximum Element in the array: " + array[array.length-1]);
       


    }
}
