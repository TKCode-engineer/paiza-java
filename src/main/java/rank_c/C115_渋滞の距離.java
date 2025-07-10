package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C115_渋滞の距離 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var carCount = sc.nextInt();
      var delayInterval = sc.nextInt();

      var amount =
          IntStream.range(1, carCount).map(i -> sc.nextInt()).filter(i -> i <= delayInterval).sum();
      System.out.println(amount);
    }
  }
}
