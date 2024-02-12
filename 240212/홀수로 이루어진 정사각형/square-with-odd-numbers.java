import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < 2*n; i+=2) {
            for (int j = 1; j < 2*n; j+=2) {
                System.out.print((10 + j + i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}