import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String target = sc.nextLine();
        int exist = -1;

        for (int i = 0; i <= input.length()-target.length(); i++) {
            if (target.equals(input.substring(i, i+target.length()))) {
                exist = i;
                break;
            } 
        }
        
        System.out.println(exist);
        
    }
}