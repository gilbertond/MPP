/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.lesson7.prob2;

/**
 *
 * @author gilberto
 */
public class EquilateralTriangle implements Polygon {
    private final double side;
    private final double[] sides;

    public EquilateralTriangle(double side) {
        this.side = side;
        sides = new double[]{side, side, side};
    }
        
    @Override
    public double[] getSides() {        
        return (double[])sides.clone();
    }
}
