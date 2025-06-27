import java.util.Scanner;

public class D213_タイプ数の予想 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 9999) {
        return;
      }

      System.out.println(n * 365);
    }
  }
}
