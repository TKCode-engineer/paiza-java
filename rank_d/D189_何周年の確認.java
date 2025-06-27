import java.util.Scanner;

public class D189_何周年の確認 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var x = sc.nextInt();
      var y = sc.nextInt();

      if (x < 1900 || y > 2021 || x > y) {
        return;
      }

      System.out.println(y - x);
    }
  }
}
