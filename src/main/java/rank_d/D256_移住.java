package rank_d;

import java.util.Scanner;

public class D256_移住 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var x = sc.nextInt();
      var y = sc.nextInt();
      System.out.println(x - 100);
      System.out.println(y + 100);
    }
  }
}
