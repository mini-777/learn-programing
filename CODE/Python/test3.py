import turtle as t
t.shape('turtle')

def draw_petal(degree, color, size):
    t.lt(degree)
    t.begin_fill()
    t.color(color)
    t.circle(size, 60)
    t.lt(120)
    t.circle(size, 60)
    t.end_fill()

def draw_stem(degree, length, color):
    t.rt(degree)
    t.pensize(10)
    t.color(color)
    t.fd(length)
    t.bk(length)
    t.lt(degree)
def draw_center(size, color):
    t.goto(0,-size)
    t.color(color)
    t.begin_fill()
    t.circle(size)
    t.end_fill()

n=5
draw_stem(90, 300, 'green')
t.pensize(2)
for i in range(n):
    draw_petal(0, 'red', 150)
    t.home()
    t.lt((360/n)*(i+1))
draw_center(15, 'yellow')
t.pu()
t.rt(90)
t.fd(250)
t.pd()
draw_petal(80, 'yellowgreen', 200)
draw_petal(-100, 'yellowgreen', 200)
t.ht()
stop=input()