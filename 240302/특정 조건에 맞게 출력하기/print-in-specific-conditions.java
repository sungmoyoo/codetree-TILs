import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }

        for (int value : list) {
            if (value % 2 == 0) {
                System.out.print(value/2 + " ");
            } else {
                System.out.print((value+3) + " ");
            }
        }
        sc.close();
    }
}