import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += sc.next();
        }
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (count % 5 == 0) {
                System.out.println();
            }
            count++;
        }
        sc.close();
    }
}