x = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h']
y = ['1', '2', '3', '4', '5', '6', '7', '8']
move_x = [-2, -2, 2, 2, -1, -1, 1, 1]
move_y = [1, -1, 1, -1, 2, -2, 2, -2]
i = input()
count = 0
nx = x.index(i[0])
ny = y.index(i[1])

for a in range(8):
    if (nx + move_x[a]) >= 0 and (nx + move_x[a]) < 8:
        if (ny + move_y[a]) >= 0 and (ny + move_y[a]) < 8:
            count += 1

print(count)