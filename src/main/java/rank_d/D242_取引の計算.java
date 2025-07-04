package rank_d;

import java.util.Scanner;
import java.util.stream.Stream;

public class D242_取引の計算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var x = sc.nextInt();
      var y = sc.nextInt();
      var z = sc.nextInt();

      var hasInvalidNumber = Stream.of(x, y , z).anyMatch(num -> num < 0 || num > 5000000 || z > x + y);
      if (hasInvalidNumber) {
        return;
      }

      System.out.println(x + y - z);
    }
  }
}
