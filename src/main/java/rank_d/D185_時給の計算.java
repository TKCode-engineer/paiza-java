package rank_d;

import java.util.Scanner;

public class D185_時給の計算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt();

      if (n < 1100 || n > 5000 || m < 1 || m > 200) {
        return;
      }

      System.out.println(n * m);
    }
  }
}
