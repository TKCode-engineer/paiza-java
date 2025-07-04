package rank_c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 辞書データの順序 {
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
      Map<String, Integer> damageMap = new HashMap<>();
      for (int i = 0; i < attackCount; i++) {
        var name = sc.next();
        var damage = sc.nextInt();
        damageMap.merge(name, damage, Integer::sum);
      }

      Collections.sort(personNames);

      for (String name : personNames) {
        int totalDamage = damageMap.getOrDefault(name, 0);
        System.out.println(totalDamage);
      }
    }
  }
}
