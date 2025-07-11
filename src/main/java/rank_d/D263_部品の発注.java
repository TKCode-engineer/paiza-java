package rank_d;

import java.util.Scanner;

public class D263_部品の発注 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var x = sc.nextInt();
      var n = sc.nextInt();
      System.out.println(x * n);
    }
  }
}
