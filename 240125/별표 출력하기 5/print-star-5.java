import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        


        for (int i = n; i > 0; i--) {
            StringBuilder strb = new StringBuilder("");
            for (int k = 0; k < i; k++) {
                strb.append("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(strb + " ");
            }
            System.out.println();
        }
    }
}