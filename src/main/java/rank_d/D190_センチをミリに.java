package rank_d;

import java.util.Scanner;

public class D190_センチをミリに {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 100) {
        return;
      }

      System.out.println(n * 10);
    }
  }
}
