import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = n;
        for (int i = 0; i < n; i++) {
            for (int j = cnt; j <= n; j++) {
                System.out.print(j + " ");
            }
            cnt--;
            System.out.println();
        }
        sc.close();
    }
}