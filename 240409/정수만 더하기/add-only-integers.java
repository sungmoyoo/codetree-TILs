import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += (int) s.charAt(i) - (int) '0';
            }
        }

        System.out.println(sum);

        sc.close();
    }
}