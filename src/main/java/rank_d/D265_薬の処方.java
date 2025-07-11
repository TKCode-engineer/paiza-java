package rank_d;

import java.util.Scanner;

public class D265_薬の処方 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt() * 3;
      System.out.println(n * m);
    }
  }
}
