package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C142_レストランのメニュー {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String wantToEat = sc.nextLine();
      int menuCount = sc.nextInt();

      boolean isMatched = IntStream.range(0, menuCount).mapToObj(i -> sc.next())
          .anyMatch(menuName -> menuName.equals(wantToEat));

      System.out.println(isMatched ? "Yes" : "No");
    }
  }
}
