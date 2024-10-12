import java.util.Scanner;

public class Main {
  public static final int MAX_N = 100;
  public static final int MAX_NUM = 10;

  public static final int UNDEFINED = -1;

  public static int n;

  // 입력
  public static int[] pigeon = new int[MAX_N + 1];
  public static int[] direction = new int[MAX_N + 1];

  // 현재 비둘기의 위치를 기록
  public static int[] place = new int[MAX_NUM + 1];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 입력
    n = sc.nextInt();
    for(int i = 1; i <= n; i++) {
      pigeon[i] = sc.nextInt();
      direction[i] = sc.nextInt();
    }

    for(int i = 1; i <= MAX_NUM; i++)
      place[i] = UNDEFINED;

    int moveCount = 0;
    for(int i = 1; i <= n; i++) {
      if(place[pigeon[i]] == UNDEFINED) {
        place[pigeon[i]] = direction[i];
      }
      else if(place[pigeon[i]] != direction[i]) {
        place[pigeon[i]] = direction[i];
        moveCount++;
      }
    }

    System.out.print(moveCount);
  }
}