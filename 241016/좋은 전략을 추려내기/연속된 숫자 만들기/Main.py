arr = list(map(int, input().split()))

# 리스트를 순서대로 정렬
arr.sort()

# 이미 연속된 수일 경우
if (arr[0] + 1 == arr[1] and arr[1] + 1 == arr[2]):
  print(0)

# 두 숫자 사이의 간격이 2 인 경우
elif (arr[0] + 2 == arr[1] or arr[1] + 2 == arr[2]):
  print(1)

# 모든 숫자가 간격이 2 이상인 경우
else:
  print(2)