package rank_d;

import java.util.stream.IntStream;

public class FizzBuzz {
  public static void main(String[] args) {
    IntStream.rangeClosed(1, 100).mapToObj(i -> i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : i
        % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i).forEach(System.out::println);
  }
}
