import java.util.Scanner;

class User {
  char codeName;
  int score;

  public User(char codeName, int score){
    this.codeName = codeName;
    this.score = score;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 5;
    User[] users = new User[n];
    for(int i = 0; i < n; i++) {
      char codeName = sc.next().charAt(0);
      int score = sc.nextInt();

      users[i] = new User(codeName, score);
    }

    int minUser = 0;
    for(int i = 1; i < n; i++) {
      if(users[minUser].score > users[i].score)
        minUser = i;
    }

    System.out.println(users[minUser].codeName + " " + users[minUser].score);
  }
}