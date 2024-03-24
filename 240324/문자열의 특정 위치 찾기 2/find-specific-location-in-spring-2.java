import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] list = {"apple", "banana", "grape", "blueberry", "orange"};
        int count = 0;

        char input = sc.next().charAt(0);

        for (String value : list) {
            if (value.charAt(2) == input || value.charAt(3) == input) {
                System.out.println(value);
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}