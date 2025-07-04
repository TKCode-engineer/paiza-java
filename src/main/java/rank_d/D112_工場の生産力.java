package rank_d;

import java.util.Scanner;

public class D112_工場の生産力 {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var h = sc.nextInt();

      if (n < 1 || n > 200 || h < 1 || h > 24) {
        return;
      }

      System.out.println(n * h);
    }
  }
}
