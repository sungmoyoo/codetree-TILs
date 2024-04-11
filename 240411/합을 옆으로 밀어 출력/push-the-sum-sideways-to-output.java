import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        StringBuilder result = new StringBuilder(Integer.toString(sum));

        result.append(result.charAt(0)).deleteCharAt(0);
        System.out.println(result);
    }
}