import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-np.pi, np.pi, 200)
y = np.zeros(len(x))

labels = ['Zero Order', 'Second Order', 'Fourth Order', 'Sixth Order']

plt.figure(figsize = (10,8))
for n, label in zip(range(4), labels):
     y = y + ((-1)**n * (x)**(2*n)) / np.math.factorial(2*n) ##each degree of taylor polynomial
     plt.plot(x,y, label = label)

plt.plot(x, np.cos(x), 'k', label = 'Analytic Cosine') ##actual graph
plt.grid()
plt.title('Taylor Series Approximations of Various Orders')
plt.xlabel('x')
plt.ylabel('y')
plt.legend()
plt.show()