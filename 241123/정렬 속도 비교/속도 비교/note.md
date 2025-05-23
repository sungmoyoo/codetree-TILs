# 정렬
## 속도 비교

거품, 선택, 삽입 정렬 알고리즘의 시간복잡도는 O(N^2)이라는 공통점이 있지만, 실제 소요되는 시간이 많이 다르다.

- 거품 정렬의 경우, 일반적으로 셋 중 가장 느리다. 그러나 정렬된 배열의 경우, sorted의 값이 계속 true이기 때문에 O(N)으로 매우 빨라진다.

- 선택 정렬의 경우 배열의 상태와 상관 없이, 1번째로 작은 원소를 찾고, 2번째로 작은 원소를 찾고, ... 하는 과정을 거치기 때문에 어떠한 상황이던 동일한 시간을 보여준다.

- 삽입 정렬의 경우 일반적으로는 가장 빠르나, 값이 반대로 정렬되어 있는 경우 성능이 많이 떨어진다는 단점이 있다. 또한, 앞 배열에 값을 삽입하는 알고리즘의 특성상 이미 정렬된 배열에 추가적으로 값을 몇개 추가하여 정렬하는 경우에 좋은 성능을 보여주며 이미 정렬된 배열의 경우 거품정렬과 동일한 시간복잡도(O(N))를 가진다.

- 기수 정렬의 경우, 정렬이 되어있어도 정렬과정이 그대로이기 때문에, 시간복잡도는 정렬 여부와 관계없이 O(k*N)이 된다.