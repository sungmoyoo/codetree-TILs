import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] countArr = {0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }

        sc.close();
    }
}