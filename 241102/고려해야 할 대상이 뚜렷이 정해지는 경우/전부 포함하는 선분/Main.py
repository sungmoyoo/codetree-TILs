import sys
# 모든 선분을 포함하는 최소 선분을 찾기 위해서는
# 가장 작은 x값 또는 가장 큰 x값을 포함하는 선분 두개만 제외해보면 된다.

# 한 선분을 제외한 n-1 개의 선분을 모두 포함하는 선분 길이를 구하는 함수
def get_min_length(idx):
  new_x1, new_x2 = [], []
  for i in range(n):
    if (i == idx):
      continue
    
    new_x1.append(x1[i])
    new_x2.append(x2[i])

  return max(new_x2) - min(new_x1)

# 입력
n = int(input())
x1, x2 = [],[]

for i in range(n):
  a, b  = map(int, input().split())
  x1.append(a)
  x2.append(b)

# 가장 작은 x와 가장 큰 x를 포함하는 선분의 인덱스 
min_x = x1.index(min(x1))
max_x = x2.index(max(x2))

# 정답 계산
answer = sys.maxsize
answer = min(answer, get_min_length(min_x))
answer = min(answer, get_min_length(max_x))

print(answer)



    


  



