import java.util.Scanner;

public class D031_分から秒へ {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 100) {
        return;
      }

      System.out.println(n * 60);
    }
  }
}
