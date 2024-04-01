import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        int count = 0;

        for (int i = 0; i <= A.length()-B.length(); i++) {
            if (B.equals(A.substring(i, i + B.length()))) {
                count++;
            }
        }

        System.out.println(count);
    }
}