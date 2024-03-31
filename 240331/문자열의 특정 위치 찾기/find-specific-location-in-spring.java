import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().charAt(0);

        int exist = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                exist = i;
                break;
            } 
        }

        if (exist == -1) {
            System.out.println("No");
        } else {
            System.out.println(exist);
        }
        
        sc.close();
    } 
}