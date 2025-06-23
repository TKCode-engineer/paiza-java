import java.util.Scanner;

public class D199 {
  public static void main(String[] args) {
    // 'try-with-resources'構文でScannerを安全に扱う
    try (Scanner sc = new Scanner(System.in)) {

      // var: コンパイラが右辺から型を自動で推論してくれる
      var n = sc.nextInt();
      var m = sc.nextInt();

      System.out.println(n * m);
    } // tryブロックを抜けると、sc.close()が自動的に呼び出される
  }
}
