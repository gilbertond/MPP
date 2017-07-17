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
public class Ellipse implements ClosedCurve {

    private final double a;
    private final double E;

    public Ellipse(double a, double E) {
        this.a = a;
        this.E = E;
    }
    
    @Override
    public double computePerimeter() {
        return 4 * (a * E);
    }
}
