import java.util.Scanner;

public class 数字の文字列操作_0埋め {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        var n = sc.next();
        System.out.println(String.format("%3s", n).replace(" ", "0"));
    }
  }
}
