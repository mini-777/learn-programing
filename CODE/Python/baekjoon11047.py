n, k=map(int, input().split())
arr=[]
count=0
num=0
complete=1
for a in range(n):
  arr.append(int(input()))
arr.reverse()
for a in range(n):
  while True:
    num+=arr[a]
    if num == k:
      complete=0
      count+=1
      break
    elif num > k:
      num-=arr[a]
      break
    count+=1
  if complete == 0:
    break
print(count)
#밑에서 부터 더한다
#더했는데 k 보다 크면 다시 빼고 다음 값을 더한다
#k 와 값이 같아질때까지 count를 올리면서 반복문을 실행한다