import java.util.Scanner;

public class シミュレーション {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      long h = sc.nextLong();

      if (h < 3 || h > Math.pow(10, 8)) {
        return;
      }

      var attackCount = 0;

      // 1回目の攻撃
      attackCount++;
      h -= 1;
      if (h <= 0) {
        System.out.println(attackCount);
        return; // 体力が0以下になったので処理を終了
      }

      // 2回目の攻撃
      attackCount++;
      h -= 1;
      if (h <= 0) {
        System.out.println(attackCount);
        return; // 体力が0以下になったので処理を終了
      }

      // 3回目以降の攻撃のための準備
      long dmgPrev2 = 1; // (n-2)回目のダメージ。最初は1回目のダメージ(1)
      long dmgPrev1 = 1; // (n-1)回目のダメージ。最初は2回目のダメージ(1)

      // 3回目以降の攻撃ループ
      while (h > 0) {
        attackCount++;

        // 現在の攻撃ダメージを計算
        // (n-1)回目のダメージ * 2 + (n-2)回目のダメージ
        long currentDmg = (dmgPrev1 * 2) + dmgPrev2;

        // ダメージを体力から引く
        h -= currentDmg;

        // 次のループのために、ダメージの履歴を更新する
        dmgPrev2 = dmgPrev1;
        dmgPrev1 = currentDmg;
      }
      // ループが終了した時点（HPが0以下になった時点）の攻撃回数を出力
      System.out.println(attackCount);
    }
  }
}
