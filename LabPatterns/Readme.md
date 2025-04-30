# Project Overview

This project demonstrates the application of the **Decorator Pattern** in a Java program, where we are enhancing shapes with decorations and managing encoding with decorators. The key changes include the introduction of price attributes for shapes and decorations, as well as the addition of the **UTF8Decorator** to ensure proper encoding/decoding of data.

## Key Changes

### 1. **Price Attribute for Shapes**
- Each shape class (`Rectangle` and `Circle`) now has a `price` attribute that determines the base cost of the shape.
- The `computeCost()` method in the `Shape` interface has been updated to calculate the cost based on the price of the shape.

### 2. **Price Attribute for Decorations**
- The `RedShapeDecorator` now includes an additional price (`redBorderPrice`) which is added to the base shape's price.
- The `computeCost()` method of the decorator calculates the total cost by adding the base shape's cost to the decoration's cost.

### 3. **Modified `draw()` Method**
- The `draw()` method of `RedShapeDecorator` now prints out the total cost after calling the `computeCost()` method. This provides a display of the shape's total cost including the decoration.

---

## Explanation of New Decorators

### 1. **UTF8Decorator**
The **UTF8Decorator** is a new decorator class that ensures data is encoded in UTF-8 before being written and decoded as UTF-8 when it is read. It overrides the `writeData` and `readData` methods to perform the encoding and decoding.

#### Key Changes in UTF8Decorator:
- **writeData()**: Ensures that data is encoded in UTF-8 before writing.
  ```java
  public void writeData(String data) {
      byte[] encodedData = data.getBytes("UTF-8");
      // Logic to write encoded data
  }
