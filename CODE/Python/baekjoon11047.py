n, k=map(int, input().split())
arr=[]
num=0
for a in range(n):
  arr.append(int(input()))
for a in range(n-1, -1, -1):
  if k == 0:
    break
  if arr[a] > k:
    continue
  num+= k//arr[a]
  k%=arr[a]
  
print(num)
#밑에서 부터 더한다
#더했는데 k 보다 크면 다시 빼고 다음 값을 더한다
#k 와 값이 같아질때까지 count를 올리면서 반복문을 실행한다