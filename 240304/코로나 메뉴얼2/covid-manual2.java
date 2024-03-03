import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0, 0, 0, 0};

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int t = sc.nextInt();

            if (s.equals("Y")) {
                if (t < 37) {
                    arr[2]++;
                } else {
                    arr[0]++;
                }
            } else {
                if (t < 37) {
                    arr[3]++;
                } else {
                    arr[1]++;
                }
            }
        }
        if (arr[0] > 1) {
            for (int count : arr) {
                System.out.print(count + " ");
            }
            System.out.print("E");
        } else {
             for (int count : arr) {
                System.out.print(count + " ");
            }
        }
        
        sc.close();
    }
}