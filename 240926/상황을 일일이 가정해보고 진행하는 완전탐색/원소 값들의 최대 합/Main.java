import java.util.Scanner;

public class Main {
  public static int MAX_N = 100;
  public static int[] arr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    int answer = Integer.MIN_VALUE;

    // 시작 위치 완전탐색
    for (int i = 1; i <= n; i++) {
      int sum = 0;
      int idx = i; // 가변 인덱스

      // 움직임 m번 반복
      for (int j = 0; j < m; j++) {
        sum += arr[idx]; // 합
        idx = arr[idx]; // 다음 인덱스 지정
      }

      answer = Math.max(answer, sum); // 최댓값 계산
    }

    // 결과 출력
    System.out.println(answer);
  }
}
