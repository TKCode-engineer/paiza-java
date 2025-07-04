package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class forループ {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt(); // 参加者数
      int m = sc.nextInt(); // 各参加者が書く数字の個数
      int k = sc.nextInt(); // 当たり数字

      // 1 行目には上で説明した数 N, M, K が半角スペース区切りで与えられ、 2 行目から (N + 1) 行目までには各参加者が紙に書いた数字が M 個ずつ半角スペース区切りで、
      // N 回与えられます。

      // 入力された通りの順番で、各参加者の得点をN回、改行区切りで出力してください。
      // 3 2 1
      // １行目： 参加者数：３人 紙に好きな数字：２ 発表数字：１
      // ２行目： （３＋１）行目まで紙に書いた好きな数字２個ずつ半角スペース区切り、３回与えられる

      // for (int i = 0; i < n; i++) {
      // int count = 0;
      // for (int j = 0; j < m; j++) {
      // if (k == sc.nextInt()) {
      // count++;
      // }
      // }
      // System.out.println(count);
      // }

      // 外側のループ (参加者 n人分)
      IntStream.range(0, n).forEach(i -> {
        // 内側の処理をStreamで完結させる
        long count = IntStream.range(0, m) // m個の数字を読むためのStream
            .map(j -> sc.nextInt()) // 各数字を読み込む
            .filter(num -> num == k) // kと一致するものだけをフィルタリング
            .count(); // 条件に合ったものの個数を数える

        System.out.println(count);
      });
    }
  }
}
