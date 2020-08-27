import time

a = int(input())
time1 = time.time()
count = 0
for i in range(a+1):
    if i % 10 == 3:
        count += 3600
        continue
    for j in range(60):
        if j % 10 == 3 or j // 10 == 3:
            count += 60
            continue
        for k in range(60):
            if k % 10 == 3 or k // 10 == 3:
                count+=1
time2 = time.time()
print(count)
print("time : ", time2 - time1)