import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int result = factorial(a);

        System.out.println(result);
    }

    public static int factorial(int N) {
        if (N == 1)
            return 1;
        else
            return N * factorial(N - 1);
    }
}
