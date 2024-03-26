import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] list = new String[n];
        double sum = 0;
        int sumCount = 0;

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLine();
        }
        char c = sc.nextLine().charAt(0);

        for (int i = 0; i < n; i++) {
            if (list[i].charAt(0) == c) {
                sum += list[i].length();
                sumCount++;
            }
        }
        System.out.printf("%d %.2f ",sumCount, sum/sumCount);

        sc.close();
    }
}