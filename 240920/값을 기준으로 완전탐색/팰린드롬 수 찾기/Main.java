import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 범위 입력
    int X = sc.nextInt();
    int Y = sc.nextInt();

    int answer = 0;
    for (int i = X; i <= Y; i++) {
      // i에 해당하는 숫자를 자리수별로 분리한다.
      List<Integer> list = splitNum(i);

      boolean isSame = true;
      // i에 해당하는 값과 길이-j가 모두 같은 경우를 찾음
      // 따라서 반복은 리스트길이의 절반까지만 함
      for (int j = 0; j <= list.size()/2; j++) {
        int a = list.get(j);
        int b = list.get(list.size()-j-1);

        if (a != b) {
          isSame = false;
          break;
        }
      }

      if (isSame) {
        answer++;
      }
    }

    System.out.println(answer);
  }

  // 주어진 숫자를 10자리수마다 나누어 담는 함수
  public static List<Integer> splitNum(int i) {
    ArrayList<Integer> list = new ArrayList<>();

    // 10보다 작아질때까지 반복하여 담음
    // 팰린드롬은 거꾸로 읽어도 동일하므로 순서 상관없이 리스트에 저장함
    while (i >= 10) {
      list.add(i % 10);
      i = i/10;
    }
    list.add(i);


    return list;
  }
}
