package rank_c;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class C130_繰り返し学習 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var count = sc.nextInt();
      var reviewCount = 0;
      List<Integer> reviewList = new ArrayList<>();
      for (int i = 0; i < count; i++) {
        var a = sc.next();
        var b = sc.next();
        var ab = a + b;
        boolean isReview = ab.equals("nn") || ab.equals("yn") || ab.equals("ny");
        if (isReview) {
          reviewCount++;
          reviewList.add(i + 1);
        }
      }
      System.out.println(reviewCount);
      reviewList.sort(Comparator.naturalOrder());
      reviewList.forEach(item -> System.out.println(item));
    }
  }
}
