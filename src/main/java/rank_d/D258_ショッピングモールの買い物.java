package rank_d;

import java.util.Scanner;

public class D258_ショッピングモールの買い物 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var a = sc.nextInt();
      var b = sc.nextInt();
      System.out.println((a * 2) + (b * 2));
    }
  }
}
