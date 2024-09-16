import java.util.Scanner;

public class Main {
  public static int[] Ta = new int[1000];
  public static int[] Tb = new int[1000];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int N = sc.nextInt();
    int C = sc.nextInt();
    int G = sc.nextInt();
    int H = sc.nextInt();

    for (int i = 0; i < N; i++) {
      Ta[i] = sc.nextInt();
      Tb[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    // 온도의 최대 범위는 0부터 1000까지이므로 해당 온도 범위를 완전탐색
    for (int i = 0; i < 1000; i++) {
      int sum = 0;
      // i 온도의 각 작업량을 합산
      for (int j = 0; j < N; j++) {
        if (i < Ta[j]) {
          sum += C;
        } else if (i > Tb[j]) {
          sum += H;
        } else {
          sum += G;
        }
      }
      // 최대 작업량 계산
      max = Math.max(max, sum);
    }


    // 출력
    System.out.println(max);
  }
}