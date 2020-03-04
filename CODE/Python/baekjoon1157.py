word=list(input())
count=[]
whatif=0
for b in range(len(word)):
    if ord(word[b]) >= 97:
        word[b]=chr(ord(word[b])-32)
for a in range(65, 91):
    count.append(word.count(chr(a)))
for b in range(25):
    if max(count) == count[b]:
        whatif+=1
maxnum=count.index(max(count))+65
if whatif >= 2:
    print('?')
else:
    print(chr(maxnum))
   

