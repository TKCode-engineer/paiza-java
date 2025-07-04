package rank_d;

import java.util.Scanner;

public class 引き算_掛け算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var a = sc.nextInt();
      var b = sc.nextInt();
      System.out.println(String.format("%d %d", a - b, a * b));
    }
  }
}
