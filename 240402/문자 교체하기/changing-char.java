import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char[] arr = s2.toCharArray();

        for (int i = 0; i < 2; i++) {
            arr[i] = s1.charAt(i);
        }

        System.out.println(String.valueOf(arr));

        sc.close();
    }
}