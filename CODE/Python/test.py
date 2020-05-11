import turtle as t
t.shape('turtle')
t.pencolor('yellow')
t.fillcolor('blue')
t.bgcolor('black')
t.pensize(10)
t.begin_fill()
for i in range(5):
    t.fd(200)
    t.lt(144)

t.end_fill()
t.ht()
stop=input()