n, m, k = map(int, input().split())
arr = list(map(int, input().split()))

arr.sort()
arr.reverse()
first = arr[0]
second = arr[1]
result = 0
count = 0
for a in range(m):
  if count == k:
    result += second
    count = 0
  else:
    result += first
    count += 1

print(result)