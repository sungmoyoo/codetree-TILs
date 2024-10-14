x = int(input())

time = 0
left_distance = x
speed = 1

while True:
  left_distance -= speed
  time += 1

  if left_distance == 0:
    break

  if left_distance >= (speed + 1) * (speed +2) / 2:
    speed += 1
  
  elif left_distance >= speed * (speed+1) / 2:
    pass 
  
  else:
    speed -= 1

print(time)