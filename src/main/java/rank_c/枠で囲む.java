package rank_c;

import java.util.Scanner;

public class 枠で囲む {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var s = sc.next();

      String repeat = "+".repeat(s.length() + 2);
      System.out.println(String.format("%s\n+%s+\n%s", repeat, s, repeat));
    }
  }
}
