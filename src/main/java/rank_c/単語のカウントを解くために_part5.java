package rank_c;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class 単語のカウントを解くために_part5 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextLine();
      var color = n.split(" ");
      Set<String> seen = new HashSet<>();

      IntStream.range(0, color.length).forEach(i -> {
        if (seen.contains(color[i])) {
          System.out.println(1);
        } else {
          System.out.println(color[i]);
        }
        seen.add(color[i]);
      });
    }
  }
}
