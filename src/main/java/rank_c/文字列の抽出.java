package rank_c;

import java.util.Scanner;

public class 文字列の抽出 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var startTag = sc.next();
      var endTag = sc.next();
      sc.nextLine();
      var text = sc.nextLine();

      int start = 0;
      while (start < text.length()) {
        var startIndex = text.indexOf(startTag, start);
        if (startIndex == -1) {
          break;
        }
        startIndex += startTag.length(); // 開始タグの後ろに移動

        var endIndex = text.indexOf(endTag, startIndex);
        if (endIndex == -1) {
          break;
        }

        var result = text.substring(startIndex, endIndex);
        if (result.isEmpty()) {
          System.out.println("<blank>");
        } else {
          System.out.println(result);
        }

        start = endIndex + endTag.length(); // 次の開始位置に進める（終了タグの次）
      }
    }
  }
}
