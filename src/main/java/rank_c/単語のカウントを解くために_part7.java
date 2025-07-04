package rank_c;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 単語のカウントを解くために_part7 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextLine();
      var color = n.split(" ");
      Map<String, Integer> map = new LinkedHashMap<>();

      IntStream.range(0, color.length).forEach(i -> {
        map.put(color[i], map.getOrDefault(color[i], 0) + 1);
      });

      map.keySet().forEach(System.out::println);

      map.values().forEach(System.out::println);
    }
  }
}
