package rank_d;

import java.util.Scanner;

public class 代入演算2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = 0;
      n = Integer.sum(n, sc.nextInt());
      n = n * sc.nextInt();
      n = n % sc.nextInt();
      System.out.println(n);
    }
  }
}
