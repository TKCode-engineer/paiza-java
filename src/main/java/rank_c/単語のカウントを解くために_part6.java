package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 単語のカウントを解くために_part6 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var color = sc.nextLine().split(" ");
      var s = sc.next();

      IntStream.range(0, color.length).filter(i -> s.equals(color[i])).findFirst()
          .ifPresent(System.out::println);
    }
  }
}
