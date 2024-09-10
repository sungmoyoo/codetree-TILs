  import java.util.Arrays;
  import java.util.Scanner;

  public class Main {

    public static int[] P = new int[1000];

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int B = sc.nextInt();

      for (int i = 0; i < N; i++) {
        P[i] = sc.nextInt();
      }

      int max = 0;

      for (int i = 0; i < N; i++) {
        int[] temp = P.clone();
        temp[i] /= 2;
        Arrays.sort(temp);

        int sum = 0;
        int count = 0;

        for (int j = 0; j < N; j++) {
         int price = temp[j];

         if (sum + price > B) {
           break;
         }

          sum += price;
          count++;
        }

        max = Math.max(max, count);
      }

      System.out.println(max);
    }
  }