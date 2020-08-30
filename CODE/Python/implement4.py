def move(dx, dy, map1, drt):
    if drt == 0:
        if py-1 > -1 and map1[py-1][px] == 0:
            map1[py-1][px] = 2
            py-=1
    elif drt == 1:
        if px+1 < 5 and map1[py][px+1] == 0:
            map1[py][px+1] = 2
            px+=1
    elif drt == 2:
        if py+1 < 5 and map1[py+1][px] == 0:
            map1[py+1][px] = 2
            py+=1
    elif drt == 3:
        if px-1 > -1 and map1[py][px-1] == 0:
            map1[py][px-1] = 2
            px-=1
    return px, py
map1 = []
count = 0
dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]
y, x = map(int, input().split())
py, px, drt=map(int, input().split())
for _ in range(y):
    map1.append(list(map(int, input().split())))

map1[py][px]=2
count+=1
while True:
    fcount=0
    for _ in range(4): 
        if drt == 0:
            drt = 4
        drt-=1
        if drt == 0:
            if py-1 > -1 and map1[py-1][px] == 0:
                map1[py-1][px] = 2
                py-=1
                count+=1
                break
        elif drt == 1:
            if px+1 < 5 and map1[py][px+1] == 0:
                map1[py][px+1] = 2
                px+=1
                count+=1
                break
        elif drt == 2:
            if py+1 < 5 and map1[py+1][px] == 0:
                map1[py+1][px] = 2
                py+=1
                count+=1
                break
        elif drt == 3:
            if px-1 > -1 and map1[py][px-1] == 0:
                map1[py][px-1] = 2
                px-=1
                count+=1
                break
        fcount+=1
    if fcount == 4:
        if drt == 2:
            temp=0
        elif drt ==1:
            temp=3
        elif drt == 3:
            temp=1
        elif drt == 0:
            temp=2
        if map1[py+dy[temp]][px+dx[temp]] == 1:
            break
        else:
            py+=dy[temp]
            px+=dx[temp]
           
    
print(count)
