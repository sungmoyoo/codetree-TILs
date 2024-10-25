import sys

n = int(input())

arr = [-sys.maxsize] + list(map(int, input().split()))
negative, zero, positive = 0, 0, 0

arr.sort()

answer = 0

for i in range(1, n+1):
  if arr[i] < 0:
    negative += 1
  if arr[i] == 0:
    zero += 0
  if arr[i] > 0:
    positive += 1
    
if positive >= 3 or (positive >= 1 and negative >= 2):
  if positive >= 3:
    answer = max(answer, arr[n] * arr[n-1] * arr[n-2])
  if positive >= 1 and negative >= 2:
    answer = max(answer, arr[n] * arr[2] * arr[1])

elif zero >= 1:
  answer = 0

else:
  answer = arr[n] * arr[n-1] * arr[n-2]

print(answer)
# 양수 3개
# 양수 2개 음수 1개
# 음수 2개 양수 1개
# 음수 3개
# 0이 포함된 경우