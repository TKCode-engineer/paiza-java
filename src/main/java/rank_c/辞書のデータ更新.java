package rank_c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 辞書のデータ更新 {
  record DamageInfo(String name, int damage) {
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var personCount = sc.nextInt();
      List<String> personNames = new ArrayList<>();
      for (int i = 0; i < personCount; i++) {
        personNames.add(sc.next());
      }

      var attackCount = sc.nextInt();
      // List<DamageInfo> damageList = new ArrayList<>();
      Map<String, Integer> damageMap = new HashMap<>();
      for (int i = 0; i < attackCount; i++) {
        var name = sc.next();
        var damage = sc.nextInt();
        // damageList.add(new DamageInfo(name, damage));
        damageMap.merge(name, damage, Integer::sum);
      }

      var searchName = sc.next();

      // int totalDamage = damageList.stream().filter(d -> d.name().equals(searchName))
      // .mapToInt(DamageInfo::damage).sum();
      int totalDamage = damageMap.getOrDefault(searchName, 0);

      System.out.println(totalDamage);
    }
  }
}
