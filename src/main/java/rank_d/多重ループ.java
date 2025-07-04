package rank_d;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 多重ループ {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // これから与えられる文字の個数を示す整数 m が1つだけ書かれています。
      var m = sc.nextInt();

      // m個の文字が、1行に1つずつ書かれています。
      List<Character> charList =
          IntStream.range(0, m).mapToObj(i -> sc.next().charAt(0)).collect(Collectors.toList());

      // これから与えられる文字列の個数を示す整数 n が1つだけ書かれています。
      var n = sc.nextInt();

      // n個の文字列が、1行に1つずつ書かれています。
      List<String> stringList =
          IntStream.range(0, n).mapToObj(i -> sc.next()).collect(Collectors.toList());

      charList.forEach(c -> stringList.forEach(s -> {
        boolean found = s.contains(String.valueOf(c));
        System.out.println(found ? "YES" : "NO");
      }));
    }
  }
}
