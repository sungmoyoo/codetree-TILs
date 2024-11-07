# 공간복잡도

공간복잡도는 코드가 메모리를 얼마나 차지하는지 계산하는 척도이다.

```
function example(n)
  set arr = [n][n]
  for i = 0 ... i < n
    for j = 0 ... j < n
      arr[i][j] = 1
```

위 예시를 보면 set arr = [n][n] 이라는 부분이 메모리를 차지하며 다른 코드는 메모리를 차지하고 있지 않다. 
따라서 공간복잡도는 O(N^2)이라고 볼 수 있다.

보통 메모리를 계산하는 경우에는 C++을 기준으로 생각하는데. C++에서는 int가 4 byte char이 1 byte, double이 8 byte, short가 2 byte 이렇게 정해져있다.

이를 토대로 계산해보면 int로 2백만이 대략 8MB라는 것을 이용하여 다음과 같이 쉽게 계산이 가능하다.

```
int a[2천만] : 80MB
int a[2백만] : 80 / 10 = 8MB
char a[2천만] : 80 / 4 = 20MB
double a[2천만] : 80 * 2 = 160MB
```

다음 코드를 잘 보고, 공간복잡도를 예측해봅시다.

```
function solution(n)
  set list = [n][n][n]
  for i= 0 ... i < n
    set tmp = [n]
    for j = 0 ... j < n
      tmp[j] = list[0][i][j]
```

위의 코드에서 메모리를 차지하는 부분이 set list = [n][n][n]뿐이다. 

따라서 정답은 O(n^3)이다.
