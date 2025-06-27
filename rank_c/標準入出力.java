import java.util.Scanner;
import java.util.stream.IntStream;

public class 標準入出力 {

  // 社員データを表現するためのイミュータブルなデータクラスを1行で定義
  record Employee(String name, int age) {}
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      // 社員数
      var empCount = sc.nextInt();

      IntStream.range(0, empCount).mapToObj(i -> new Employee(sc.next(), sc.nextInt())) // 1. 入力からEmployeeオブジェクトに変換
      .map(emp -> emp.name() + " " + (emp.age() + 1)) // 2. Employeeオブジェクトから出力用文字列に変
      .forEach(System.out::println);
    }
  }
}
