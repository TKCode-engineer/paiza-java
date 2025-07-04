package rank_d;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class 割り算Test {
    @Test
    void testMainOutput() {
        // ① 出力先のメモリ（バッファ）を用意
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // ② 現在の標準出力を保存
        PrintStream originalOut = System.out;
        // ③ 出力先を outBuffer に切り替え
        System.setOut(new PrintStream(out));

        try {
            // ④ いつもの出力
            割り算.main(new String[] {});
        } finally {
            // ⑤ 出力先を元に戻す
            System.setOut(originalOut);
        }
        // ⑥ バッファの中身を表示（＝キャプチャ成功！）
        String result = out.toString().trim();
        // 期待される出力
        assertEquals("48 1246", result);
    }
}
