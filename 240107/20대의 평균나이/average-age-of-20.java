import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        while (true) {
            int age = sc.nextInt();
            if (age-20 < 0 || age-20 >= 10) {
                break;
            }
            sum += age;
            count++;
        }
        float average = (float) sum / count;
        System.out.printf("%.2f", average);
        sc.close();
    }
}