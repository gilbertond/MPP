/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.lesson10.prob1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author gilberto
 */
public class Capture {

    public static void reverse(List<?> list) {
        helperMethod(list);
    }

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Java", "MPP", "SE");
        reverse(myList);
        System.out.println(myList);
    }

    private static <T> void helperMethod(List<T> list) {
        List<T> tempList = list;
        int x = 0;
        for (int i = tempList.size() - 1; i >= 0; i--) {
            T set = list.set(x++, list.get(i));
        }
    }
}
