import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int range = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < range; j++) {
                sum += arr[i][j];
            }
            range++;
        }
        System.out.println(sum);

        sc.close();
    }
}