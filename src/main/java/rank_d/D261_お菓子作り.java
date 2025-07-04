package rank_d;

import java.util.Scanner;

public class D261_お菓子作り {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 20) {
        return;
      }

      System.out.println(n * 13);
    }
  }
}
