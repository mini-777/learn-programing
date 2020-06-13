import csv

import matplotlib.pyplot as plt

 

f=open('seoul.csv')

data=csv.reader(f)

next(data)

result=[]

 

for row in data:

    if row[-1] != '':
        if row[0].split('-')[1]=='07' :
            result.append(float(row[-1]))

 

plt.plot(result, 'r.',label='circle')

plt.legend()

plt.show()

 