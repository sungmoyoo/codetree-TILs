import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] arr = s.toCharArray();
        char temp = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == temp) {
                arr[i] = arr[0];
            }
        }
        
        s = String.valueOf(arr);
        System.out.println(s);

        sc.close();
    }
}