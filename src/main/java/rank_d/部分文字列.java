package rank_d;

import java.util.Scanner;

public class 部分文字列 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var a = sc.nextLine();
      var s = sc.nextLine();

      System.out.println(s.contains(a) ? "YES" : "NO");
    }
  }
}
