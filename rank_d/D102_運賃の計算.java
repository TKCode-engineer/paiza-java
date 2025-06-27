import java.util.Scanner;

public class D102_運賃の計算 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 30) {
        return;
      }

      System.out.println(n * 10 + 100);
    }
  }
}
