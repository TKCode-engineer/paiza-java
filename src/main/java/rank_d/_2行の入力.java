package rank_d;

import java.util.Scanner;

public class _2行の入力 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var s = sc.nextLine();
      var t = sc.nextLine();
      System.out.println(String.format("%s\n%s", s, t));
    }
  }
}
