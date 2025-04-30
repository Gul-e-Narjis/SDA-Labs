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
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        shape circle = new Circle();
        shape redCircle = new RedShapeDecorator(new Circle());
        shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Total Cost: " + circle.computeCost());

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}
