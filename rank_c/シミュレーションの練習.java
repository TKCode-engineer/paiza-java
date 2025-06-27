import java.util.Scanner;
import java.util.stream.Stream;

public class シミュレーションの練習 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = Integer.parseInt(sc.nextLine());
      String[] ab = sc.nextLine().split(" ");
      var a = Integer.parseInt(ab[0]);
      var b = Integer.parseInt(ab[1]);

      var hasInvalidNumber = Stream.of(a, b).anyMatch(num -> num < 1 || num > 10 || n < 2 || n > 10000);
      if (hasInvalidNumber) {
        return;
      }

      var paizaNum = 1;
      var kyokoNum = 1;
      var operationCount = 0;

      while (n >= kyokoNum) {
        kyokoNum = kyokoNum + (paizaNum * a);
        paizaNum = paizaNum + (kyokoNum % b);
        operationCount++;
      }
      System.out.println(operationCount);
    }
  }
}
