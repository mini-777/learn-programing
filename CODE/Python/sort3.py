n, k = map(int, input().split())
a=list(map(int, input().split()))
b=list(map(int, input().split()))

for _ in range(k):
    if min(a) >= max(b):
        break
    else:
        temp = min(a)
        a[a.index(temp)] = max(b)
        b[b.index(max(b))] = temp

print(a, b, sum(a))