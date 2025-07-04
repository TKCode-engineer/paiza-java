package rank_c;

import java.util.Scanner;

public class 野球の審判 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var strike = 0;
      var ball = 0;
      for (int i = 0; i < n; i++) {
        var judge = sc.next();

        if (judge.equals("strike")) {
          strike++;
        } else if (judge.equals("ball")) {
          ball++;
        }

        if (strike == 3) {
          System.out.println("out!");
        } else if (ball == 4) {
          System.out.println("fourball!");
        } else {
          System.out.println(judge + "!");
        }
      }
    }
  }
}
