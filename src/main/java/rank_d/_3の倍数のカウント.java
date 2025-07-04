package rank_d;

import java.util.Scanner;
import java.util.stream.IntStream;

public class _3の倍数のカウント {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var count = IntStream.range(0, n).map(i -> sc.nextInt()).filter(num -> num % 3 == 0).count();

      System.out.println(count);
    }
  }
}
