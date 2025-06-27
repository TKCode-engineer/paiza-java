import java.util.Scanner;
import java.util.stream.Stream;

public class D244_村の再開発 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var x = sc.nextInt();
      var y = sc.nextInt();

      var hasInvalidNumber = Stream.of(x, y).anyMatch(num -> num < 1 || num > 500);
      if (hasInvalidNumber) {
        return;
      }

      System.out.println(100 + x * y);
    }
  }
}
