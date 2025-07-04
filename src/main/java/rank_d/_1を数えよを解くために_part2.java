package rank_d;

import java.util.Scanner;

public class _1を数えよを解くために_part2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextLine();
      System.out.println(n.chars().filter(c -> c == '1').count());
    }
  }
}
