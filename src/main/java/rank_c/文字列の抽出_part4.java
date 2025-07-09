package rank_c;

import java.util.Scanner;

public class 文字列の抽出_part4 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var startTag = sc.next();
      var endTag = sc.next();
      sc.nextLine();
      var text = sc.nextLine();

      var searchStart = 0;

      while (true) {
        var start = text.indexOf(startTag, searchStart);
        if (start == -1)
          break;
        var startContent = start + startTag.length();

        var end = text.indexOf(endTag, startContent);
        if (end == -1)
          break;

        System.out.println(String.format("%d %d", start + 1, end + 1));

        searchStart = end + endTag.length();
      }
    }
  }
}
