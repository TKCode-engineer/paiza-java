package rank_c;

import java.util.Scanner;

public class _1を数えよを解くために_part4 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      // (n & 1)で最下位ビットを取得
      System.out.println((n & 1) == 1 ? "Yes" : "No");
    }
  }
}
