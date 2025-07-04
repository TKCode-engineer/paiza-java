package rank_c;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 検索履歴 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      List<String> history = new LinkedList<>();
      IntStream.range(0, n).forEach(i -> {
        var w = sc.next();
        history.remove(w);
        history.add(0, w);
      });

      history.forEach(System.out::println);
    }
  }
}
