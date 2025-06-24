import java.util.Scanner;

public class D166_何日後になるか {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      if (n < 1 || n > 52) {
        return;
      }

      System.out.println(n * 7);
    }
  }
}
