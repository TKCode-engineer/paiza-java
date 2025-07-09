package rank_c;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C155_メールのフィルタリング {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var advertisement = sc.nextLine();
      var n = sc.nextInt();
      sc.nextLine();

      IntStream.range(0, n).mapToObj(i -> sc.nextLine()).forEach(title -> {
        boolean matched = title.contains(advertisement);
        System.out.println(matched ? "Yes" : "No");
      });

    }
  }
}
