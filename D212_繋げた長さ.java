import java.util.Scanner;

public class D212_繋げた長さ {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 0 || n > 100) {
        return;
      }
      // 長さ N の棒を 10 本繋げた棒の長さ
      System.out.println(n * 10);
    }
  }
}
