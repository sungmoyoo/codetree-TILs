import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int AB = Integer.parseInt(A+B);
        int BA = Integer.parseInt(B+A);

        System.out.println(AB + BA);

        sc.close();
    }
}