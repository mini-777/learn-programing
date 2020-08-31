n = int(input())
arr = []
for _ in range(n):
    arr.append(list(input().split()))

arr = sorted(arr, key=lambda x : int(x[1]))
for i in range(n):
    print(arr[i][0], end=' ')

