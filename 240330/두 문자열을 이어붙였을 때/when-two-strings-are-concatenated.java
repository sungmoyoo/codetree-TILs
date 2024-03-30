import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        String AB = A + B;
        String BA = B + A;

        if (AB.equals(BA)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}