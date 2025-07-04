package rank_d;

import java.util.Scanner;

public class D174_栄養の摂取 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var k = sc.nextInt();

      if (k < 1 || k > 100) {
        return;
      }

      System.out.println(k * 1500);
    }
  }
}
