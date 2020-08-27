arr = []
x, y= map(int, input().split())
for a in range(x):
    arr.append(list(map(int, input().split())))
for a in range(x):
    arr[a].sort()
arr2=[]
for a in range(x):
    arr2.append(arr[a][0])

print(max(arr2))
