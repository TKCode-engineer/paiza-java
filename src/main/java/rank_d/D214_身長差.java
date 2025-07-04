package rank_d;

import java.util.Scanner;
import java.util.stream.Stream;

public class D214_身長差 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var a = sc.nextInt();
      var b = sc.nextInt();

      var hasInvalidNumber = Stream.of(a, b).anyMatch(num -> num < 1 || num > 300);
      if (hasInvalidNumber) {
        return;
      }

      System.out.println(a - b);
    }
  }
}
