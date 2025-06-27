import java.util.Scanner;
import java.util.stream.IntStream;

public class 複数行にわたる出力 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      System.out.println("paiza\n".repeat(n));

      // Stream記法
      IntStream.range(0, n).mapToObj(i -> "paiza").forEach(System.out::println);
    }
  }
}
