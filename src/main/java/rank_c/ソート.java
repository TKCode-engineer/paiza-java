package rank_c;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ソート {

  // アセット（資産）を表すレコードクラス
  record Asset(int gold, int silver) {
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      List<Asset> assets = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        var gold = sc.nextInt();
        var silver = sc.nextInt();
        assets.add(new Asset(gold, silver));
      }

      // 銀の降順 → 銀が同じなら金の降順でソート
      assets.stream()
          .sorted(Comparator.comparingInt(Asset::silver).reversed()
              .thenComparing(Comparator.comparingInt(Asset::gold).reversed()))
          .forEach(asset -> System.out.println(asset.gold() + " " + asset.silver()));
    }
  }
}
