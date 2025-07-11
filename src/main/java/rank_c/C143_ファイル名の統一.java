package rank_c;

import java.util.Scanner;

public class C143_ファイル名の統一 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var fileName = sc.nextLine();
      System.out.println(fileName.replaceAll("-{2,}", "-"));
    }
  }
}
