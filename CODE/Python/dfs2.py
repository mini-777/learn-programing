n, m = map(int, input().split())

graph=[]
for i in range(n):
    graph.append(list(map(int, input().split())))
def dfs(x, y):
    

result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            result += 1

print(result)