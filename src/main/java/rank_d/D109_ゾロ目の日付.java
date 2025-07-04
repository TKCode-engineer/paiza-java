package rank_d;

import java.util.Scanner;

public class D109_ゾロ目の日付 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 完全なトークンを検索して返す
            // 完全なトークンの前後には、区切り文字パターンに一致する入力が配置される
            var m = sc.nextInt();
            var d = sc.nextInt();

            if (m < 1 || m > 12 || d < 1 || m > 31) {
                return;
            }

            // ゾロ目判定（連結文字がすべて同じ文字か）
            String combined = String.valueOf(m) + String.valueOf(d);

            // combined.chars():文字列の各文字を int（Unicode値）として順に返す IntStream を生成
            // allMatch:「全ての要素が条件を満たすか？」をチェックするメソッド
            // c ->: ストリーム内の1文字（int値）を c として受け取る
            // c == combined.charAt(0): 先頭文字と同じか比較する条件式
            boolean isZorome = combined.chars()
                .allMatch(c -> c == combined.charAt(0));

            System.out.println(isZorome ? "Yes" : "No");
        }
    }
}
