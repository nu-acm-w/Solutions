import java.util.Arrays;
import java.util.Scanner;

/*
 * Not the most elegant solution for problem with sandwiches but works
 * Uses the fact that you can get the minimum difference, and, hence, total error
 * if you substract the max Dn from max distance from range, and similarly for minimum distance
 */

public class Solution {

 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
        int K = sc.nextInt();
        int[] dists = new int[K];
        for (int j = 0; j < K; j++) {
            dists[j] = sc.nextInt();
        }
    int even = 0;
    int middle = 0;
    if (K % 2 == 0) {
        middle = (K / 2) - 1;
        even = 1;
    } else {
        middle = (K - 1) / 2;
    }

    Arrays.sort(dists);

    long sum = 0;

    int flag = 0;

    for (int k = dists.length - 1; k >= 0; k--) {
        long power = (long) Math.pow((dists[k] - middle), 2);
        // even case when two equal elements in the middle
        if (even == 1) {
            // if it is the max element in dists array, substract from middle
            if (k == dists.length - 1) {
                sum += power;
            // if it is the second max, substract from middle too
            } else if (k == dists.length - 2) {
                sum += power;
                  middle--; //to go to the next element
            } else {
                // there are two equal numbers from both sides of middle => consider both
                if (flag == 0) { //first
                    sum += power;
                    flag = 1;
            } else {
                sum += power;
                middle--;
                flag = 0;
            }
        }
        } else { // case for odd
            if (k == dists.length - 1) {
                sum += power;
                middle--;
            } else {
                if (flag == 0) { //first
                    sum += power;
                    flag = 1;
            } else {
                sum += power;
                middle--;
                flag = 0;
            }
        }
        }
    }
   System.out.println("Case #" + (i + 1) + ": " + sum);
  }
 }

}
