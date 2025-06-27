import java.util.Arrays;
import java.util.Scanner;

public class 数字の文字列操作_時刻1 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var s = sc.next();
      // String[] parts = s.split(":");
      // System.out.println(Integer.parseInt(parts[0]));
      // System.out.println(Integer.parseInt(parts[1]));
      Arrays.stream(s.split(":"))
        .mapToInt(Integer::parseInt)
        .forEach(System.out::println);
    }
  }
}
