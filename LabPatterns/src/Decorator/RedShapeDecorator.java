/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author SP23-BSE-011
 */
public class RedShapeDecorator extends ShapeDecorator {

    private double redBorderPrice = 5.0; // price for red border decoration

    public RedShapeDecorator(shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
        // Show the cost after drawing
        System.out.println("Total Cost: " + computeCost());
    }

    private void setRedBorder(shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

    @Override
    public double computeCost() {
        // Add the cost of red border to the shape's cost
        return decoratedShape.computeCost() + redBorderPrice;
    }
}
