import turtle as t
t.shape('turtle')
t.pu()
t.goto(0, -100)
t.pd()
for i in range(4):
    t.circle(100, 180)
    t.rt(90)
t.pu()
t.goto(-100, -100)
t.pd()
t.fillcolor('yellow')
t.begin_fill()
t.circle(100)
t.end_fill()
t.ht()
stop = input()
