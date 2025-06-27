import java.util.Scanner;
import java.util.stream.IntStream;

public class 入力の配列による保持 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      IntStream.range(0, n).map(i -> sc.nextInt()).max().ifPresent(System.out::println);
    }
  }
}
