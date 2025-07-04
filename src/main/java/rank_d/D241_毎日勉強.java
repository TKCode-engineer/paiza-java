package rank_d;

import java.util.Scanner;

public class D241_毎日勉強 {
      public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        // 入力された整数（1日に進めるページ数）を読み込み、変数nに代入します。
        var n = sc.nextInt();

        if (n < 1 || n > 500) {
          return;
        }

        // 100日分のページ数を計算します (n * 100)。
        System.out.println(n * 100);
      }
    }
}
