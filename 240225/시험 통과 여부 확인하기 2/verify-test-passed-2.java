import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int score = sc.nextInt();
                sum += score;
            }
            if ((double) sum/4 >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);

        sc.close();

    }
}