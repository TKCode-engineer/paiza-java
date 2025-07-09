package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C097_プレゼント応募企画の実施 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var applicant = sc.nextInt();
      var x = sc.nextInt();
      var y = sc.nextInt();

      IntStream.rangeClosed(1, applicant).forEach(i -> {
        if (i % x == 0 && i % y == 0) {
          System.out.println("AB");
        } else if (i % x == 0) {
          System.out.println("A");
        } else if (i % y == 0) {
          System.out.println("B");
        } else {
          System.out.println("N");
        }
      });
    }
  }
}
