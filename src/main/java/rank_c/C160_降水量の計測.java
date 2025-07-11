package rank_c;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class C160_降水量の計測 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var boxedCount = sc.nextInt();

      OptionalDouble average = IntStream.range(0, boxedCount).map(count -> sc.nextInt()).average();
      System.out.println((int) Math.ceil(average.getAsDouble()));
    }
  }
}
