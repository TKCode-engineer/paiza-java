package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class みかんの仕分け {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt();

      IntStream.range(0, m).forEach(i -> {
        var mikanWeight = sc.nextInt();
        if (mikanWeight > n) {
          System.out.println(roundToNearestUnit(mikanWeight, n));
        } else {
          System.out.println(n);
        }
      });
    }
  }

  public static int roundToNearestUnit(int num, int unit) {
    return Math.round(num / (float) unit) * unit;
  }
}
