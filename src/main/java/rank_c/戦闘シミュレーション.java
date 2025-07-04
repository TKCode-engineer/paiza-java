package rank_c;

import java.util.Scanner;

public class 戦闘シミュレーション {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // 戦闘回数
      var n = sc.nextInt();

      // あなたのレベル
      var l = sc.nextInt();

      for (int i = 0; i < n; i++) {
        // 敵のレベル
        var enemyLevel = sc.nextInt();

        // あなたが戦闘に勝利
        if (l > enemyLevel) {
          l = l + (int) Math.floor(enemyLevel / 2);
        } else if (l < enemyLevel) {
          l = (int) Math.floor(l / 2);
        }
      }
      System.out.println(l);
    }
  }
}
