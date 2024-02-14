import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(cnt+j+1 + " ");
                }
                cnt += n;
            } else {
                for (int j = 0; j < 2*n; j += 2) {
                    System.out.print(cnt+j+2 + " ");
                }
                cnt += 2*n;
            }
            System.out.println();
        }
        sc.close();
    }
}