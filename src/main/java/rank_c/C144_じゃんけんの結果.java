package rank_c;

import java.util.Scanner;

public class C144_じゃんけんの結果 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var count = sc.nextInt();

      int win = 0;
      for (int i = 0; i < count; i++) {
        String player = sc.next();
        String opponent = sc.next();

        if (player.equals("G") && opponent.equals("C") || player.equals("C") && opponent.equals("P")
            || player.equals("P") && opponent.equals("G")) {
          win++;
        }
      }
      System.out.println(win);
    }
  }
}
