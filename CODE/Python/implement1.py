n = int(input())
arr = list(input().split())
x, y = 1, 1
for a in arr:
    if a == 'R':
        if y+1 <= n:
            y += 1
    elif a == 'L':
        if y-1 >= 1:
            y -= 1
    elif a == 'U':
        if x-1 >= 1:
            x -= 1
    elif a == 'D':
        if x+1 <= n:
            x += 1

print(x, y)
