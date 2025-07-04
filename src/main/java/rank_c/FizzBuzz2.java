package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      IntStream.rangeClosed(1, n).mapToObj(i -> i % 3 == 0 && i % 5 == 0 ? "Fizz Buzz"
          : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i).forEach(System.out::println);
    }
  }
}
