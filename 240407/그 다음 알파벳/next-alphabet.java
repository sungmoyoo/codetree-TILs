import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        System.out.print((char) (c + 1));

        sc.close();
    }
}