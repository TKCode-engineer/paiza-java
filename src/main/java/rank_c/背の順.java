package rank_c;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 背の順 {
  public record Student(String name, int height) {
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      var n = sc.nextInt();

      List<Student> studentList = IntStream.range(0, n).mapToObj(i -> {
        var height = sc.nextInt();
        var name = sc.next();
        return new Student(name, height);
      }).sorted(Comparator.comparing(Student::height).reversed()).collect(Collectors.toList());

      studentList.forEach(s -> System.out.println(s.name()));
    }
  }
}
