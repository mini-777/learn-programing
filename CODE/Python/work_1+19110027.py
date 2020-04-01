h, w=map(int, input().split())
bmi=w/(int(h/100)^2)
if bmi < 18.5:
  print('말랏다')
elif bmi < 25 and bmi >= 18.5:
  print('보통')
elif bmi < 35 and bmi >= 25:
  print('약간 뚱뚱하다')
elif bmi >35:
  print('아주 뚱뚱하다')



# a, b=map(int, input().split())
# print('x<%f' %(b/a))

# import math
# print((int(input())**2)*math.pi)

# sex = input('성별을 입력하시오. (여성-->F, 남성 --> M')
# grade=int(input('학년을 입력하시오 :'))
# if sex == 'F':
#   print('진리관에 배정되었습니다.')
# elif grade == 1 or grade == 2:
#   print('정의관에 배정되었습니다.')
# elif grade == 3 or grade == 4:
#   print('창조관에 배정되었습니다.')
# else:
#   print('입력오류입니다.')