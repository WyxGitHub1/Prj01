package Lean;
import java.util.Arrays;
public class Test1 {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("args = " + Arrays.deepToString(args));
        int i = 1;
        int b = 2;
        System.out.println("i = " + i);

        for (int j = 0; j < 11; j++) {
            System.out.println();
        }

        String[] arr = {"123", "!23", "!23"};
        for (String s : arr) {
            System.out.println("s = " + s);
        }

        i = 1;

    }

    public void m() {

    }
}
