/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.lesson9.prob6;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 *
 * @author gilberto
 */
public class Prob6 {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B"));
        Set<String> set2 = new HashSet<>(Arrays.asList("D"));
        Set<String> set3 = new HashSet<>(Arrays.asList("1", "3", "5"));
        
        Prob6 prob6 = new Prob6();
        List<Set<String>> li = new ArrayList<>(Arrays.asList(set1, set2, set3));
        
        System.out.println(prob6.union(li));
    }
    public Set<String> union(List<Set<String>> sets) {
        Set<String> merger = sets.stream()
                        .reduce((x, y)-> Stream.concat(x.stream(),y.stream())
                        .collect(Collectors.toCollection(LinkedHashSet::new)))
                        .get();
        merger.forEach(System.out::println);
        
//        Set<String> s = sets.stream().reduce((x, y) -> x.);
        return merger;
    }
}
