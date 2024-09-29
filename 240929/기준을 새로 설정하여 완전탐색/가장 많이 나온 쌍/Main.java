import java.util.Scanner;

public class Main {
  public static int MAX_M = 100;
  public static int[] a = new int[MAX_M];
  public static int[] b = new int[MAX_M];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;

    // a, b에 대해서 완전탐색 ( 1 <= a, b <= n )
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {

        int count = 0;
        for (int k = 0; k < m; k++) {
          // a,b 와 b,a는 같은 쌍으로 계산
          if ((a[k] == i && b[k] == j) || (a[k] == j && b[k] == i)) {
            count++;
          }
        }
        max = Math.max(max, count);
      }
    }
    System.out.println(max);
  }
}
