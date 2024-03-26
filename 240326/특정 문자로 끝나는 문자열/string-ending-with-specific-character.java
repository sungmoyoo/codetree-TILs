import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] list = new String[10];
        for (int i = 0; i < 10; i++) {
            list[i] = sc.nextLine();
        }
        char c = sc.nextLine().charAt(0);
        
        int printCount = 0;
        for (int i = 0; i < 10; i++) {
            if (list[i].charAt(list[i].length()-1) == c) {
                System.out.println(list[i]);
                printCount++;
            }
        }

        if (printCount == 0) {
            System.out.println("None");
        }
        
        sc.close();
    }
}