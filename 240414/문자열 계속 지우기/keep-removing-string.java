import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder A = new StringBuilder(sc.nextLine());
        String B = sc.nextLine();

        while (true) {
            int index = A.toString().indexOf(B);
            if (index == -1) {
                break;
            }
            for (int i = 0; i < B.length(); i++) {
                A.deleteCharAt(index);
            }
        }
        System.out.println(A);
        sc.close();
    }
}