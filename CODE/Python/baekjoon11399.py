i=int(input())
k=list(map(int, input().split()))
k.sort()
value=0
for a in range(i+1):
  value+=sum(k[:a:])

print(value)