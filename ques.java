import java.util.*;

public class ques {
    public static void main(String[] args) {
        foo();
    }

    public static void foo() {
        int x = 1, i = 2;
        do {
            x *= i;
            while (++i <= 5);
            System.out.println(x);
        } while (i <= 1);
    }
}