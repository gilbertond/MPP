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
public interface Polygon extends ClosedCurve{
    public double[] getSides();
    
    @Override
    public default double computePerimeter(){
        double per = 0.0;
        for (int i = 0; i < getSides().length; i++) {
            per += getSides()[i];
        }
        return per;
    }
}
