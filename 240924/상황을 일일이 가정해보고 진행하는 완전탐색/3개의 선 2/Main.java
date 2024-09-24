import java.util.Scanner;

public class Main {
  public static int MAX_N = 20;
  public static int MAX_XY = 10;
  public static int[] xArr = new int[MAX_N];
  public static int[] yArr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    // 점 입력
    for (int i = 0; i < N; i++) {
      xArr[i] = sc.nextInt();
      yArr[i] = sc.nextInt();
    }
    int answer = 0;

    // 0~10까지 선 3개의 선 완전탐색
    for (int i = 0; i <= MAX_XY; i++) {
      for (int j = 0; j <= MAX_XY; j++) {
        for (int k = 0; k <= MAX_XY; k++) {

          // x선 = 3, y선 = 0 일 때
          boolean isAnswer = true;
          // 점을 지나가는지 탐색
          for (int l = 0; l < N; l++) {
            // 3개의 선이 하나라도 지나가면 통과
            if (xArr[l] == i || xArr[l] == j || xArr[l] == k) {
              continue;
            }
            // 선이 지나가지 않으면 탈락
            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }

          // x선 = 2, y선 = 1 일 때
          isAnswer = true;
          for (int l = 0; l < N; l++) {
            // 모든 선이 0~10까지 완전탐색이므로 i j k 순서는 상관없음
            if (xArr[l] == i || xArr[l] == j || yArr[l] == k) {
              continue;
            }

            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }

          // x선 = 1, y선 = 2 일 때
          isAnswer = true;
          for (int l = 0; l < N; l++) {
            if (xArr[l] == i || yArr[l] == j || yArr[l] == k) {
              continue;
            }

            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }

          // x선 = 0, y선 = 3 일 때
          isAnswer = true;
          for (int l = 0; l < N; l++) {
            if (yArr[l] == i || yArr[l] == j || yArr[l] == k) {
              continue;
            }

            isAnswer = false;
          }
          if (isAnswer) {
            answer = 1;
          }
        }
      }
    }
    System.out.println(answer);
  }
}
