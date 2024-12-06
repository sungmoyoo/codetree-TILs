# 정렬
## 배열과 스택의 차이
배열에서 값을 삽입/삭제하는데에는 일반적으로 O(N)의 시간복잡도가 소요된다. 만약 맨 뒤에서 값을 넣고, 뺀다면 시간복잡도는 O(1)이 된다. 이는 삽입과 삭제 연산이 동일한 곳에서 진행되므로, 결국 스택과 동일한 구조라고 볼 수 있다.

배열에서 삽입과 삭제 연산이 발생하는 장소를 맨 뒤로 제한한다면, 배열을 스택처럼 사용할 수 있다.

삽입에 해당 하는 함수 push(E)와 삭제에 해당하는 함수 pop()는 다음과 같이 구현할 수 있다.
단, 불가능한 상황에서는 throw exception()을 수행해야 하며, 배열에서 사용 가능한 index 범위는 0에서 maxsize - 1 사이라고 가정한다.
```
function push(arr, E)
  if arr.size == maxsize
    throw exception()

  arr.append(E)

function pop(arr) 
  if arr.size == 0
    throw exception()

  set last = arr[arr.size - 1]
  delete arr[arr.size - 1]
  
  return last
```