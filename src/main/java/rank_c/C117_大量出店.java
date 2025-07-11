package rank_c;

import java.util.Scanner;

public class C117_大量出店 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var stores = sc.nextInt();
      var businessMonths = sc.nextInt();
      sc.nextLine();

      var buildingCosts = sc.nextInt();
      var personnelExpenses = sc.nextInt();
      var grace = sc.nextInt();

      var closedCount = 0;
      for (int i = 0; i < stores; i++) {
        var ramenCount = sc.nextInt();
        var netIncome = grace * ramenCount - buildingCosts - personnelExpenses * businessMonths;
        if (netIncome < 0) {
          closedCount++;
        }
      }
      System.out.println(closedCount);
    }
  }
}
