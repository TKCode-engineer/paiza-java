package rank_c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 辞書の基本 {
  record Profile(String name, int asset) {
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();
      List<Profile> profiles = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        var name = sc.next();
        var asset = sc.nextInt();
        profiles.add(new Profile(name, asset));
      }

      var searchName = sc.next();

      profiles.stream().filter(p -> p.name().equals(searchName)).findFirst()
          .ifPresent(p -> System.out.println(p.asset()));
    }
  }
}
