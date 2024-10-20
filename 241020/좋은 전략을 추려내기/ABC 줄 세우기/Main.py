n = int(input())
arr = [0] + list(input().split())

answer = 0
for i in range(1, n+1):
  # chr(정수): 정수를 유니코드 문자로
  # ord(문자): 문자를 유니코드 정수로
  alphabet = chr(ord('A') + i - 1)

  idx = 0
  for j in range(1, n + 1):
    if arr[j] == alphabet:
      idx = j
  
  for j in range(idx - 1, i - 1, -1):
    arr[j], arr[j+1] = arr[j+1], arr[j]
    answer += 1

print(answer)