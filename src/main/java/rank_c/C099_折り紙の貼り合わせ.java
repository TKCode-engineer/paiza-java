package rank_c;

import java.util.Scanner;

public class C099_折り紙の貼り合わせ {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var count = sc.nextInt();
      var length = sc.nextInt();

      // 全体の幅を計算する変数
      var totalWidth = length;
      for (int i = 0; i < count - 1; i++) {
        // 重なりの長さを読み込む
        int overlap = sc.nextInt();

        // 全体の横幅に「（折り紙の幅） - （重なりの長さ）」を加算する
        totalWidth += (length - overlap);
      }

      // 総面積の計算
      System.out.println(totalWidth * length);
    }
  }
}
