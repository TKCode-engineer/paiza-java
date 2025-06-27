import java.util.Scanner;
import java.util.stream.Stream;

public class D313_所持金の合計 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var a = sc.nextInt();
      var b = sc.nextInt();

      var hasInvalidNumber = Stream.of(a, b).anyMatch(num -> num < 0 || num > 500);
      if (hasInvalidNumber) {
        return;
      }

      System.out.println(a + b);
    }
  }
}
