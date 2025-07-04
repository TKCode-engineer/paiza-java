package rank_d;

import java.util.Scanner;

public class 数値の分岐 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(sc.nextInt() <= 100 ? "YES" : "NO");
    }
  }
}
