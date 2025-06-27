import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 数字の文字列操作 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var s = sc.next();

      int a = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(3));
      int b = Character.getNumericValue(s.charAt(1)) + Character.getNumericValue(s.charAt(2));

      System.out.println(Stream.of(a, b).map(String::valueOf).collect(Collectors.joining()));
    }
  }
}
