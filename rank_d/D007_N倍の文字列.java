import java.util.Scanner;

public class D007_N倍の文字列 {
      public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          // 整数Nを読み込む
          var n = sc.nextInt();

          if (n < 1 || n > 100) {
            return;
          }

          // Java 11で追加された String.repeat() メソッドを使用
          // "*"という文字列をn回繰り返した新しい文字列を生成する
          String stars = "*".repeat(n);

          // 結果を出力する
          System.out.println(stars);
        }
    }
}
