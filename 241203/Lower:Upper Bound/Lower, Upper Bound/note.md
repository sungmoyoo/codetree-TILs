# 정렬
## Lower Bound
만약 내가 찾는 값 target이 배열에 여러 개 있다면, 이진 탐색을 돌렸을 때, 어떤 위치가 나오게 될지 아무도 모른다. 이런 경우에 보통 사용하는 것이 Lower Bound이다.

Lower Bound는 원하는 값 target 이상의 값이 최초로 나오는 위치를 의미한다. 이는 바꿔말해 target보다 같거나 큰 원소의 위치들 중 가장 작은 값을 출력해야 한다는 것이다. 따라서 작은 값을 구하기 위해 min_idx라는 변수를 활용해 초기값으로 답이 될 수 없는 최댓값이 arr.size를 넣어놓고 문제를 해결한다. 이를 수도코드로 표현하면 다음과 같은 형태가 된다.

```
function lower_bound(arr, target)
  set left = 0
  set right = arr.size - 1
  set min_idx = arr.size
  while left <= right
    set mid = (left + right) / 2
    if (1)
      (2)
    else
      (3)

  return min_idx
```

이때, min_idx는 정의상 arr[mid]가 target보다 같거나 큰 경우에 대해 가능한 mid 값들 중 최솟값이 되어야 한다. 따라서 (1) 위치에 arr[mid] >= target 조건을 걸어준다. 왼쪽에 조건을 만족하는 mid값이 더 있을 수 있으므로 right값을 움직여줘야 하며, 이 경우 min_idx를 현재까지의 최솟값인 min_dix와 mid를 비교하여 둘 중 더 작은 값으로 넣어줘야 한다. 조건을 만족하지 않는 경우에는 left 값을 움직여주면 된다. 따라서 Lower Bound 코드는 다음과 같이 작성이 가능하다.

```
function lower_bound(arr, target)
  set left = 0
  set right = arr.size - 1
  set min_idx = arr.size
  while left <= right
    set mid = (left + right) / 2
    if arr[mid] >= target
      right = mid - 1
      min_idx = min(min_idx, mid)
    else
      left = mid + 1

  return min_idx
```

## Upper Bound
Upper Bound는 원하는 값 target을 초과하는 값이 최초로 나오는 위치를 의미한다.

Lower Bound 코드에서 등호만 제외하면, Upper Bound가 구해지는 코드가 된다.

lower bound와 upper bound의 성질을 잘 이해한다면 배열 내 데이터의 수는 두 값이 차이이며, 데이터가 존재하지 않는다면 두 값이 같음을 어렵지 않게 알 수 있다.

## Custom Bound
Custom Bound는 원하는 값 target 이하의 값이 마지막으로 나오는 위치를 의미한다. 이는 바꿔말해 target보다 같거나 작은 원소의 위치들 중 가장 큰 값을 출력해야 한다는 것이다. 따라서 큰 값을 구하기 위해 max_idx라는 변수를 활용해 초기값으로 답이 될 수 없는 최솟값인 -1을 넣어놓고 문제를 해결한다. 다음과 같은 형태가 된다.

```
function custom_bound(arr, target)
  set left = 0
  set right = arr.size - 1
  set max_idx = -1
  while left <= right
    set mid = (left + right) / 2
    if (1)
      (2)
    else
      (3)

  return max_idx
```

max_idx는 정의상 arr[mid]가 target보다 같거나 작은 경우에 대해 가능한 mid 값들 중 최댓값이 되어야 한다. 따라서 (1) 위치에 arr[mid] <= target 조건을 걸어주어야 한다. 오른쪽에 조건을 만족하는 mid값이 더 있을 수 있으므로 left값을 움직여줘야 하며, 이 경우 max_idx를 현재까지의 최댓값인 max_idx와 mid를 비교하여 둘 중 더 큰 값으로 넣어줘야 한다. 조건을 만족하지 않는 경우에는 right값을 움직여 주면 된다. 따라서 Custom Bound 코드는 다음과 같다.

```
function custom_bound(arr, target)
  set left = 0
  set right = arr.size - 1
  set max_idx = -1
  while left <= right
    set mid = (left + right) / 2
    if arr[mid] <= target
      left = mid + 1
      max_idx = max(max_idx, mid)
    else
      right = mid - 1

  return max_idx
```