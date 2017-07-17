/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.lesson10.prob2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author gilberto
 */
public class Prob2 {

    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {

        T val1 = list.get(0);
        T val2 = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(val1) < 0) {
                val2 = val1;
                val1 = list.get(i);
            } else if(list.get(i).compareTo(val2) < 0 && list.get(i) != val1) {
                val2 = list.get(i);
            }
        }
        return val2;
    }

    public static void main(String[] args) {
        List<Integer> testInts = Arrays.asList(94, 13, 2, 100);
        List<String> testStrings = Arrays.asList("Hello", "Potato", "Happiness");
        
        System.out.println("Test Integers \n" + secondSmallest(testInts));
        System.out.println("Test String \n" + secondSmallest(testStrings));
    }
}
