package rank_d;

import java.util.Scanner;

public class D200_電気代の計算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 10) {
        return;
      }

      System.out.println(n * 25 * 24);
    }
  }
}
