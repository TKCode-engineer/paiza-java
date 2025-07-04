package rank_c;

import java.util.Scanner;

public class _1を数えよ_ビット演算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      var count = 0;
      while (n > 0) {
        if ((n & 1) == 1) {
          count++;
        }
        n = n >>> 1;
      }
      System.out.println(count);
    }
  }
}
