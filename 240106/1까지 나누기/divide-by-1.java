import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;
        int count = 0;

        while (true) {
            count++;
            n /= i++;
            if (n <= 1) {
                break;
            }

        }

        System.out.println(count);
    }
}