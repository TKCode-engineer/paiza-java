import java.util.Scanner;

public class D241 {
      public static void main(String[] args) {
        // Scannerクラスのインスタンスを作成し、標準入力を受け取る準備をします。
        Scanner sc = new Scanner(System.in);

        // 入力された整数（1日に進めるページ数）を読み込み、変数nに代入します。
        int n = sc.nextInt();

        // 100日分のページ数を計算します (n * 100)。
        int result = n * 100;

        // 計算結果を出力します。
        // System.out.printlnは、出力の最後に自動で改行を追加します。
        System.out.println(result);

        // Scannerを閉じてリソースを解放します。
        sc.close();
    }
}
