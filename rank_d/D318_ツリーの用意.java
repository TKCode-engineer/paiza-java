import java.util.Scanner;

public class D318_ツリーの用意 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      var m = sc.nextInt();

      if (n < 1 || n > 10 || m < 1 || m > 100) {
        return;
      }

      System.out.println(n * m);
    }
  }
}
