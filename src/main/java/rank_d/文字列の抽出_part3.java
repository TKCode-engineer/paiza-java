package rank_d;

import java.util.Scanner;

public class 文字列の抽出_part3 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var startTag = sc.next();
      var endTag = sc.next();
      sc.nextLine();
      var text = sc.nextLine();

      var startIndex = text.indexOf(startTag) + 1;
      var endIndex = text.indexOf(endTag) + 1;
      System.out.println(String.format("%s %s", startIndex, endIndex));
    }
  }
}
