package rank_d;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 整数と文字列 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      IntStream.range(0, n).mapToObj(i -> sc.next().length()).forEach(System.out::println);
    }
  }
}
