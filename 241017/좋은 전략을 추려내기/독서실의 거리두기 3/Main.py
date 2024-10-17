import sys
n = int(input())
seats = list(input())

max = 0
max_i, max_j = -1, -1
for i in range(n):
  if (seats[i] == '1'):
    for j in range(i + 1, n):
      if (seats[j] == '1'):  
        if (j - i > max):
          max = j - i
          max_i, max_j = i, j
        
        break

seats[(max_i + max_j) // 2] = '1'

answer = sys.maxsize

for i in range(n):
  if (seats[i] == '1'):
    for j in range(i + 1, n):
      if (seats[j] == '1'):
        answer = min(answer, j-i)
        break

print(answer)