import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-np.pi, np.pi, 200)
y = np.zeros(len(x))

labels = ['First Order', 'Second Order', 'Third Order', 'Fourth Order']

plt.figure(figsize = (10,8))
for n, label in zip(range(4), labels):
     y = y + x**n / np.math.factorial(n) ##each degree of taylor polynomial
     plt.plot(x,y, label = label)

plt.plot(x, np.exp(x), 'k', label = 'Analytic e to the x') ##actual graph
plt.grid()
plt.title('Taylor Series Approximations of Various Orders')
plt.xlabel('x')
plt.ylabel('y')
plt.legend()
plt.show()