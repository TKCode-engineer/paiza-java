package rank_d;

import java.util.Scanner;

public class D295_田んぼの管理 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt();
      System.out.println(n * m);
    }
  }
}
