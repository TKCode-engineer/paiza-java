package rank_d;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 野球の審判を解くために_part1 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      IntStream.range(0, n).forEach(i -> {
        sc.nextLine();
      });
      System.out.println(n);
    }
  }
}
