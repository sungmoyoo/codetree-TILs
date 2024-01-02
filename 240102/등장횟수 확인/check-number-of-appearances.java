import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int cnt = 0;

        while(i++ < 5) {
            int num = sc.nextInt();
            if(num % 2 == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}