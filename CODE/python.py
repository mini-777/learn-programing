from tkinter import *

window=Tk()
window.title("커피 주문 계산")

e=Entry(window, width=40, bg="yellow", fg="black", bd=5)
e.grid(row=0, column=0, columnspan=5)
arr=[]
buttons=[
    '아메리카노(Hot)', '카페라테(Hot)', '카푸치노(Hot)',
    '아메리카노(Ice)', '카페라테(Ice)', '카푸치노(Ice)',
    '카라멜마끼아또', '핫초코', '레모네이드',
    '자몽에이드', '주문', '지움'
]
pay=[
    3000, 4000, 4000,
    4000, 4000, 4000,
    4000, 3000, 4000,
    4000 
]

def click(key, arr):
    if key == '주문':
        allof=sum(arr)
        e.delete(0, END)
        e.insert(0,allof)
        arr.clear()
    elif key == '지움':
        e.delete(0, END)
        arr.clear()
    else:
        arr.append(key)
        e.insert(END, key)

row=1
col=0

for text in buttons:
    if (buttons.index(text) == 10) or (buttons.index(text) == 11):
        k=text
    else:
        k=pay[buttons.index(text)]
    def process(t=k):
        click(t, arr)
    b=Button(window, text=text, width=7, height=3, command=process)
    b.grid(row=row, column=col)
    col +=1
    if col > 4:
        row += 1
        col =0

window.mainloop()