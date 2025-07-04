package rank_d;

import java.util.Scanner;

public class D204_2にする {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 221) {
        return;
      }

      System.out.println(222 - n);
    }
  }
}
