package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 宝くじ {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var winningNumber = sc.nextInt();
      var n = sc.nextInt();

      IntStream.range(0, n).forEach(i -> {
        var lotteryNumber = sc.nextInt();
        if (lotteryNumber == winningNumber) {
          System.out.println("first");
        } else if (lotteryNumber == winningNumber + 1 || lotteryNumber == winningNumber - 1) {
          System.out.println("adjacent");
        } else if (lotteryNumber % 10000 == winningNumber % 10000) {
          System.out.println("second");
        } else if (lotteryNumber % 1000 == winningNumber % 1000) {
          System.out.println("third");
        } else {
          System.out.println("blank");
        }
      });
    }
  }
}
