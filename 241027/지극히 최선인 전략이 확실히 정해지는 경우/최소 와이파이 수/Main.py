n, m = map(int,input().split())
arr = list(map(int, input().split()))

wifi = [0 for _ in range(n)]

answer = 0
i = 0

while i < n:
  if arr[i] == 1:
    answer += 1
    i += 2 * m + 1
  else:
    i += 1

print(answer)

