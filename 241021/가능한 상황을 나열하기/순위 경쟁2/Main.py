n = int(input())

arr = [
  input().split()
  for i in range(n)
]

A = 0
B = 0

def get_rank(a, b):
  # A가 명예의 전당인 경우
  if (a > b):
    return 1
  # B가 명예의 전당인 경우
  elif (b > a):
    return 2
  # A B 둘다 명예의 전당인 경우
  else: 
    return 3
  
answer = 0

for name, value in arr:
  value = int(value)

  # A값 갱신
  if name == 'A':
    # 명예의 전당 조합이 변하면 카운트
    if get_rank(A, B) != get_rank(A+value, B):
      answer += 1

    
    A += value

  #B값 갱신
  elif name == 'B':
    # 명예의 전당 조합이 변하면 카운트
    if get_rank(A, B) != get_rank(A, B+value):
      answer += 1

    
    B += value

print(answer)
