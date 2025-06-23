import java.util.Scanner;

public class D007 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 整数Nを読み込む
        int n = sc.nextInt();

        // Java 11で追加された String.repeat() メソッドを使用
        // "*"という文字列をn回繰り返した新しい文字列を生成する
        String stars = "*".repeat(n);

        // 結果を出力する
        System.out.println(stars);

        sc.close();
    }
}
