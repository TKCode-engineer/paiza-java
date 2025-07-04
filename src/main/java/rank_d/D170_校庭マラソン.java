package rank_d;

import java.util.Scanner;

public class D170_校庭マラソン {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt();

      if (n < 10 || n > 1000 || m < 1 || m > 100) {
        return;
      }

      System.out.println(n * m);
    }
  }
}
