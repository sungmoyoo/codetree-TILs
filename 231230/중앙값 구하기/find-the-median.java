import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
            

        if (b > a && b > c) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
        
        if (c > b && c > a) {
            if (a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
    sc.close();
}