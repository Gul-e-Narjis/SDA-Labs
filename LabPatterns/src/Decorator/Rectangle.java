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
public class Rectangle implements shape {

    private double price = 10.0; // base price for Rectangle

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public double computeCost() {
        return price;
    }
}
