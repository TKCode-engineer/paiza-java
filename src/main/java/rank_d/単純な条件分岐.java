package rank_d;

import java.util.Scanner;

public class 単純な条件分岐 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(sc.next().equals("paiza") ? "YES" : "NO");
    }
  }
}
