import java.util.Scanner;

public class D172_イヴの日付 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 2 || n > 31) {
        return;
      }

      System.out.println(n - 1);
    }
  }
}
