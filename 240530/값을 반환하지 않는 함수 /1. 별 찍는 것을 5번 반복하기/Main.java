public class Main {  
  public static void printStar() {
    for (int i = 0; i < 5; i++) {
      System.out.println("**********");
    }
  }

  public static void main(String[] args) {
    printStar();
  }
}
  
// 함수(메서드)는 특정 목적을 수행하는 하나의 도구
// static을 붙이는 이유?
// Main 클래스 안에서 사용할 때 static을 붙이지 않으면 
// 객체를 생성한 후에 객체를 통해 접근해야 한다. 
// static이 붙으면 클래스 멤버가 되는데 클래스 멤버는
// 객체를 생성하지 않고도 클래스 이름을 통해 접근할 수 있다. 
// 위 코드의 경우 같은 클래스 내에 있기 때문에 바로 메서드를 호출할 수 있다. 
