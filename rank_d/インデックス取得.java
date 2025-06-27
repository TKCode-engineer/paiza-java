import java.util.Scanner;
import java.util.stream.IntStream;

public class インデックス取得 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // 1. 入力値の読み込み
      int n = sc.nextInt();

      // 財産データを配列に一括で読み込む
      int[] assets = new int[n];
      for (int i = 0; i < n; i++) {
        assets[i] = sc.nextInt();
      }

      int k = sc.nextInt(); // 検索する金額

      // 2. Stream API を使った処理
      IntStream.range(0, n) // 0からn-1までのインデックスのストリームを生成
          .filter(i -> assets[i] == k) // 3. 財産がk円の人をフィルタリング
          .findFirst() // 4. 最初に見つかった要素(インデックス)を取得
          // 5. 結果に応じた処理
          .ifPresent(i -> System.out.println(i + 1)); // 6. 見つかった場合、そのインデックス+1を出力
    }
  }
}
