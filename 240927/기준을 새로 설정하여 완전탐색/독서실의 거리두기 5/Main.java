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
    // 인원을 하나씩 배치하는 완전탐색
    for (int i = 0; i < N; i++) {
      // 이미 자리에 사람이 있는 경우 패스
      if (seats[i] == '1') {
        continue;
      }

      // 자리가 있는 경우 복사한 배열에 투입
      char[] newSeats = Arrays.copyOf(seats, N);
      newSeats[i] = '1';

      int closest = Integer.MAX_VALUE; // 가장 가까운 두 사람의 거리
      int distance = 0; // 거리 계산
      boolean isCounting = false; // 첫 1이 나올 때까지 거리 계산하지 않도록 사용하는 변수

      // 새 배치에서 가장 가까운 두 사람의 거리 계산
      for (int j = 0; j < N; j++) {
        if (newSeats[j] == '1') {
          // 앞서 1이 존재한 경우에만 가까운 거리 계산
          if (isCounting) {
            closest = Math.min(distance, closest);
          }

          distance = 0; // 거리 초기화
          isCounting = true; 
        }
        distance++;
      }

      // i에 1이 들어갈 경우 가장 가까운 두사람의 거리 최댓값
      answer = Math.max(closest, answer);
    }
    System.out.println(answer);
  }
}
