# 반복문에서의 시간복잡도

## for loop
```
set x = 0
for i = 0 ... i < 10
  x += 1
  print(x)
```
위의 코드는 for문에 의하여 10번 반복된다. 

내부의 시간복잡도가 O(1)이라는 것이 알기 때문에 10번을 반복해도 시간복잡도는 O(1 * 10) = O(1)이 된다

하지만 다음 코드처럼 불분명한 값이 들어오면 다르게 판단한다.
```
function example(n)
  set x = 0
  for i  = 0 ... i < n
    x += 1
    print(x) 
```
for문의 내부 코드의 시간복잡도는 그대로 O(1)이니 N번 반복하면 O(1 * N) = O(N)이지만 N의 값이 모르기 때문에 그대로 둔다.

*N의 경우에도 상수는 무시한다.


## while loop
```
function example(n)
  while 0 > n or n > 100
    if n < 0
      n++
    else
      n--
  return n
```

n이 0과 100 사이에 있다면 반복문에 진입 자체를 안하기 때문에 O(1)이다. 하지만 n이 아주 큰 값이라고 가정하면 100이하가 될 때까지 계속 순회하기 때문에 이론적으로 N-100의 순회를 한다. 따라서 시간복잡도는 O(1 * (N-100)) = O(N)이 된다.

*이중 반복문의 경우 
```
set x = 0
for i = 0 ... i < n
  for j = 5 ... j < n
      x += 1
      print(x)

for i = 0 ... i < n
    x += 1

print(x)
```

n^2 N 둘다 존재하지만 높은 차수는 n^2이므로 
시간복잡도는 O(n^2)가 된다.

# 문제
## for와 while
다음 코드의 시간복잡도를 판단해봅시다. (단, n은 5 이상의 숫자만 주어진다 가정합시다)
```
function solution(n)
  set A = 5
  set B = n
  while A != B
    for C = 0 ... C <= n
      print('hello')
    A++
  print('bye')
```

1. while문은 A가 B가 될때까지 n-5번 반복한다.
2. for문에서는 n-5번을 n번 반복한다.
3. 따라서 시간복잡도는 O(n*(n-5)) = O(n^2)이다.


