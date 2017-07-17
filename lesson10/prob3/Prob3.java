/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.lesson10.prob3;
import java.util.*;
/**
 *
 * @author gilberto
 */
public class Prob3 {

    public static double sumOfCollection(Collection<? extends Number> numbers) {
        double seed = 0.0;
        for (Number number : numbers) {
            seed += number.doubleValue();
        }

        return seed;
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(4, 2, 9, 7, 5);
        System.out.println("Result 1: " + sumOfCollection(list1));

        List<Double> list2 = Arrays.asList(4.8, 1.5, 6.6, 7.0);
        System.out.println("Result 2: " + sumOfCollection(list2));
    }
}
