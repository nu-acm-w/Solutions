import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
     * Time complexity O(n)
     * The 1st loop searches the maximum number
     * The 2nd loop searches the number of occurences
     */
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int max = 0, count = 0;
        for(int i = 0; i<n; i++){
           if(max<ar[i])
               max = ar[i];
        }
        for(int i = 0; i<n; i++){
            if(ar[i]==max)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
