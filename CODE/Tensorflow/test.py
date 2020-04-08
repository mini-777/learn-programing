# def compare_string(a, b):
#   if len(a) > len(b):
#     return a
#   else:
#     return b

# def game369(num):
#   if num%3==0:
#     return "짝!"
#   elif "3" in str(num):
#     return "짝!"
#   else:
#     return num
  

# def make_list(size):
#   import random
#   A=[]
#   for i in range(size):
#     A.append(random.randint(0,100))
#   return A


def random_pop(num):
  import random
  a=[i for i in range(num)]
  random.shuffle(a)
  for _ in range(num):
    print(a.pop())

k=100
random_pop(k)