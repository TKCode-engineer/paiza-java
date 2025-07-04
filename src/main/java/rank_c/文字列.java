package rank_c;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class 文字列 {

  record TimeProcessArgs(String timeStr, int addHours, int addMinutes) {
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      Function<TimeProcessArgs, String> timeProcessor = timeArgs -> {
        LocalTime startTime = LocalTime.parse(timeArgs.timeStr());
        LocalTime endTime =
            startTime.plusHours(timeArgs.addHours()).plusMinutes(timeArgs.addMinutes());
        return endTime.format(DateTimeFormatter.ofPattern("HH:mm"));
      };

      var numWeeks = sc.nextInt();

      IntStream.range(0, numWeeks).mapToObj(i -> {
        var startTime = sc.next();
        var durationHours = sc.nextInt();
        var durationMinutes = sc.nextInt();
        return new TimeProcessArgs(startTime, durationHours, durationMinutes);
      }).map(timeProcessor).forEach(System.out::println);
    }
  }
}
