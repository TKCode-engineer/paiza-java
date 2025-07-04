package rank_d;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 昇順ソート {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).sorted().forEach(System.out::println);
    }
  }
}
