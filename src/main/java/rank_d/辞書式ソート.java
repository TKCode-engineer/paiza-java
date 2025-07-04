package rank_d;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 辞書式ソート {

  record FruitPair(int appleCount, int bananaCount) {
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      List<FruitPair> pairs = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        int apples = sc.nextInt();
        int bananas = sc.nextInt();
        pairs.add(new FruitPair(apples, bananas));
      }

      pairs.stream().sorted(Comparator.comparingInt(FruitPair::appleCount).reversed() // ルール1:りんごの数で降順
          .thenComparing(Comparator.comparingInt(FruitPair::bananaCount).reversed()))// ルール2:りんごが同じならバナナの数で降順ソート
          .forEach(pair -> System.out.println(pair.appleCount() + " " + pair.bananaCount()));
    }
  }
}
