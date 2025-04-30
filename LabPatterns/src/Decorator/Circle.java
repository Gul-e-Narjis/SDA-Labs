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
public class Circle implements shape {

    private double price = 15.0; // base price for Circle

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double computeCost() {
        return price;
    }
}
