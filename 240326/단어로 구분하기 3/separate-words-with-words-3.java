import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] list = new String[10];

        for (int i = 0; i < 10; i++) {
            list[i] = sc.next();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(list[i]);
        }

        sc.close();
    }
}