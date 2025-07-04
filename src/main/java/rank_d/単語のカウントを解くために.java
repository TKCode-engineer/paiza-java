package rank_d;

import java.util.Arrays;
import java.util.Scanner;

public class 単語のカウントを解くために {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextLine();
      var color = n.split(" ");
      boolean isRed = Arrays.stream(color).anyMatch(s -> s.equals("red"));

      System.out.println(isRed ? "Yes" : "No");
    }
  }
}
