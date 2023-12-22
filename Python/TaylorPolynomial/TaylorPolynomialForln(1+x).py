import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-np.pi, np.pi, 200)
y = np.zeros(len(x))

labels = ['First Order', 'Third Order', 'Fifth Order', 'Seventh Order']

plt.figure(figsize = (10,8))
for n, label in zip(range(1,4), labels):
    a = (-1)**n / n
    y = y + a * (x**n)
    plt.plot(x,y, label = label)

plt.plot(x, np.log1p(x), 'k', label = 'Analytic ln(x+1)') ##actual graph
plt.grid()
plt.title('Taylor Series Approximations of Various Orders')
plt.xlabel('x')
plt.ylabel('y')
plt.legend()
plt.show()