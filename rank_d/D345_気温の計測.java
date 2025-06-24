import java.util.Scanner;
import java.util.stream.Stream;

public class D345_気温の計測 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      var a = sc.nextInt();
      var b = sc.nextInt();
      var c = sc.nextInt();

      var hasInvalidNumber = Stream.of(a, b, c).anyMatch(num -> num < 0 || num > 40);
      if (hasInvalidNumber) {
        return;
      }

      // Math.max()をネスト（入れ子）して使用する
      // 1. まず Math.max(b, c) で b と c の大きい方が求められる
      // 2. 次にその結果と a を Math.max() で比較し、最終的な最大値を得る
      var max = Math.max(a, Math.max(b, c));

      System.out.println(max);
    }
  }
}
