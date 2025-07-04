package rank_d;

import java.util.Scanner;

public class 気象観測 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      System.out.println(n >= 0 && n < 2 ? "clear"
          : n >= 2 && n < 9 ? "sunny" : n >= 9 && n <= 10 ? "cloudy" : "");
    }
  }
}
