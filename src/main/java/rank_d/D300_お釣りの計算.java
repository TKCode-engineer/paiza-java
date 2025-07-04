package rank_d;

import java.util.Scanner;

public class D300_お釣りの計算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt();

      System.out.println(m - n);
    }
  }
}
