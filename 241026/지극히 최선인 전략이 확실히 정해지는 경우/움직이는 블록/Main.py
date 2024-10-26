N = int(input())

arr = [
  int(input())
  for _ in range(N)
]

sum = sum(arr)


equal_count = sum // N

answer = 0

for i in arr:
  if i > equal_count:
    answer += i - equal_count

print(answer)