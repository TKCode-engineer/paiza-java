package rank_d;

import java.util.Scanner;

public class 単純な入出力 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var s = sc.next();

      if (s.length() < 1 || s.length() > 10) {
        return;
      }

      System.out.println(s);
    }
  }
}
