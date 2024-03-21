import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int longest = Integer.MIN_VALUE;
        int shortest = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            String str = sc.nextLine();
            if (str.length() > longest) {
                longest = str.length();
            };
            
            if(str.length() < shortest) {
                shortest = str.length();
            };
        }
        System.out.println(longest-shortest);

        sc.close();
    }
}