import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char A = sc.next().charAt(0);
        char B = sc.next().charAt(0);

        System.out.print(A+B + " ");
        if (A > B) {
            System.out.print(A-B);
        } else {
            System.out.print(B-A);
        }

        sc.close();
    }
}