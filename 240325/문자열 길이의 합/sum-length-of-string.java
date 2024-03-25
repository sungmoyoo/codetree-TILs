import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int length = 0;
        int aCount = 0;
        String[] list = new String[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLine();
            length += list[i].length();
            if (list[i].charAt(0) == 'a') {
                aCount++;
            }
        }

        System.out.printf("%d %d", length, aCount);

        sc.close();
    }
}