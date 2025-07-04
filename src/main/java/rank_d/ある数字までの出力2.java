package rank_d;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ある数字までの出力2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      IntStream.rangeClosed(1, sc.nextInt()).forEach(System.out::println);
    }
  }
}
