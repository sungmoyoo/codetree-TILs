import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == 'e' && s.charAt(i+1) == 'e') {
                count1++;
            }
            if (s.charAt(i) == 'e' && s.charAt(i+1) == 'b') {
                count2++;
            }
        }

        System.out.printf("%d %d", count1, count2);

        sc.close();
    }
}