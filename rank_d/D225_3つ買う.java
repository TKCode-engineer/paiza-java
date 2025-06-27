import java.util.Scanner;

public class D225_3つ買う {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 0 || n > 10000) {
        return;
      }

      System.out.println(n * 3);
    }
  }
}
