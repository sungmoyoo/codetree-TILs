import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        if (c == 'z') {
            c = 'a';
        } else {
            c = (char) (c + 1);
        }
        
        System.out.print(c);

        sc.close();
    }
}