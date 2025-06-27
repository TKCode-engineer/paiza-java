public class 条件を満たす最小の自然数 {
      public static void main(String[] args) {
        int n = 10000;
        while (n % 13 != 0) {
            n++;
        }
        System.out.println(n);
    }
}
