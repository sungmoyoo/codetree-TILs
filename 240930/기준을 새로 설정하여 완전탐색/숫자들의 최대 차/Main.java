import java.util.Scanner;

public class Main {
  public static int MAX_N = 1000;
  public static int MAX_RANGE = 10000;
  public static int[] arr = new int[MAX_N];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int N = sc.nextInt();
    int K = sc.nextInt();

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    // 최대 최소를 따로 선택할 필요 없이 최대 최소 차이만큼의 구간을 설정하면 개념을 이해하기 쉽다.
    // 따라서 i ~ i+k 범위의 구간을 완전탐색하여 해당 구간 안에 수를 카운팅
    for (int i = 0; i <= MAX_RANGE; i++) {
      int count = 0;
      for (int j = 0; j < N; j++) {
        if (i <= arr[j] && arr[j] <= i+K) {
          count++;
        }
      }
      max = Math.max(max, count);
    }

    System.out.println(max);
  }
}
