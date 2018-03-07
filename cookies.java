import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // number of cookies
    int K = sc.nextInt(); // min required sweetness
    /*
    * PriorityQueue is a good choice for this problem as its elements are sorted
    * according to the natural order. An unbounded priority queue based on a priority heap.
    * Documentation: https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
    */
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    int count = 0;
    for(int i = 0; i < N; i++){ // Filling the queue with elements
        queue.add(sc.nextInt());
    }
    while(queue.peek()!=null && queue.peek()<K && queue.size() >= 2){
        // remove always returns the smallest element in the queue
        queue.add(queue.remove() + 2*queue.remove());
        count++; // operations number 
    }
    
    if(queue.size() == 1 && queue.remove()<K){ // if there is only one cookie, we cannot change its sweetness
        count = -1;
    }
    System.out.print(count);
}
}
