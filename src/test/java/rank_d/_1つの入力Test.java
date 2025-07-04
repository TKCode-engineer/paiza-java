package rank_d;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class _1つの入力Test {
  @Test
  void 標準入力を受け取り出力する() throws Exception {
    InputStream originalIn = System.in;
    PrintStream originalOut = System.out;

    String input = "テスト文字列";
    String expectedOutput = input + System.lineSeparator();

    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(out);

    try {
      System.setIn(in);
      System.setOut(ps);

      _1つの入力.main(null);

      assertEquals(expectedOutput, out.toString());
    } finally {
      System.setIn(originalIn);
      System.setOut(originalOut);
    }
  }
}
