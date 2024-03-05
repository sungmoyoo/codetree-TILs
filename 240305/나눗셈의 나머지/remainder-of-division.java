import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        int[] countArr = new int[b];

        while (true) {
            countArr[a%b]++;
            a /= b;
            if (a <= 1) {
                break;
            }
        }
        
        for (int value : countArr) {
            result += value*value;
        }
        System.out.println(result);

        sc.close();
    }
}