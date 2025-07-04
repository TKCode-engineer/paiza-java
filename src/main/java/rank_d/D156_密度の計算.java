package rank_d;

import java.util.Scanner;

public class D156_密度の計算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt();

      /**
       * 条件
       * ・1 ≦ N ≦ 100
       * ・1 ≦ M ≦ 100
       */
      if (1 > n || n > 100 || 1 > m || m > 100) {
        return;
      }

      // 総面積の計算
      System.out.println(n * m);
    }
  }
}
