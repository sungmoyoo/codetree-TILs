x1, y1, x2, y2 = map(int, input().split())
a1, b1, a2, b2 = map(int, input().split())

# 두 직사각형을 포함하는 직사각형의 최소 넓이

min_x = min(x1, a1)
max_x = max(x2, a2)
min_y = min(y1, b1)
max_y = max(y2, b2)

print((max_x - min_x)*(max_y - min_y))
