import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int[] x = new int[MAX_N];
  public static int[] y = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    // 점 입력
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }


    int answer = Integer.MAX_VALUE;
    // x와 y 선 값 완전탐색
    // i는 x, j는 y
    for (int i = 0; i <= MAX_N; i += 2) {
      for (int j = 0; j <= MAX_N; j += 2) {
        // 특정 구역의 최대 점 개수
        int max = Integer.MIN_VALUE;


        // 1사분면 점 카운트
        int count = 0;
        for (int k = 0; k < N; k++) {
          if (x[k] > i && y[k] > j) {
            count++;
          }
        }
        max = Math.max(max, count); // 최댓값 갱신

        // 2사분면 점 카운트
        count = 0; // 이전 카운트 초기화
        for (int k = 0; k < N; k++) {
          if (x[k] < i && y[k] > j) {
            count++;
          }
        }
        max = Math.max(max, count);

        // 4사분면 점 카운트
        count = 0;
        for (int k = 0; k < N; k++) {
          if (x[k] > i && y[k] < j) {
            count++;
          }
        }
        max = Math.max(max, count);

        // 3사분면 점 카운트
        count = 0;
        for (int k = 0; k < N; k++) {
          if (x[k] < i && y[k] < j) {
            count++;
          }
        }
        max = Math.max(max, count);
        
        // 최댓값 중 최소
        answer = Math.min(answer, max);
      }
    }

    System.out.println(answer);
  }
}
