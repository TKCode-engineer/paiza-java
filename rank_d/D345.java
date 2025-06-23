import java.util.Scanner;

public class D345 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    // Math.max()をネスト（入れ子）して使用する
    // 1. まず Math.max(b, c) で b と c の大きい方が求められる
    // 2. 次にその結果と a を Math.max() で比較し、最終的な最大値を得る
    int max = Math.max(a, Math.max(b, c));

    System.out.println(max);

    sc.close();
  }
}
