import sys

n = int(input())

arr = [0] + list(map(int, input().split()))

arr.sort()

i = 0

answer = sys.maxsize

for i in range(1, n + 1):
  answer = min(answer ,arr[i + n] - arr[i])
  i += 1

print(answer)
