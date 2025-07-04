package rank_d;

import java.util.Scanner;
import java.util.stream.Stream;

public class D216_夏休みの課題 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var a = sc.nextInt();
      var b = sc.nextInt();

      var hasInvalidNumber = Stream.of(a, b).anyMatch(num -> num < 0 || num > 500 || a + b > 500);
      if (hasInvalidNumber) {
        return;
      }

      System.out.println(500 - (a + b));
    }
  }
}
