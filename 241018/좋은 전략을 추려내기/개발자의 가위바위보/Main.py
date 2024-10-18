# 1이 가위 2가 주먹 3이 보인 경우 # 1이 2에게 지고 3에게 이기는 경우
# 1이 가위 2가 보 3이 주먹인 경우 # 1이 2를 이기고 3이 1을 이기는 경우
# 1이 주먹 2가 가위 3이 보인 경우  # 1이 2를 이기고 3이 1을 이기는 경우
# 1이 주먹 2가 보 3이 가위인 경우 # 1이 2에게 지고 3에게 이기는 경우
# 1이 보 2가 가위 3이 주먹인 경우 # 1이 2에게 지고 3에게 이기는 경우
# 1이 보 2가 주먹 3이 가위인 경우 # 1이 2를 이기고 3이 1을 이기는 경우

# 결론적으로 
# 1이 2에게 지고 3에게 이기는 경우
# 1이 2를 이기고 3이 1을 이기는 경우 
# 2가지의 케이스만 남게 됨

n = int(input())

arr = [
  list(map(int, input().split()))
  for _ in range(n)
]

answer = 0
win = 0
for a, b in arr:
  if a == 1 and b == 2:
    win += 1
  elif a == 2 and b == 3:
    win += 1
  elif a == 3 and b == 1:
    win += 1

answer = max(answer, win)

win = 0
for a, b in arr:
  if a == 1 and b == 3:
    win += 1
  elif a == 2 and b == 1:
    win += 1
  elif a == 3 and b == 2:
    win += 1

answer = max(answer, win)

print(answer)