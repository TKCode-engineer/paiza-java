package rank_d;

import java.util.Scanner;

public class 半角スペース区切りの2つの入力 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println(String.format("%s\n%s", sc.next(), sc.next()));
    }
  }
}
