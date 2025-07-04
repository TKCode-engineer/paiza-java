package rank_d;

import java.util.Scanner;

public class D162_お米の重さ {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 20) {
        return;
      }

      System.out.println(n * 150);
    }
  }
}
