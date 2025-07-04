package rank_c;

import java.util.Scanner;

public class _1を数えよを解くために_part3 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      int count = 0;
      while (n > 0) {
        // 最下位の 1 ビットを消す ビット演算
        // 1ビットの数だけループするため、超高速（0のビットはスキップできる）
        n &= (n - 1);
        count++;
      }
      System.out.println(count);
    }
  }
}
