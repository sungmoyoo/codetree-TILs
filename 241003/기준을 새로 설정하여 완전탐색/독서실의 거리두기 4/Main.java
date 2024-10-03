import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    int N = sc.nextInt();
    sc.nextLine();
    char[] seats = sc.nextLine().toCharArray();

    int answer = Integer.MIN_VALUE;

    // 인원을 배치하는 완전탐색
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        // i == j 같은 위치이거나 공석이 아닌 경우 패스
        if (i == j || seats[i] == '1' || seats[j] == '1') {
          continue;
        }

        // 새 배열을 만들어 자리 배치
        char[] newSeats = Arrays.copyOf(seats, N);
        newSeats[i] = '1';
        newSeats[j] = '1';

        int closest = Integer.MAX_VALUE;
        int distance = 0;
        boolean isCounting = false;

        // 거리 계산
        for (int k = 0; k < N; k++) {
          if (newSeats[k] == '1') {
            // 앞서 인원이 선택된 경우 가장 가까운 거리 갱신
            if (isCounting) {
              closest = Math.min(distance, closest);
            }
            distance = 0;
            isCounting = true;
          }

          distance++;
        }

        // 특정 배치의 최대 거리 계산
        answer = Math.max(closest, answer);
      }
    }
    System.out.println(answer);
  }
}
