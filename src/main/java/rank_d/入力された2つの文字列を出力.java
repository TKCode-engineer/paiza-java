package rank_d;

import java.util.Scanner;

public class 入力された2つの文字列を出力 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(String.format("%s\n%s", sc.nextLine(), sc.nextLine()));
    }
  }
}
