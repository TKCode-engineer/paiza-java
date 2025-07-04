package rank_d;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 改行区切りでの出力 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      System.out.println(IntStream.range(0, n).mapToObj(i -> sc.next()).collect(Collectors.joining("\n")));
    }
  }
}
