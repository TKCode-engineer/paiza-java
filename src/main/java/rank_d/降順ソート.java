package rank_d;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 降順ソート {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).boxed()
          .sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
  }
}
