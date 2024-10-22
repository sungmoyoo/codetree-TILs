import sys
n = int(input())

arr = list(map(int, input().split()))

temp = sorted(arr)
is_exist = False

second_number = 0

for i in temp:
  if i != temp[0]:
    is_exist = True
    second_number = i
    break

if (is_exist == False):
  print(-1)
  sys.exit()
else:
  answer = -1
  for idx, i in enumerate(arr):
    if (second_number == i):
      if (answer != -1):
        print(-1)
        sys.exit()
      answer = idx

  print(answer + 1)

