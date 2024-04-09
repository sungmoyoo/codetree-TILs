import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char) (s.charAt(i) - 32));
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append((char) (s.charAt(i) + 32));
            }
        }

        System.out.println(sb);

        sc.close();
    }
}