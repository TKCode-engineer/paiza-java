package rank_d;

import java.util.List;
import java.util.Scanner;

public class 数値演算結果で分岐 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      List<Integer> inputs = List.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

      boolean result = inputs.get(0) * inputs.get(1) <= inputs.get(2);

      System.out.println(result ? "YES" : "NO");
    }
  }
}
