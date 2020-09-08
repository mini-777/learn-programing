def dfs(i, j, arr, dn, dm):
    if (i >= 0 and i < dn) and (j >= 0 and j < dm):
        if arr[i][j] == '0':
            arr[i][j] = '1'
            dfs(i, j+1, arr, dn, dm)
            dfs(i+1, j, arr, dn, dm)
            dfs(i-1, j, arr, dn, dm)
            dfs(i, j-1, arr, dn, dm)
            return True
        else:
            return False




count = 0
n, m = map(int, input().split())
arr=[]
dn, dm = n, m
for _ in range(n):
    arr.append(list(input()))

for i in range(n):
    for j in range(m):
        if dfs(i, j, arr, dn, dm):
            count+=1


print(count)