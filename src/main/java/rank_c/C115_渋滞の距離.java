package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C115_渋滞の距離 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int carCount = sc.nextInt();
      int delayInterval = sc.nextInt();

      int totalDelay = IntStream.range(1, carCount).map(i -> sc.nextInt())
          .filter(delay -> delay <= delayInterval).sum();

      System.out.println(totalDelay);
    }
  }
}
