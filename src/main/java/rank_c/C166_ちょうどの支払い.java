package rank_c;

import java.util.Scanner;

public class C166_ちょうどの支払い {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int amount = sc.nextInt();
      int[] coins = {500, 100, 50, 10, 5, 1};
      int count = 0;

      for (int coin : coins) {
        int num = amount / coin;
        count += num;
        amount %= coin;
      }
      System.out.println(count);
    }
  }
}
