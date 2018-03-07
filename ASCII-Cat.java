import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    /*
     * The only trick was to make your life easier not using ASCII values but chars
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        String catFamily = "";
        for(int i = 0; i < r; i++){
            String firstLine = "";
            String secLine =   "";
            String thirdLine = "";
            for(int j = 0; j < c; j++){
                firstLine += "  /\\_/\\ ";
                secLine += " ( o.o )";
                thirdLine += "  > ^ < ";
            }
            catFamily += firstLine + "\n" + secLine + "\n" + thirdLine + "\n";            
        }
        System.out.print(catFamily);
    }
}
