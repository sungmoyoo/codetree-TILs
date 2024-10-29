arr = list(map(int, input().split()))
n = len(arr)
arr.sort()

A, B = arr[0], arr[1]
C = arr[-1] - A - B

print(A, B, C) 