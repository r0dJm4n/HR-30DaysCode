import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner n = new Scanner(System.in);

        int num = n.nextInt();

        for(int i = 1; i <= num; i++) {
            String word = n.next();
            String oddChar = "";

            for(int j = 0; j < word.length(); j++) {
                if(j % 2 == 0) {
                    System.out.print(word.charAt(j));
                } else {
                    oddChar += word.charAt(j);
                }
            }
            System.out.print(" " + oddChar + "\n");
        }
    }
}
