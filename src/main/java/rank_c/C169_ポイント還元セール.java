package rank_c;

import java.util.Scanner;

public class C169_ポイント還元セール {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int points = sc.nextInt(); // 初期ポイント
      int rebateRate = sc.nextInt(); // 還元率（%）

      int totalUsePoints = 0;
      for (int day = 0; day < 7; day++) {
        totalUsePoints += points;
        points = points * rebateRate / 100;
      }
      System.out.println(totalUsePoints);
    }
  }
}
