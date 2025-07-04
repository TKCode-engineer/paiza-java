package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 荷物検査 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // 手荷物の個数
      var n = sc.nextInt();

      // 重さの基準値
      var m = sc.nextInt();

      // Streamで合計計算
      int totalWeight = IntStream.range(0, n).map(i -> sc.nextInt()).sum();
      System.out.println(totalWeight <= m ? "OK" : "NG");
    }
  }
}
