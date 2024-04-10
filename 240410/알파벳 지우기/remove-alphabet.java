import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                sb1.append(s1.charAt(i));
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (Character.isDigit(s2.charAt(i))) {
                sb2.append(s2.charAt(i));
            }
        }

        System.out.println(Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString()));

        sc.close();
    }
}