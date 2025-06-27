import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Function;

public class 数字の文字列操作_時刻2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      Function<String, String> add30Minutes = timeStr ->
        LocalTime.parse(timeStr)
          .plusMinutes(30)
          .format(DateTimeFormatter.ofPattern("HH:mm"));

      System.out.println(add30Minutes.apply(sc.next()));
    }
  }
}
