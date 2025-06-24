import java.util.Scanner;

public class D120_鉛筆の数 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 50) {
        return;
      }

      System.out.println(n * 12);
    }
  }
}
