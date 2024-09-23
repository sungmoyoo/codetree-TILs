import java.util.Scanner;

public class Main {
  public static int MAX_N = 1000;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int answer = Integer.MIN_VALUE;
    // A를 i번, B를 j번 더하기 위한 완전탐색
    for (int i = 0; i <= MAX_N; i++) {
      for (int j = 0; j <= MAX_N; j++) {
        int sum = A*i + B*j;

        // 더한 값이 C보다 크면 패스
        if (sum > C) {
          continue;
        }

        answer = Math.max(answer, sum);
      }
    }
    System.out.println(answer);
  }
}
