arr = list(map(int, input().split()))

arr.sort()

answer = 0

# 연속된 수인 경우
if (arr[0] + 1 == arr[1] == arr[2] - 1):
  print(0)

# 왼쪽 먼저 이동하는 경우
move = arr[2] - arr[1] - 1
answer = max(answer, move)

# 오른쪽 먼저 이동하는 경우
move = arr[1] - arr[0] - 1
answer = max(answer, move)

print(answer)