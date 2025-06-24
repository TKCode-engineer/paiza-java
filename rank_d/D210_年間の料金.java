import java.util.Scanner;

public class D210_年間の料金 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var p = sc.nextInt();

      if (p < 100 || p > 10000) {
        return;
      }

      System.out.println(p * 12);
    }
  }
}
