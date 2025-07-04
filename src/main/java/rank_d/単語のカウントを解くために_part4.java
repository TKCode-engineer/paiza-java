package rank_d;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class 単語のカウントを解くために_part4 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextLine();
      var color = n.split(" ");
      Set<String> history = new LinkedHashSet<>();
      IntStream.range(0, color.length).forEach(i -> {
        history.add(color[i]);
      });

      history.forEach(System.out::println);
    }
  }
}
