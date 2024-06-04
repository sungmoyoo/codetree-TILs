import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    divide(arr);

    for (int result : arr) {
      System.out.print(result + " ");
    }
    sc.close();
  }

  public static void divide(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        arr[i] /= 2;
      }
    }
  }
}