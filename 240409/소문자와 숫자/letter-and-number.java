import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57 || 
                s.charAt(i) >= 65 && s.charAt(i) <= 90 ||
                s.charAt(i) >= 97 && s.charAt(i) <= 120) {
                    result += s.charAt(i);
                }
        }

        System.out.println(result.toLowerCase());

        sc.close();
    }
}