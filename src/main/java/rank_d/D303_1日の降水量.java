package rank_d;

import java.util.Scanner;

public class D303_1日の降水量 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      System.out.println(n * 24);
    }
  }
}
