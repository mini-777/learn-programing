num_str=input()
sec=0
for a in range(len(num_str)):
    if num_str[a] == 'A' or num_str[a] == 'B' or num_str[a] == 'C':
        sec+=3
    if num_str[a] == 'D' or num_str[a] == 'E' or num_str[a] == 'F':
        sec+=4
    elif num_str[a] == 'G' or num_str[a] == 'H' or num_str[a] == 'I':
        sec+=5
    elif num_str[a] == 'J' or num_str[a] == 'K' or num_str[a] == 'L':
        sec+=6
    elif num_str[a] == 'M' or num_str[a] == 'N' or num_str[a] == 'O':
        sec+=7
    elif num_str[a] == 'P' or num_str[a] == 'Q' or num_str[a] == 'R' or num_str[a] == 'S':
        sec+=8
    elif num_str[a] == 'T' or num_str[a] == 'U' or num_str[a] == 'V':
        sec+=9
    elif num_str[a] == 'W' or num_str[a] == 'X' or num_str[a] == 'Y' or num_str[a] == 'Z':
        sec+=10

print(sec)
#노가다 같지만 이게 정답;;     
