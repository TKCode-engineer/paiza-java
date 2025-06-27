import java.util.Scanner;

public class D226_伸びる身長 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 0 || n > 100) {
        return;
      }

      System.out.println(n + 170);
    }
  }
}
