import java.util.Scanner;
import java.util.stream.IntStream;

public class フラグ管理 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      boolean hasSeven = IntStream.range(0, n).map(i -> sc.nextInt())
          .anyMatch(num -> num == 7);

      System.out.println(hasSeven ? "YES" : "NO");
    }
  }
}
