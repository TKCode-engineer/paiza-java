package rank_c;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 辞書 {
  record AB(int i, int j) {
  }

  record BC(int j, int k) {
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var p = sc.nextInt();
      var q = sc.nextInt();
      var r = sc.nextInt();

      List<AB> abList = new ArrayList<>();
      List<BC> bcList = new ArrayList<>();

      for (int x = 1; x < p + 1; x++) {
        // A グループの i 番目の人
        int i = sc.nextInt();
        // B グループの j 番目の人
        int j = sc.nextInt();
        abList.add(new AB(i, j));
      }
      for (int x = p + 2; x < p + q + 2; x++) {
        // B グループの j 番目の人
        int j = sc.nextInt();
        // C グループの k 番目の人
        int k = sc.nextInt();
        bcList.add(new BC(j, k));
      }

      abList.stream().sorted(Comparator.comparingInt(AB::i)).forEach(ab -> {
        int i = ab.i();
        int j = ab.j();

        bcList.stream().filter(bc -> j == bc.j()).findFirst()
            .ifPresent(bc -> System.out.println(i + " " + bc.k()));
      });
    }
  }
}
