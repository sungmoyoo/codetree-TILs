import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean p = true;
        
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            
            if (num % 3 != 0) {
                p = false;
            }
        }

        if (p == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}