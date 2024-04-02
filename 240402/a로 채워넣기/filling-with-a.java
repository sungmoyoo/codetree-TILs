import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        arr[1] = 'a';
        arr[arr.length-2] = 'a';

        String result = String.valueOf(arr);
        System.out.println(result);

        sc.close();
    }
}