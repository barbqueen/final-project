import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from mpl_toolkits import mplot3d
from sklearn.linear_model import LinearRegression

fileName = "MultipleLinearRegression.csv"
data = pd.read_csv(fileName)

X = data[['x', 'y']].values.reshape(-1, 2)
Y = data['z']

model = LinearRegression()
model.fit(X, Y)

x_fit = np.linspace(0, 21, 1000)
y_fit = x_fit
z_fit = model.predict(np.column_stack((x_fit, y_fit)))

fig = plt.figure(figsize=[15, 15])
subplots = [fig.add_subplot(2, 2, i + 1, projection='3d') for i in range(4)]
view_angles = [(30, 30), (30, -30), (60, 30), (90, 0)]

for subplot, angles in zip(subplots, view_angles):
    subplot.scatter(data['x'], data['y'], data['z'], cmap='jet', label='Data Points')
    subplot.set_xlabel('X')
    subplot.set_ylabel('Y')
    subplot.set_zlabel('Z')
    subplot.view_init(elev=angles[0], azim=angles[1])

cbar_ax = fig.add_axes([0.95, 0.15, 0.02, 0.7])
cbar = fig.colorbar(plt.cm.ScalarMappable(cmap='jet'), cax=cbar_ax)
cbar.set_label('Color Intensity')

plt.tight_layout()

fig = plt.figure(figsize=[15, 15])
subplots = [fig.add_subplot(2, 2, i + 1, projection='3d') for i in range(4)]

for subplot, angles in zip(subplots, view_angles):
    subplot.scatter(data['x'], data['y'], data['z'], cmap='jet', label='Data Points')
    subplot.plot(x_fit, y_fit, z_fit, label='Regression Line', color='red')
    subplot.set_xlabel('X')
    subplot.set_ylabel('Y')
    subplot.set_zlabel('Z')
    subplot.view_init(elev=angles[0], azim=angles[1])

cbar_ax = fig.add_axes([0.95, 0.15, 0.02, 0.7])
cbar = fig.colorbar(plt.cm.ScalarMappable(cmap='jet'), cax=cbar_ax)
cbar.set_label('Color Intensity')

plt.tight_layout()

print("Model Coefficients:", model.coef_)
print("Model Intercept:", model.intercept_)

plt.show()
