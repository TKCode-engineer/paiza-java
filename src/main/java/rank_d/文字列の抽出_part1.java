package rank_d;

import java.util.Scanner;

public class 文字列の抽出_part1 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var s = sc.nextLine();
      System.out.println(String.format("%s\n%s", s, s));
    }
  }
}
