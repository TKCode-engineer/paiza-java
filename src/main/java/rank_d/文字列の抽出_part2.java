package rank_d;

import java.util.Scanner;

public class 文字列の抽出_part2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String startTag = sc.next();
      String endTag = sc.next();
      sc.nextLine();
      String text = sc.nextLine();
      int a_index = sc.nextInt() - 1;
      int b_index = sc.nextInt() - 1;

      String result = text.substring(a_index + startTag.length(), b_index);
      System.out.println(result.isEmpty() ? "<blank>" : result);
    }
  }
}
