import java.util.Scanner;
import java.math.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double mealCost = scan.nextDouble();
    int tipPercent = scan.nextInt();
    int taxPercent = scan.nextInt();
    scan.close();

    double total = mealCost + ((mealCost * tipPercent) / 100) + ((mealCost * taxPercent) / 100);

    int totalCost = (int) Math.round(total);

    System.out.println("The total meal cost is " + totalCost + " dollars.");
  }
}
