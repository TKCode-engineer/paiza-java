package rank_d;

import java.util.Scanner;

public class 占い {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(sc.nextInt() == 7 ? "Yes" : "No");
    }
  }
}
