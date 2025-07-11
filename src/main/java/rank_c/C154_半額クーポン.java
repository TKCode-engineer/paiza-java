package rank_c;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class C154_半額クーポン {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int itemCount = sc.nextInt();
      int couponPrice = sc.nextInt();

      List<Integer> prices = new ArrayList<>();
      for (int i = 0; i < itemCount; i++) {
        prices.add(sc.nextInt());
      }

      // 高い順にソート（最も高い商品にクーポン適用するため）
      prices.sort(Comparator.reverseOrder());

      int total = 0;
      boolean couponUsed = false;
      for (int price : prices) {
        if (!couponUsed && price >= couponPrice) {
          total += price / 2;
          couponUsed = true;
        } else {
          total += price;
        }
      }

      System.out.println(total);
    }
  }
}
