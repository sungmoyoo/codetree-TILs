n = 10
arr = [
  input()
  for i in range(n)
]

# 최단 거리로 가는 경우의 수


# 3. L과 B가 가로방향으로 일직선상에 있는 경우

#위치 찾기
for i in range(n):
  for j in range(n):
    if arr[i][j] == 'L':
      lx = i
      ly = j
    if arr[i][j] == 'B':
      bx = i
      by = j
    if arr[i][j] == 'R':
      rx = i
      ry = j

# 1. L과 B가 일직선상에 없는 경우
if lx != bx and ly != by:
  print (abs(lx - bx) + abs(ly - by) - 1)

# 2. L과 B가 세로방향으로 일직선상에 있는 경우
# 일직선 사이에 R이 있을 때에만 2칸을 돌아간다
elif ly ==  by:
  if ly == ry and rx >= min(bx, lx) and rx <= max(bx, lx):
    print(abs(lx - bx) + abs(ly - by) + 1)
  else:
    print(abs(lx - bx) + abs(ly - by) - 1)

# 3. L과 B가 가로방향으로 일직선상에 있는 경우
# 2번과 동일
elif ly ==  by:
  if ly == ry and ry >= min(by, ly) and ry <= max(by, ly):
    print(abs(lx - bx) + abs(ly - by) + 1)
  else:
    print(abs(lx - bx) + abs(ly - by) - 1)