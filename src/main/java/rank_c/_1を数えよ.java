package rank_c;

import java.util.Scanner;

public class _1を数えよ {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      String binaryString = Integer.toBinaryString(n);

      var count = binaryString.chars().filter(c -> c == '1').count();

      System.out.println(count);
    }
  }
}
