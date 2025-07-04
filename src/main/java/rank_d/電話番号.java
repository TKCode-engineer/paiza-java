package rank_d;

import java.util.Scanner;

public class 電話番号 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var a = sc.next();
      var b = sc.next();
      var c = sc.next();
      System.out.println(String.format("%s-%s-%s", a, b, c));
    }
  }
}
